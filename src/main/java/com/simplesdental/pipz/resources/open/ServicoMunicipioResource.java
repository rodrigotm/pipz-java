package com.simplesdental.pipz.resources.open;

import java.io.IOException;
import java.util.List;

import com.google.api.client.http.HttpResponse;
import com.simplesdental.pipz.helpers.Json;
import com.simplesdental.pipz.helpers.request.Request;
import com.simplesdental.pipz.helpers.request.RequestError;
import com.simplesdental.pipz.models.open.ServicoMunicipio;

public class ServicoMunicipioResource {

	public final static String SERVICOS_V1 = "v1/servicos";
	public final static String SEARCH_PARAM = "search";

	public static List<ServicoMunicipio> list(String token, Integer cityCode) {
		try {
			String resource = String.format(SERVICOS_V1, cityCode);
			Request request = Request.resource(resource).auth(token);

			HttpResponse response = request.send();

			if (response.isSuccessStatusCode()) {
				return Json.fromJsonList(response.parseAsString(), ServicoMunicipio.class);
			}

			throw new RequestError(response.getStatusCode());
		} catch (IOException e) {
			e.printStackTrace();
			throw new RequestError(e.getMessage());
		}
	}

	public static List<ServicoMunicipio> listByTerm(String token, Integer cityCode, String term) {
		try {

			String resource = Request.path(SERVICOS_V1, cityCode, SEARCH_PARAM, term);
			Request request = Request.resource(resource).auth(token);

			HttpResponse response = request.send();

			if (response.isSuccessStatusCode()) {
				return Json.fromJsonList(response.parseAsString(), ServicoMunicipio.class);
			}

			throw new RequestError(response.getStatusCode());
		} catch (IOException e) {
			e.printStackTrace();
			throw new RequestError(e.getMessage());
		}
	}

	public static ServicoMunicipio retrieve(String token, Integer cityCode, String serviceCode) {
		try {

			String resource = Request.path(SERVICOS_V1, cityCode, serviceCode);
			Request request = Request.resource(resource).auth(token);

			HttpResponse response = request.send();

			if (response.isSuccessStatusCode()) {
				return Json.fromJson(response.parseAsString(), ServicoMunicipio.class);
			}

			throw new RequestError(response.getStatusCode());
		} catch (IOException e) {
			e.printStackTrace();
			throw new RequestError(e.getMessage());
		}
	}
}

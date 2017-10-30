package com.simplesdental.pipz.resources.open;

import java.io.IOException;
import java.util.List;

import com.google.api.client.http.HttpResponse;
import com.simplesdental.pipz.helpers.Json;
import com.simplesdental.pipz.helpers.request.Request;
import com.simplesdental.pipz.helpers.request.RequestError;
import com.simplesdental.pipz.models.open.Cnae;

public class CnaeResource {

	public final static String CNAES_V1 = "v1/cnaes";
	public final static String SEARCH_PARAM = "search";

	public static List<Cnae> listCnaesByDescription(String token, String text) {
		try {
			String resource = Request.path(CNAES_V1, SEARCH_PARAM, text);
			Request request = Request.resource(resource).auth(token);

			HttpResponse response = request.send();

			if (response.isSuccessStatusCode()) {
				return Json.fromJsonList(response.parseAsString(), Cnae.class);
			}

			throw new RequestError(response.getStatusCode());
		} catch (IOException e) {
			e.printStackTrace();
			throw new RequestError(e.getMessage());
		}
	}

	public static Cnae retrieve(String token, String code) {
		try {
			String resource = Request.path(CNAES_V1, code);
			Request request = Request.resource(resource).auth(token);

			HttpResponse response = request.send();

			if (response.isSuccessStatusCode()) {
				return Json.fromJson(response.parseAsString(), Cnae.class);
			}

			throw new RequestError(response.getStatusCode());
		} catch (IOException e) {
			e.printStackTrace();
			throw new RequestError(e.getMessage());
		}
	}
}

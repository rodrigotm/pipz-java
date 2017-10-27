package com.simplesdental.nfe.resources.open;

import java.io.IOException;
import java.util.List;

import com.google.api.client.http.HttpResponse;
import com.simplesdental.nfe.helpers.Json;
import com.simplesdental.nfe.helpers.request.Request;
import com.simplesdental.nfe.helpers.request.RequestError;
import com.simplesdental.nfe.models.open.CountryBase;

public class CountryResource {

	public final static String COUNTRIES_V1 = "v1/countries";

	public static List<CountryBase> list(String token) {
		try {
			Request request = Request.resource(COUNTRIES_V1).auth(token);

			HttpResponse response = request.send();

			if (response.isSuccessStatusCode()) {
				return Json.fromJsonList(response.parseAsString(), CountryBase.class);
			}

			throw new RequestError(response.getStatusCode());
		} catch (IOException e) {
			e.printStackTrace();
			throw new RequestError(e.getMessage());
		}
	}

	public static CountryBase retrieve(String token, String isoCode) {
		try {
			String resource = Request.path(COUNTRIES_V1, isoCode);
			Request request = Request.resource(resource).auth(token);

			HttpResponse response = request.send();

			if (response.isSuccessStatusCode()) {
				return Json.fromJson(response.parseAsString(), CountryBase.class);
			}

			throw new RequestError(response.getStatusCode());
		} catch (IOException e) {
			e.printStackTrace();
			throw new RequestError(e.getMessage());
		}
	}
}

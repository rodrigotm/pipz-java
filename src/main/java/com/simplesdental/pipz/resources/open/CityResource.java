package com.simplesdental.pipz.resources.open;

import java.io.IOException;
import java.util.List;

import com.google.api.client.http.HttpResponse;
import com.simplesdental.pipz.helpers.Json;
import com.simplesdental.pipz.helpers.request.Request;
import com.simplesdental.pipz.helpers.request.RequestError;
import com.simplesdental.pipz.models.open.CityBase;

public class CityResource {

	public final static String CITIES_V1 = "v1/cities";
	public final static String STATES_V1 = "v1/states/%s/cities";

	public static List<CityBase> listCitiesByState(String token, String stateAbbreviation) {
		try {
			String resource = String.format(STATES_V1, stateAbbreviation);
			Request request = Request.resource(resource).auth(token);

			HttpResponse response = request.send();

			if (response.isSuccessStatusCode()) {
				return Json.fromJsonList(response.parseAsString(), CityBase.class);
			}

			throw new RequestError(response.getStatusCode());
		} catch (IOException e) {
			e.printStackTrace();
			throw new RequestError(e.getMessage());
		}
	}

	public static CityBase retrieveCity(String token, String cityCode) {
		try {

			String resource = Request.path(CITIES_V1, cityCode);
			Request request = Request.resource(resource).auth(token);

			HttpResponse response = request.send();

			if (response.isSuccessStatusCode()) {
				return Json.fromJson(response.parseAsString(), CityBase.class);
			}

			throw new RequestError(response.getStatusCode());
		} catch (IOException e) {
			e.printStackTrace();
			throw new RequestError(e.getMessage());
		}
	}

	public static List<CityBase> searchCities(String token, String term) {
		try {
			String resource = Request.path(CITIES_V1, "search", term);
			Request request = Request.resource(resource).auth(token);

			HttpResponse response = request.send();

			if (response.isSuccessStatusCode()) {
				return Json.fromJsonList(response.parseAsString(), CityBase.class);
			}

			throw new RequestError(response.getStatusCode());
		} catch (IOException e) {
			e.printStackTrace();
			throw new RequestError(e.getMessage());
		}
	}
}

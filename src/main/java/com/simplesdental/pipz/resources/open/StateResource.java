package com.simplesdental.pipz.resources.open;

import java.io.IOException;
import java.util.List;

import com.google.api.client.http.HttpResponse;
import com.simplesdental.pipz.helpers.Json;
import com.simplesdental.pipz.helpers.request.Request;
import com.simplesdental.pipz.helpers.request.RequestError;
import com.simplesdental.pipz.models.open.StateBase;

public class StateResource {

	public final static String STATES_V1 = "v1/states";

	public static List<StateBase> list(String token) {
		try {
			Request request = Request.resource(STATES_V1).auth(token);

			HttpResponse response = request.send();

			if (response.isSuccessStatusCode()) {
				return Json.fromJsonList(response.parseAsString(), StateBase.class);
			}

			throw new RequestError(response.getStatusCode());
		} catch (IOException e) {
			e.printStackTrace();
			throw new RequestError(e.getMessage());
		}
	}

	public static StateBase retrieve(String token, String uf) {
		try {
			String resource = Request.path(STATES_V1, uf);
			Request request = Request.resource(resource).auth(token);

			HttpResponse response = request.send();

			if (response.isSuccessStatusCode()) {
				return Json.fromJson(response.parseAsString(), StateBase.class);
			}

			throw new RequestError(response.getStatusCode());
		} catch (IOException e) {
			e.printStackTrace();
			throw new RequestError(e.getMessage());
		}
	}
}

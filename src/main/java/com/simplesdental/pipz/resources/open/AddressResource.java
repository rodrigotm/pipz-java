package com.simplesdental.pipz.resources.open;

import java.io.IOException;

import com.google.api.client.http.HttpResponse;
import com.simplesdental.pipz.helpers.Json;
import com.simplesdental.pipz.helpers.request.Request;
import com.simplesdental.pipz.helpers.request.RequestError;
import com.simplesdental.pipz.models.open.AddressBase;

public class AddressResource {

	public final static String RESOURCE_V1 = "v1/addresses";

	public static AddressBase retrieve(String token, String postalCode) {
		try {
			String resource = Request.path(RESOURCE_V1, postalCode);
			Request request = Request.resource(resource).auth(token);

			HttpResponse response = request.send();

			if (response.isSuccessStatusCode()) {
				return Json.fromJson(response.parseAsString(), AddressBase.class);
			}

			throw new RequestError(response.getStatusCode());
		} catch (IOException e) {
			e.printStackTrace();
			throw new RequestError(e.getMessage());
		}
	}
}

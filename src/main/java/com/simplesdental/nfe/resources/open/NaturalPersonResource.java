package com.simplesdental.nfe.resources.open;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.google.api.client.http.HttpResponse;
import com.simplesdental.nfe.helpers.Json;
import com.simplesdental.nfe.helpers.request.Request;
import com.simplesdental.nfe.helpers.request.RequestError;
import com.simplesdental.nfe.models.open.NaturalPersonBase;

public class NaturalPersonResource {

	public final static String NATURAL_PEOPLE_V1 = "v1/naturalpeople";

	public static NaturalPersonBase retrieve(String token, String cpf, Date birthDate) {
		try {
			String resource = Request.path(NATURAL_PEOPLE_V1, cpf, new SimpleDateFormat("yyyy-MM-dd").format(birthDate));
			Request request = Request.resource(resource).auth(token);

			HttpResponse response = request.send();

			if (response.isSuccessStatusCode()) {
				return Json.fromJson(response.parseAsString(), NaturalPersonBase.class);
			}

			throw new RequestError(response.getStatusCode());
		} catch (IOException e) {
			e.printStackTrace();
			throw new RequestError(e.getMessage());
		}
	}
}

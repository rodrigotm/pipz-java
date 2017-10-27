package com.simplesdental.nfe.resources.open;

import java.io.IOException;

import com.google.api.client.http.HttpResponse;
import com.simplesdental.nfe.helpers.Json;
import com.simplesdental.nfe.helpers.request.Request;
import com.simplesdental.nfe.helpers.request.RequestError;
import com.simplesdental.nfe.models.open.LegalPersonBase;

public class LegalPersonResource {

	public final static String LEGAL_PERSONS_V1 = "v1/legalpersons";

	public static LegalPersonBase retrieve(String token, String cnpj) {
		try {
			String resource = Request.path(LEGAL_PERSONS_V1, cnpj);
			Request request = Request.resource(resource).auth(token);

			HttpResponse response = request.send();

			if (response.isSuccessStatusCode()) {
				return Json.fromJson(response.parseAsString(), LegalPersonBase.class);
			}

			throw new RequestError(response.getStatusCode());
		} catch (IOException e) {
			e.printStackTrace();
			throw new RequestError(e.getMessage());
		}
	}
}

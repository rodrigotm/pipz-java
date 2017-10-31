package com.simplesdental.pipz.resources;

import java.io.IOException;

import com.google.api.client.http.HttpMethods;
import com.google.api.client.http.HttpResponse;
import com.simplesdental.pipz.helpers.Json;
import com.simplesdental.pipz.helpers.request.Request;
import com.simplesdental.pipz.helpers.request.RequestAuth;
import com.simplesdental.pipz.helpers.request.RequestError;
import com.simplesdental.pipz.models.Contact;

public class ContactResource {

	public final static String RESOURCE_V1 = "v1/contact";

	public static Contact create(RequestAuth auth, Contact contact) {
		try {
			Request request = Request.resource(RESOURCE_V1).method(HttpMethods.POST).auth(auth).body(Json.toString(contact));
			HttpResponse response = request.send();

			if (response.isSuccessStatusCode()) {
				return Json.fromJson(response.parseAsString(), Contact.class);
			}

			throw new RequestError(response.getStatusCode());
		} catch (IOException e) {
			e.printStackTrace();
			throw new RequestError(e.getMessage());
		}
	}

	public static Contact update(RequestAuth auth, String idContact, Contact contact) {
		try {

			String resource = Request.path(RESOURCE_V1, idContact);

			Request request = Request.resource(resource).method(HttpMethods.PATCH).auth(auth).body(Json.toString(contact));
			HttpResponse response = request.send();

			if (response.isSuccessStatusCode()) {
				return Json.fromJson(response.parseAsString(), Contact.class);
			}

			throw new RequestError(response.getStatusCode());
		} catch (IOException e) {
			e.printStackTrace();
			throw new RequestError(e.getMessage());
		}
	}

	public static HttpResponse delete(RequestAuth auth, String idContact) {
		try {

			String resource = Request.path(RESOURCE_V1, idContact);

			Request request = Request.resource(resource).method(HttpMethods.POST).auth(auth);
			HttpResponse response = request.send();

			if (response.isSuccessStatusCode()) {
				return response;
			}

			throw new RequestError(response.getStatusCode());
		} catch (IOException e) {
			e.printStackTrace();
			throw new RequestError(e.getMessage());
		}
	}

}

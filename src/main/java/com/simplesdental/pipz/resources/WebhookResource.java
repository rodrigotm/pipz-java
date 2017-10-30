package com.simplesdental.pipz.resources;

import java.io.IOException;

import com.google.api.client.http.HttpMethods;
import com.google.api.client.http.HttpResponse;
import com.simplesdental.pipz.helpers.Json;
import com.simplesdental.pipz.helpers.request.Request;
import com.simplesdental.pipz.helpers.request.RequestError;
import com.simplesdental.pipz.models.Webhook;
import com.simplesdental.pipz.models.WebhookCollection;
import com.simplesdental.pipz.models.WebhookSingle;

public class WebhookResource {
	public final static String RESOURCE_V1 = "v1/hooks";

	public static Webhook create(String token, WebhookSingle webhookSingle) {
		try {
			Request request = Request.resource(RESOURCE_V1).method(HttpMethods.POST).auth(token).body(Json.toString(webhookSingle));
			HttpResponse response = request.send();

			if (response.isSuccessStatusCode()) {
				return Json.fromJson(response.parseAsString(), Webhook.class);
			}

			throw new RequestError(response.getStatusCode());
		} catch (IOException e) {
			e.printStackTrace();
			throw new RequestError(e.getMessage());
		}
	}

	public static Boolean delete(String token, Long idWebhook) {
		try {
			String resource = Request.path(RESOURCE_V1, idWebhook);
			Request request = Request.resource(resource).method(HttpMethods.DELETE).auth(token);
			HttpResponse response = request.send();

			if (response.isSuccessStatusCode()) {
				return true;
			}

			throw new RequestError(response.getStatusCode());
		} catch (IOException e) {
			e.printStackTrace();
			throw new RequestError(e.getMessage());
		}
	}

	public static WebhookCollection list(String token) {
		try {
			Request request = Request.resource(RESOURCE_V1).auth(token);

			HttpResponse response = request.send();

			if (response.isSuccessStatusCode()) {
				return Json.fromJson(response.parseAsString(), WebhookCollection.class);
			}

			throw new RequestError(response.getStatusCode());
		} catch (IOException e) {
			e.printStackTrace();
			throw new RequestError(e.getMessage());
		}
	}

	public static WebhookSingle retrieve(String token, Integer idWebhook) {
		try {
			String resource = Request.path(RESOURCE_V1, idWebhook);
			Request request = Request.resource(resource).auth(token);
			HttpResponse response = request.send();

			if (response.isSuccessStatusCode()) {
				return Json.fromJson(response.parseAsString(), WebhookSingle.class);
			}

			throw new RequestError(response.getStatusCode());
		} catch (IOException e) {
			e.printStackTrace();
			throw new RequestError(e.getMessage());
		}
	}

	public static Webhook update(String auth, Integer idWebhook, WebhookSingle webhookSingle) {
		try {
			String resource = Request.path(RESOURCE_V1, idWebhook);
			HttpResponse response = Request.resource(resource).method(HttpMethods.PUT).auth(auth).body(Json.toString(webhookSingle)).send();

			if (response.isSuccessStatusCode()) {
				return Json.fromJson(response.parseAsString(), Webhook.class);
			}

			throw new RequestError(response.getStatusCode());
		} catch (IOException e) {
			e.printStackTrace();
			throw new RequestError(e.getMessage());
		}
	}

}

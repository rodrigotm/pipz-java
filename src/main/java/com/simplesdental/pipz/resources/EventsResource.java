package com.simplesdental.pipz.resources;

import java.io.IOException;

import com.google.api.client.http.HttpMethods;
import com.google.api.client.http.HttpResponse;
import com.simplesdental.pipz.helpers.Json;
import com.simplesdental.pipz.helpers.request.Request;
import com.simplesdental.pipz.helpers.request.RequestAuth;
import com.simplesdental.pipz.helpers.request.RequestError;
import com.simplesdental.pipz.models.IdentifyEvent;
import com.simplesdental.pipz.models.TrackEvent;

public class EventsResource {

	public final static String RESOURCE_V1 = "v1/event";

	public static HttpResponse identify(RequestAuth auth, IdentifyEvent identifyEvent) {
		try {
			Request request = Request.resource(RESOURCE_V1).method(HttpMethods.POST).auth(auth).body(Json.toString(identifyEvent));
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

	public static HttpResponse track(TrackEvent trackEvent) {
		try {
			Request request = Request.resource(RESOURCE_V1, true).method(HttpMethods.POST).body(Json.toString(trackEvent));
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

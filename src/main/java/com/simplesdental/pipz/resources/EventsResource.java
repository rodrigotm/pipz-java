package com.simplesdental.pipz.resources;

import java.io.IOException;
import java.util.concurrent.Future;

import com.google.api.client.http.HttpMethods;
import com.google.api.client.http.HttpResponse;
import com.simplesdental.pipz.helpers.Json;
import com.simplesdental.pipz.helpers.request.Request;
import com.simplesdental.pipz.helpers.request.RequestError;
import com.simplesdental.pipz.models.IdentifyEvent;
import com.simplesdental.pipz.models.TrackEvent;

public class EventsResource {

	public final static String RESOURCE_V1 = "v1/event";

	public static Future<HttpResponse> identify(IdentifyEvent identifyEvent) {
		try {
			Request request = Request.resource(RESOURCE_V1, true).method(HttpMethods.POST).body(Json.toString(identifyEvent));
			return request.sendAsync();

		} catch (IOException e) {
			e.printStackTrace();
			throw new RequestError(e.getMessage());
		}
	}

	public static Future<HttpResponse> track(TrackEvent trackEvent) {
		try {
			Request request = Request.resource(RESOURCE_V1, true).method(HttpMethods.POST).body(Json.toString(trackEvent));
			return request.sendAsync();

		} catch (IOException e) {
			e.printStackTrace();
			throw new RequestError(e.getMessage());
		}
	}
}

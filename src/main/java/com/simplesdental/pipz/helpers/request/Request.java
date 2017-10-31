package com.simplesdental.pipz.helpers.request;

import java.io.IOException;

import com.google.api.client.http.BasicAuthentication;
import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpHeaders;
import com.google.api.client.http.HttpMethods;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpResponse;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.http.MultipartContent;
import com.google.api.client.http.javanet.NetHttpTransport;

public class Request {
	public static HttpTransport HTTP_TRANSPORT = new NetHttpTransport();
	public static final String API = "https://api.pipz.io";
	public static final String API_OPEN = "https://app.pipz.io";

	public static String createResourceUri(String resource) {
		return createResourceUri(resource, false);
	}

	public static String createResourceUri(String resource, boolean openApi) {
		if (!openApi) {
			return path(getApiUri(), resource);
		}
		return path(getOpenApiUri(), resource);
	}

	public static String getApiUri() {
		return API;
	}

	public static String getOpenApiUri() {
		return API_OPEN;
	}

	public static Request openResource(String resource) throws IOException {
		return new Request(resource);
	}

	public static String path(Object origin, Object... dest) {
		StringBuffer sb = new StringBuffer(origin.toString());
		for (Object object : dest) {
			sb.append("/" + object);
		}
		return sb.toString();
	}

	public static Request resource() throws IOException {
		return resource("");
	}

	public static Request resource(String resource) throws IOException {
		return new Request(resource);
	}

	public static Request resource(String resource, boolean openApi) throws IOException {
		return new Request(resource, openApi);
	}

	private HttpRequest request;
	private GenericUrl url;

	private Request(String resource) throws IOException {
		this.url = new GenericUrl(createResourceUri(resource));
		this.request = HTTP_TRANSPORT.createRequestFactory().buildGetRequest(this.url);
	}

	private Request(String resource, boolean openApi) throws IOException {
		this.url = new GenericUrl(createResourceUri(resource, openApi));
		this.request = HTTP_TRANSPORT.createRequestFactory().buildGetRequest(this.url);
	}

	public Request addParam(String key, Object value) throws IOException {
		this.url.set(key, value);
		return this;
	}

	public Request addHeader(String fieldName, Object value) {
		HttpHeaders h = new HttpHeaders();
		h.set(fieldName, value);
		this.request.setHeaders(h);
		return this;
	}

	public Request auth(RequestAuth auth) throws IOException {
		BasicAuthentication basicAuthentication = new BasicAuthentication(auth.email, auth.token);
		basicAuthentication.initialize(this.request);
		return this;
	}

	public Request body() {
		this.request.setContent(null);
		return this;
	}

	public Request body(String content) {
		this.request.setContent(new RequestContent(content));
		return this;
	}

	public Request method(String method) {
		this.request.setRequestMethod(method);

		if (method.equals(HttpMethods.GET)) {
			this.request.setContent(null);
		}

		return this;
	}

	public Request multipartContentBody(MultipartContent content) {
		this.request.setContent(content);
		return this;
	}

	public HttpResponse send() throws IOException {
		return this.request.execute();
	}

}

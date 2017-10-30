package com.simplesdental.pipz.test.utils;

import com.google.api.client.testing.http.MockLowLevelHttpRequest;

public class RequestMock {
	public MockLowLevelHttpRequest httpRequest;
	public String method;
	public String url;

	public RequestMock(String method, String url, MockLowLevelHttpRequest httpRequest) {
		this.method = method;
		this.url = url;
		this.httpRequest = httpRequest;
	}
}

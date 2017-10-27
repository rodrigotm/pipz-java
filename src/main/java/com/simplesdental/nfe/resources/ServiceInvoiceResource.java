package com.simplesdental.nfe.resources;

import java.io.IOException;

import com.google.api.client.http.HttpMethods;
import com.google.api.client.http.HttpResponse;
import com.simplesdental.nfe.helpers.Json;
import com.simplesdental.nfe.helpers.request.Request;
import com.simplesdental.nfe.helpers.request.RequestError;
import com.simplesdental.nfe.models.DateRange;
import com.simplesdental.nfe.models.ServiceInvoice;
import com.simplesdental.nfe.models.ServiceInvoiceCollection;
import com.simplesdental.nfe.models.ServiceInvoiceIssueMessage;

public class ServiceInvoiceResource {
	public final static String RESOURCE_V1 = "v1/companies/%s/serviceinvoices/%s";
	private static final String RESOURCE_SENDMAIL = RESOURCE_V1 + "/sendmail";
	private static final String RESOURCE_PDF = RESOURCE_V1 + "/pdf";
	private static final String RESOURCE_XML = RESOURCE_V1 + "/xml";
	private static final String RESOURCE_PULL = "v1/companies/%s/serviceinvoices/pull";
	private static final String PAGE_COUNT_PARAM = "pageCount";
	private static final String PAGE_INDEX_PARAM = "pageIndex";

	public static ServiceInvoiceIssueMessage create(String token, String idCompany, ServiceInvoice serviceInvoice) {
		try {
			String resource = String.format(RESOURCE_V1, idCompany);

			Request request = Request.resource(resource).method(HttpMethods.POST).auth(token).body(Json.toString(serviceInvoice));
			HttpResponse response = request.send();

			if (response.isSuccessStatusCode()) {
				return Json.fromJson(response.parseAsString(), ServiceInvoiceIssueMessage.class);
			}

			throw new RequestError(response.getStatusCode());
		} catch (IOException e) {
			e.printStackTrace();
			throw new RequestError(e.getMessage());
		}
	}

	public static Boolean delete(String token, String idCompany, String idServiceInvoice) {
		try {

			String resource = String.format(RESOURCE_V1, idCompany, idServiceInvoice);

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

	// TODO conferir se os params são na verdade: perPage e page
	// Ver se dá de passar o status (none (todas), issued (emitidas), cancelled, error)
	public static ServiceInvoiceCollection list(String token, String idCompany, Integer pageCount, Integer pageIndex) {
		try {
			String resource = String.format(RESOURCE_V1, idCompany);
			Request request = Request.resource(resource).auth(token);

			if (pageCount != null) {
				request.addParam(PAGE_COUNT_PARAM, pageCount);
			}
			if (pageIndex != null) {
				request.addParam(PAGE_INDEX_PARAM, pageIndex);
			}

			HttpResponse response = request.send();

			if (response.isSuccessStatusCode()) {
				return Json.fromJson(response.parseAsString(), ServiceInvoiceCollection.class);
			}

			throw new RequestError(response.getStatusCode());
		} catch (IOException e) {
			e.printStackTrace();
			throw new RequestError(e.getMessage());
		}
	}

	// TODO conferir retorno
	public static ServiceInvoiceCollection pull(String auth, String idCompany, DateRange dateRange) {
		try {
			String resource = Request.path(RESOURCE_PULL, idCompany);
			HttpResponse response = Request.resource(resource).method(HttpMethods.PUT).auth(auth).body(Json.toString(dateRange)).send();

			if (response.isSuccessStatusCode()) {
				return Json.fromJson(response.parseAsString(), ServiceInvoiceCollection.class);
			}

			throw new RequestError(response.getStatusCode());
		} catch (IOException e) {
			e.printStackTrace();
			throw new RequestError(e.getMessage());
		}
	}

	public static ServiceInvoice retrieve(String token, String idCompany, String idServiceInvoice) {
		try {
			String resource = String.format(RESOURCE_V1, idCompany, idServiceInvoice);

			Request request = Request.resource(resource).auth(token);

			HttpResponse response = request.send();

			if (response.isSuccessStatusCode()) {
				return Json.fromJson(response.parseAsString(), ServiceInvoice.class);
			}

			throw new RequestError(response.getStatusCode());
		} catch (IOException e) {
			e.printStackTrace();
			throw new RequestError(e.getMessage());
		}
	}

	public static Boolean retrievePdf(String token, String idCompany, String idServiceInvoice) {
		try {
			String resource = String.format(RESOURCE_PDF, idCompany, idServiceInvoice);

			Request request = Request.resource(resource).auth(token);

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

	public static Boolean retrieveXml(String token, String idCompany, String idServiceInvoice) {
		try {
			String resource = String.format(RESOURCE_XML, idCompany, idServiceInvoice);

			Request request = Request.resource(resource).auth(token);

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

	public static Boolean sendEmail(String auth, String idCompany, String idServiceInvoice) {
		try {
			String path = String.format(RESOURCE_SENDMAIL, idCompany, idServiceInvoice);
			String resource = Request.path(path, idServiceInvoice);

			HttpResponse response = Request.resource(resource).method(HttpMethods.PUT).auth(auth).body().send();

			if (response.isSuccessStatusCode()) {
				return true;
			}

			throw new RequestError(response.getStatusCode());
		} catch (IOException e) {
			e.printStackTrace();
			throw new RequestError(e.getMessage());
		}
	}

}

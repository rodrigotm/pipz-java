package com.simplesdental.pipz.resources;

import java.io.File;
import java.io.IOException;

import com.google.api.client.http.ByteArrayContent;
import com.google.api.client.http.FileContent;
import com.google.api.client.http.HttpHeaders;
import com.google.api.client.http.HttpMediaType;
import com.google.api.client.http.HttpMethods;
import com.google.api.client.http.HttpResponse;
import com.google.api.client.http.MultipartContent;
import com.simplesdental.pipz.helpers.Json;
import com.simplesdental.pipz.helpers.request.Request;
import com.simplesdental.pipz.helpers.request.RequestError;
import com.simplesdental.pipz.models.Company;
import com.simplesdental.pipz.models.CompanyCollection;
import com.simplesdental.pipz.models.CompanySingle;
import com.simplesdental.pipz.models.LegalPersonCollection;
import com.simplesdental.pipz.models.LegalPersonSingle;
import com.simplesdental.pipz.models.NaturalPersonCollection;
import com.simplesdental.pipz.models.NaturalPersonSingle;

public class CompanyResource {
	private static final String RESOURCE_CERTIFICATE = "certificate";
	private static final String RESOURCE_LEGAL_PEOPLE = "legalpeople";
	private static final String RESOURCE_NATURAL_PEOPLE = "naturalpeople";
	public final static String RESOURCE_V1 = "v1/companies";

	public static Company create(String token, CompanySingle companySingle) {
		try {
			Request request = Request.resource(RESOURCE_V1).method(HttpMethods.POST).auth(token).body(Json.toString(companySingle));
			HttpResponse response = request.send();

			if (response.isSuccessStatusCode()) {
				return Json.fromJson(response.parseAsString(), Company.class);
			}

			throw new RequestError(response.getStatusCode());
		} catch (IOException e) {
			e.printStackTrace();
			throw new RequestError(e.getMessage());
		}
	}

	public static Boolean delete(String token, String idCompany) {
		try {
			String resource = Request.path(RESOURCE_V1, idCompany);
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

	public static CompanyCollection list(String token) {
		try {
			Request request = Request.resource(RESOURCE_V1).auth(token);
			HttpResponse response = request.send();

			if (response.isSuccessStatusCode()) {
				return Json.fromJson(response.parseAsString(), CompanyCollection.class);
			}

			throw new RequestError(response.getStatusCode());
		} catch (IOException e) {
			e.printStackTrace();
			throw new RequestError(e.getMessage());
		}
	}

	public static LegalPersonCollection listLegalPeople(String token, String idCompany) {
		try {

			String path = Request.path(RESOURCE_V1, idCompany);
			String resource = Request.path(path, RESOURCE_LEGAL_PEOPLE);

			Request request = Request.resource(resource).auth(token);

			HttpResponse response = request.send();

			if (response.isSuccessStatusCode()) {
				return Json.fromJson(response.parseAsString(), LegalPersonCollection.class);
			}

			throw new RequestError(response.getStatusCode());
		} catch (IOException e) {
			e.printStackTrace();
			throw new RequestError(e.getMessage());
		}
	}

	public static NaturalPersonCollection listNaturalPeople(String token, String idCompany) {
		try {

			String path = Request.path(RESOURCE_V1, idCompany);
			String resource = Request.path(path, RESOURCE_NATURAL_PEOPLE);

			Request request = Request.resource(resource).auth(token);

			HttpResponse response = request.send();

			if (response.isSuccessStatusCode()) {
				return Json.fromJson(response.parseAsString(), NaturalPersonCollection.class);
			}

			throw new RequestError(response.getStatusCode());
		} catch (IOException e) {
			e.printStackTrace();
			throw new RequestError(e.getMessage());
		}
	}

	public static CompanySingle retrieve(String token, Integer taxNumber) {
		try {
			String resource = Request.path(RESOURCE_V1, taxNumber);
			Request request = Request.resource(resource).auth(token);
			HttpResponse response = request.send();

			if (response.isSuccessStatusCode()) {
				return Json.fromJson(response.parseAsString(), CompanySingle.class);
			}

			throw new RequestError(response.getStatusCode());
		} catch (IOException e) {
			e.printStackTrace();
			throw new RequestError(e.getMessage());
		}
	}

	public static CompanySingle retrieve(String token, String idCompany) {
		try {
			String resource = Request.path(RESOURCE_V1, idCompany);
			Request request = Request.resource(resource).auth(token);
			HttpResponse response = request.send();

			if (response.isSuccessStatusCode()) {
				return Json.fromJson(response.parseAsString(), CompanySingle.class);
			}

			throw new RequestError(response.getStatusCode());
		} catch (IOException e) {
			e.printStackTrace();
			throw new RequestError(e.getMessage());
		}
	}

	public static LegalPersonSingle retrieveLegalPerson(String token, String idCompany, String idLegalPerson) {
		try {

			String path = Request.path(RESOURCE_V1, idCompany);
			path = Request.path(path, RESOURCE_LEGAL_PEOPLE);
			String resource = Request.path(path, idLegalPerson);

			Request request = Request.resource(resource).auth(token);

			HttpResponse response = request.send();

			if (response.isSuccessStatusCode()) {
				return Json.fromJson(response.parseAsString(), LegalPersonSingle.class);
			}

			throw new RequestError(response.getStatusCode());
		} catch (IOException e) {
			e.printStackTrace();
			throw new RequestError(e.getMessage());
		}
	}

	public static NaturalPersonSingle retrieveNaturalPerson(String token, String idCompany, String idNaturalPerson) {
		try {

			String path = Request.path(RESOURCE_V1, idCompany);
			path = Request.path(path, RESOURCE_NATURAL_PEOPLE);
			String resource = Request.path(path, idNaturalPerson);

			Request request = Request.resource(resource).auth(token);

			HttpResponse response = request.send();

			if (response.isSuccessStatusCode()) {
				return Json.fromJson(response.parseAsString(), NaturalPersonSingle.class);
			}

			throw new RequestError(response.getStatusCode());
		} catch (IOException e) {
			e.printStackTrace();
			throw new RequestError(e.getMessage());
		}
	}

	public static Company update(String auth, String idCompany, CompanySingle companySingle) {
		try {
			String resource = Request.path(RESOURCE_V1, idCompany);
			HttpResponse response = Request.resource(resource).method(HttpMethods.PUT).auth(auth).body(Json.toString(companySingle)).send();

			if (response.isSuccessStatusCode()) {
				return Json.fromJson(response.parseAsString(), Company.class);
			}

			throw new RequestError(response.getStatusCode());
		} catch (IOException e) {
			e.printStackTrace();
			throw new RequestError(e.getMessage());
		}
	}

	public static Boolean uploadCertificate(String auth, String idCompany, File file, String password, String contentType) {
		try {

			MultipartContent content = new MultipartContent().setMediaType(new HttpMediaType("multipart/form-data"));

			// Password
			MultipartContent.Part part = new MultipartContent.Part(new ByteArrayContent(null, password.getBytes()));
			part.setHeaders(new HttpHeaders().set("Content-Disposition", "form-data; name=\"password\""));
			content.addPart(part);

			// File
			FileContent fileContent = new FileContent(contentType, file);
			MultipartContent.Part filePart = new MultipartContent.Part(fileContent);
			part.setHeaders(new HttpHeaders().set("Content-Disposition", String.format("form-data; name=\"file\"; filename=\"%s\"", file.getName())));
			content.addPart(filePart);

			String path = Request.path(RESOURCE_V1, idCompany);
			String resource = Request.path(path, RESOURCE_CERTIFICATE);

			HttpResponse response = Request.resource(resource).method(HttpMethods.POST).auth(auth).multipartContentBody(content).send();

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

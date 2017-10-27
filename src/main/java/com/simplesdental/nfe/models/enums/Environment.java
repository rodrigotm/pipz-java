package com.simplesdental.nfe.models.enums;

public enum Environment {
	DEVELOPMENT("Development"), PRODUCTION("Production"), STAGING("Staging");
	public String value;

	private Environment(String value) {
		this.value = value;
	}
}

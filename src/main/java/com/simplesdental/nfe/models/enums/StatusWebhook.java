package com.simplesdental.nfe.models.enums;

public enum StatusWebhook {
	INACTIVE("Inactive"), ACTIVE("Active");

	public String value;

	private StatusWebhook(String value) {
		this.value = value;
	}
}
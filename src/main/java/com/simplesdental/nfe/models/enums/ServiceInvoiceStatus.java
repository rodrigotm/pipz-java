package com.simplesdental.nfe.models.enums;

public enum ServiceInvoiceStatus {
	ERROR("Error"), NONE("None"), CREATED("Created"), ISSUED("Issued"), CANCELLED("Cancelled");

	public String value;

	private ServiceInvoiceStatus(String value) {
		this.value = value;
	}
}
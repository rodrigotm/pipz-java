package com.simplesdental.nfe.models.enums;

public enum FiscalStatus {
	CITY_NOT_SUPPORTED("CityNotSupported"), PENDING("Pending"), INACTIVE("Inactive"), NONE("None"), ACTIVE("Active");

	public String value;

	private FiscalStatus(String value) {
		this.value = value;
	}
}

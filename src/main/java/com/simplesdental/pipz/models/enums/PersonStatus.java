package com.simplesdental.pipz.models.enums;

public enum PersonStatus {
	ACTIVE("Active"), INACTIVE("Inactive"), NONE("None");

	public String value;

	private PersonStatus(String value) {
		this.value = value;
	}
}
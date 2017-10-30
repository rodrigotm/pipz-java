package com.simplesdental.pipz.models.enums;

public enum PersonType {
	NENHUM("Nenhum"), NATURAL_PERSON("NaturalPerson"), LEGAL_PERSON("LegalPerson"), COMPANY("Company"), CUSTOMER("Customer");

	public String value;

	private PersonType(String value) {
		this.value = value;
	}
}
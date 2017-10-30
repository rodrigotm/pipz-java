package com.simplesdental.pipz.models.enums;

public enum RpsType {
	RPS("Rps"), RPS_MISTA("RpsMista"), CUPOM("Cupom");

	public String value;

	private RpsType(String value) {
		this.value = value;
	}
}
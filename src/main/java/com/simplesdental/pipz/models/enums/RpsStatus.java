package com.simplesdental.pipz.models.enums;

public enum RpsStatus {
	// TODO na documentação está canceled só com 1 'L'
	NORMAL("Normal"), CANCELED("Canceled"), LOST("Lost");

	public String value;

	private RpsStatus(String value) {
		this.value = value;
	}
}
package com.simplesdental.pipz.models.enums;

public enum EventType {
	IDENTIFY("identify"), TRACK("track");

	private final String value;

	EventType(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

}
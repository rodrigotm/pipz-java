package com.simplesdental.pipz.models;

import java.util.HashMap;

import com.fasterxml.jackson.databind.JsonNode;
import com.simplesdental.pipz.helpers.Json;

/**
 * @author rodrigoteixeira
 *
 */
public class Event extends HashMap<String, Object> {

	private static final long serialVersionUID = 1L;

	public Event() {

	}

	/**
	 * @param eventName
	 *            The name to event
	 * @param json
	 *            Properties to event
	 */
	public void addEvent(String eventName, JsonNode json) {
		if (json == null) {
			new Json();
			json = Json.newObject();
		}
		this.put(eventName, json);
	}

}
package com.simplesdental.pipz.models;

import java.util.HashMap;

/**
 * @author rodrigoteixeira
 *
 */
public class CustomAtribute extends HashMap<String, Object> {

	private static final long serialVersionUID = 1L;

	public CustomAtribute() {

	}

	/**
	 * @param eventName
	 * @param json
	 */
	public void addAtribute(String atributeName, Object object) {
		this.put(atributeName, object);
	}

}
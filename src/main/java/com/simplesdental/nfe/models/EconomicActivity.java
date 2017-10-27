package com.simplesdental.nfe.models;

public class EconomicActivity {
	public enum Type {
		MAIN("Main"), SECONDARY("Secondary");

		public String value;

		private Type(String value) {
			this.value = value;
		}
	}

	public Type type;
	public Integer code;
}
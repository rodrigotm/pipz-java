package com.simplesdental.pipz.models;

import java.io.File;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class CompanyCertificate {
	public enum Status {
		OVERDUE("Overdue"), PENDING("Pending"), NONE("None"), ACTIVE("Active");

		public String value;

		private Status(String value) {
			this.value = value;
		}
	}

	public String thumbprint;
	public Date modifiedOn;
	public Date expiresOn;
	public Status status;

	@JsonIgnore
	public File file;
}
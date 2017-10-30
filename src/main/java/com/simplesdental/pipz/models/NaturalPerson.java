package com.simplesdental.pipz.models;

import java.util.Date;

import com.simplesdental.pipz.models.enums.PersonStatus;

public class NaturalPerson {
	public String id;
	public String name;
	public Integer federalTaxNumber;
	public String email;
	public Date birthDate;
	public String idNumber;
	public PersonStatus status;
	public Date createdOn;

	public Date modifiedOn;
}

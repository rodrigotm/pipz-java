package com.simplesdental.nfe.models;

import java.util.Date;

import com.simplesdental.nfe.models.enums.PersonStatus;
import com.simplesdental.nfe.models.enums.PersonType;

public class Person {
	public String parentId;
	public String id;
	public String name;
	public Integer federalTaxNumber;
	public String email;
	public Address address;
	public PersonStatus status;
	public PersonType type;
	public Date createdOn;
	public Date modifiedOn;
}

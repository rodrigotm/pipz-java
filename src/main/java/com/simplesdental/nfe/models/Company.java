package com.simplesdental.nfe.models;

import java.util.Date;
import java.util.List;

import com.simplesdental.nfe.models.enums.Environment;
import com.simplesdental.nfe.models.enums.FiscalStatus;
import com.simplesdental.nfe.models.enums.LegalNature;
import com.simplesdental.nfe.models.enums.SpecialTaxRegime;
import com.simplesdental.nfe.models.enums.TaxRegime;

public class Company {

	public String id;
	public String name;
	public String tradeName;
	public Integer federalTaxNumber;
	public String email;
	public Address address;
	public Date openningDate;
	public TaxRegime taxRegime;
	public SpecialTaxRegime specialTaxRegime;
	public LegalNature legalNature;

	public List<EconomicActivity> economicActivities;
	public Integer companyRegistryNumber;

	public Integer regionalTaxNumber;
	public String municipalTaxNumber;
	public String rpsSerialNumber;

	public Integer rpsNumber;

	public Environment environment;
	public FiscalStatus fiscalStatus;
	public CompanyCertificate certificate;

	public Date createdOn;

	public Date modifiedOn;
}

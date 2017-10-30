package com.simplesdental.pipz.models;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import com.simplesdental.pipz.models.enums.LegalNature;
import com.simplesdental.pipz.models.enums.PersonStatus;
import com.simplesdental.pipz.models.enums.PersonType;
import com.simplesdental.pipz.models.enums.SpecialTaxRegime;
import com.simplesdental.pipz.models.enums.TaxRegime;

public class LegalPerson {

	public String tradeName;
	public Date openningDate;
	public TaxRegime taxRegime;
	public SpecialTaxRegime specialTaxRegime;
	public LegalNature legalNature;

	public List<EconomicActivity> economicActivities;

	public Integer companyRegistryNumber;
	public Integer regionalTaxNumber;
	public String municipalTaxNumber;

	public BigDecimal issRate;
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

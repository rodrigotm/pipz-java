package com.simplesdental.pipz.models;

import java.math.BigDecimal;
import java.util.Date;

import com.simplesdental.pipz.models.enums.Environment;
import com.simplesdental.pipz.models.enums.FlowStatus;
import com.simplesdental.pipz.models.enums.RpsStatus;
import com.simplesdental.pipz.models.enums.RpsType;
import com.simplesdental.pipz.models.enums.ServiceInvoiceStatus;
import com.simplesdental.pipz.models.enums.TaxationType;

public class ServiceInvoice {
	public String id;
	public Environment environment;
	public FlowStatus flowStatus;
	public String flowMessage;
	public LegalPerson provider;
	public Person borrower;

	public Integer batchNumber;
	public String batchCheckNumber;
	public Integer number;
	public String checkCode;

	public ServiceInvoiceStatus status;

	public RpsType rpsType;
	public RpsStatus rpsStatus;
	public TaxationType taxationType;

	public Date issuedOn;
	public Date cancelledOn;

	public String rpsSerialNumber;
	public Integer rpsNumber;

	public String cityServiceCode;
	public String federalServiceCode;
	public String description;
	public BigDecimal servicesAmount;
	public BigDecimal deductionsAmount;
	public BigDecimal discountUnconditionedAmount;
	public BigDecimal discountConditionedAmount;

	public BigDecimal baseTaxAmount;
	public BigDecimal issRate;
	public BigDecimal issTaxAmount;

	public BigDecimal irAmountWithheld;
	public BigDecimal pisAmountWithheld;
	public BigDecimal cofinsAmountWithheld;
	public BigDecimal csllAmountWithheld;
	public BigDecimal inssAmountWithheld;
	public BigDecimal issAmountWithheld;
	public BigDecimal othersAmountWithheld;

	public BigDecimal amountWithheld;
	public BigDecimal amountNet;

	public ServiceInvoiceApproximateTaxesResource approximateTax;

	public Date createdOn;
	public Date modifiedOn;
}

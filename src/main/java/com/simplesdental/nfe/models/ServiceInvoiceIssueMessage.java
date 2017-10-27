package com.simplesdental.nfe.models;

import java.math.BigDecimal;
import java.util.Date;

import com.simplesdental.nfe.models.enums.TaxationType;

public class ServiceInvoiceIssueMessage {
	public Borrower borrower;
	public String cityServiceCode;
	public String federalServiceCode;

	public String cnaeCode;
	public String description;

	public BigDecimal servicesAmount;

	public String rpsSerialNumber;

	public Date issuedOn;

	public Integer rpsNumber;
	public TaxationType taxationType;

	public BigDecimal issRate;
	public BigDecimal issTaxAmount;

	public BigDecimal deductionsAmount;
	public BigDecimal discountUnconditionedAmount;
	public BigDecimal discountConditionedAmount;

	public BigDecimal irAmountWithheld;
	public BigDecimal pisAmountWithheld;
	public BigDecimal cofinsAmountWithheld;
	public BigDecimal csllAmountWithheld;
	public BigDecimal inssAmountWithheld;
	public BigDecimal issAmountWithheld;
	public BigDecimal othersAmountWithheld;

	public ServiceInvoiceApproximateTaxesResource approximateTax;

}

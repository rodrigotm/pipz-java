package com.simplesdental.nfe.models.enums;

public enum FlowStatus {
	CANCEL_FAILED("CancelFailed"), ISSUE_FAILED("IssueFailed"), ISSUED("Issued"), CANCELLED("Cancelled"), PULL_FROM_CITY_HALL("PullFromCityHall"), WAITING_CALCULATE_TAXES(
			"WaitingCalculateTaxes"), WAITING_DEFINE_RPS_NUMBER(
					"WaitingDefineRpsNumber"), WAITING_SEND("WaitingSend"), WAITING_SEND_CANCEL("WaitingSendCancel"), WAITING_RETURN("WaitingReturn"), WAITING_DOWNLOAD("WaitingDownload");

	public String value;

	private FlowStatus(String value) {
		this.value = value;
	}
}
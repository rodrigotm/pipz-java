package com.simplesdental.nfe.models.enums;

public enum TaxationType {
	NONE("None"), WITHIN_CITY("WithinCity"), OUTSIDE_CITY("OutsideCity"), EXPORT("Export"), FREE("Free"), IMUNE("Immune"), SUSPEND_COURT_DECISION(
			"SuspendedCourtDecision"), SUSPEND_ADMINISTRATIVE_PROCEDURE("SuspendedAdministrativeProcedure"), OUTSIDE_CITY_FREE("OutsideCityFree"), OUTSIDE_CITY_IMUNE(
					"OutsideCityImmune"), OUTSIDE_CITY_SUSPENDED("OutsideCitySuspended"), OUTSIDE_CITY_SUSPENDED_ADMINISTRATIVE_PROCEDURE("OutsideCitySuspendedAdministrativeProcedure");

	public String value;

	private TaxationType(String value) {
		this.value = value;
	}

}

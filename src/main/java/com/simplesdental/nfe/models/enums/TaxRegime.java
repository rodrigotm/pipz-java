package com.simplesdental.nfe.models.enums;

public enum TaxRegime {
	ISENTO("Isento"), MEI("MicroempreendedorIndividual"), SIMPLES_NACIONAL("SimplesNacional"), LUCRO_PRESUMIDO("LucroPresumido"), LUCRO_REAL("LucroReal");

	public String value;

	private TaxRegime(String value) {
		this.value = value;
	}
}
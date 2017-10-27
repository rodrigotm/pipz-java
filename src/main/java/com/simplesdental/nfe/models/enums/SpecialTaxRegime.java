package com.simplesdental.nfe.models.enums;

public enum SpecialTaxRegime {
	AUTOMATICO("Automatico"), NENHUM("Nenhum"), MICROEMPRESA_MUNICIPAL("MicroempresaMunicipal"), LUCRO_REAL("LucroReal"), ESTIMATIVA("Estimativa"), SOCIEDADE_DE_PROFISSIONAIS(
			"SociedadeDeProfissionais"), COOPERATIVA(
					"Cooperativa"), MICROEMPREENDEDOR_INDIVIDUAL("MicroempreendedorIndividual"), MICROEMPRESARIO_E_EMPRESA_DE_PEQUENO_PORTE("MicroempresarioEmpresaPequenoPorte");

	public String value;

	private SpecialTaxRegime(String value) {
		this.value = value;
	}
}
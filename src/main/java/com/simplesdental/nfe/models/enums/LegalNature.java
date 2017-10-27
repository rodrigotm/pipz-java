package com.simplesdental.nfe.models.enums;

public enum LegalNature {
	EMPRESA_PUBLICA("EmpresaPublica"), SOCIEDADE_DE_ECONOMIA_MISTA("SociedadeEconomiaMista"), SOCIEDADE_ANONIMA_ABERTA("SociedadeAnonimaAberta"), SOCIEDADE_ANONIMA_FECHADA(
			"SociedadeAnonimaFechada"), SOCIEDADE_EMPRESARIA_LIMITADA("SociedadeEmpresariaLimitada"), SOCIEDADE_EMPRESARIA_EM_NOME_COLETIVO(
					"SociedadeEmpresariaEmNomeColetivo"), SOCIEDADE_EMPRESARIA_EM_COMANDITA_SIMPLES("SociedadeEmpresariaEmComanditaSimples"), SOCIEDADE_EMPRESARIA_EM_COMANDITA_POR_ACOES(
							"SociedadeEmpresariaEmComanditaporAcoes"), SOCIEDADE_EM_CONTA_DE_PARTICIPACAO("SociedadeemContaParticipacao"), EMPRESARIO_INDIVIDUAL(
									"Empresario"), COOPERATIVA("Cooperativa"), CONSORCIO_DE_SOCIEDADES("ConsorcioSociedades"), GRUPO_DE_SOCIEDADES("GrupoSociedades"), EMPRESA_DOMICILIADA_NO_EXTERIOR(
											"EmpresaDomiciliadaExterior"), CLUBE_FUNDO_DE_INVESTIMENTO("ClubeFundoInvestimento"), SOCIEDADE_SIMPLES_PURA(
													"SociedadeSimplesPura"), SOCIEDADE_SIMPLES_LIMITADA("SociedadeSimplesLimitada"), SOCIEDADE_SIMPLES_EM_NOME_COLETIVO(
															"SociedadeSimplesEmNomeColetivo"), SOCIEDADE_SIMPLES_EM_COMANDITA_SIMPLES("SociedadeSimplesEmComanditaSimples"), EMPRESA_BINACIONAL(
																	"EmpresaBinacional"), CONSORCIO_DE_EMPREGADORES("ConsorcioEmpregadores"), CONSORCIO_SIMPLES(
																			"ConsorcioSimples"), EMPRESA_INDIVIDUAL_DE_RESPONSABILIDADE_LIMITADA_DE_NATUREZA_EMPRESARIA(
																					"EireliNaturezaEmpresaria"), EMPRESA_INDIVIDUAL_DE_RESPONSABILIDADE_LIMITADA_DE_NATUREZA_SIMPLES(
																							"EireliNaturezaSimples"), SERVICO_NOTARIAL_E_REGISTRAL("ServicoNotarial"), FUNDACAO_PRIVADA(
																									"FundacaoPrivada"), SERVICO_SOCIAL_AUTONOMO("ServicoSocialAutonomo"), CONDOMINIO_EDILICIO(
																											"CondominioEdilicio"), COMISSAO_DE_CONCILIACAO_PREVIA(
																													"ComissaoConciliacaoPrevia"), ENTIDADE_DE_MEDIACAO_E_ARBITRAGEM(
																															"EntidadeMediacaoArbitragem"), PARTIDO_POLITICO(
																																	"PartidoPolitico"), ENTIDADE_SINDICAL(
																																			"EntidadeSindical"), ESTABELECIMENTO_NO_BRASIL_DE_FUNDACAO_OU_ASSOCIACAO_ESTRANGEIRAS(
																																					"EstabelecimentoBrasilFundacaoAssociacaoEstrangeiras"), FUNDACAO_OU_ASSOCIACAO_DOMICILIADA_NO_EXTERIOR(
																																							"FundacaoAssociacaoDomiciliadaExterior"), ORGANIZACAO_RELIGIOSA(
																																									"OrganizacaoReligiosa"), COMUNIDADE_INDIGENA(
																																											"ComunidadeIndigena"), FUNDO_PRIVADO(
																																													"FundoPrivado"), ASSOCIACAO_PRIVADA(
																																															"AssociacaoPrivada");

	public String value;

	private LegalNature(String value) {
		this.value = value;
	}
}
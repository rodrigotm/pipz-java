package com.simplesdental.pipz.models.open;

import java.util.Date;
import java.util.List;

import com.simplesdental.pipz.models.enums.TaxRegime;

public class LegalPersonBase {
	public class Endereco {
		public class Cidade {
			public Integer codigo;
			public String nome;
		}

		public String cep;
		public String logradouro;
		public String numero;
		public String complemento;
		public String bairro;

		public Cidade cidade;
		public String estado;
	}

	public String nomeFantasia;
	public String razaoSocial;
	public String cnpj;
	public Date dataAbertura;
	public TaxRegime regimeTributario;
	public Endereco endereco;
	public String atividadePrincipal;
	public List<String> atividadesSecundarias;
	public String naturezaJuridica;
	public Date dataSituacaoCadastral;
	public String situacaoCadastral;

	public Date dataCadastroSimplesNacional;
}

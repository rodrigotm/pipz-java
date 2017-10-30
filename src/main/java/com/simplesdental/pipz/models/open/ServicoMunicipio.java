package com.simplesdental.pipz.models.open;

import java.math.BigDecimal;
import java.util.Date;

public class ServicoMunicipio {

	public class Municipio {
		public Integer codigo;
		public String nome;
	}

	public String estado;
	public Municipio municipio;
	public String codigoCnae;
	public String codigoServicoFederal;
	public String codigoServicoMunicipal;
	public String codigoNbs;
	public String descricao;
	public BigDecimal aliquotaIss;
	public BigDecimal aliquotaRetencaoIr;
	public BigDecimal aliquotaRetencaoPis;
	public BigDecimal aliquotaRetencaoCofins;
	public BigDecimal aliquotaRetencaoCsl;
	public BigDecimal aliquotaRetencaoInss;
	public BigDecimal aliquotaRetencaoIss;
	public Date inicioVigencia;
}

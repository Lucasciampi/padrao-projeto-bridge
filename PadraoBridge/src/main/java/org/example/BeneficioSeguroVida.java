package org.example;

public class BeneficioSeguroVida extends Beneficio {

    public BeneficioSeguroVida() {
        super();
    }

    @Override
    public float calcularCustoParaEmpresa() {
        return getValorBase() * getCategoria().percentualCobertura() * 1.1f;
    }
}

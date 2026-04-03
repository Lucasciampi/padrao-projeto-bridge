package org.example;

public class BeneficioPlanoSaude extends Beneficio {

    public BeneficioPlanoSaude() {
        super();
    }

    @Override
    public float calcularCustoParaEmpresa() {
        return getValorBase() * getCategoria().percentualCobertura();
    }
}

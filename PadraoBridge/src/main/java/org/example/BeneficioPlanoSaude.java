package org.example;

public class BeneficioPlanoSaude extends Beneficio {

    public BeneficioPlanoSaude(float valorBase) {
        super(valorBase);
    }

    @Override
    public float calcularCustoParaEmpresa() {
        return getValorBase() * getCategoria().percentualCobertura();
    }
}

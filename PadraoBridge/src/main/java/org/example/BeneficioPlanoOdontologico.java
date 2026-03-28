package org.example;

public class BeneficioPlanoOdontologico extends Beneficio {

    public BeneficioPlanoOdontologico(float valorBase) {
        super(valorBase);
    }

    @Override
    public float calcularCustoParaEmpresa() {
        return getValorBase() * getCategoria().percentualCobertura();
    }
}

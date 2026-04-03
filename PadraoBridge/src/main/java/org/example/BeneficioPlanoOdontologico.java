package org.example;

public class BeneficioPlanoOdontologico extends Beneficio {

    public BeneficioPlanoOdontologico() {
        super();
    }

    @Override
    public float calcularCustoParaEmpresa() {
        return getValorBase() * getCategoria().percentualCobertura();
    }
}

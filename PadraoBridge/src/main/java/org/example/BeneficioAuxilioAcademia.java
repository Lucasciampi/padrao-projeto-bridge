package org.example;

public class BeneficioAuxilioAcademia extends Beneficio {

    public BeneficioAuxilioAcademia() {
        super();
    }

    @Override
    public float calcularCustoParaEmpresa() {
        return getValorBase() * getCategoria().percentualCobertura() * 0.5f;
    }
}

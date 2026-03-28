package org.example;

public class BeneficioAuxilioAcademia extends Beneficio {

    private static BeneficioAuxilioAcademia instance;

    private BeneficioAuxilioAcademia(float valorBase) {
        super(valorBase);
    }

    public static BeneficioAuxilioAcademia getInstance(float valorBase) {
        if (instance == null) {
            instance = new BeneficioAuxilioAcademia(valorBase);
        }
        return instance;
    }

    @Override
    public float calcularCustoParaEmpresa() {
        return getValorBase() * getCategoria().percentualCobertura() * 0.5f;
    }
}

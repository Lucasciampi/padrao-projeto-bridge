package org.example;

public class BeneficioSeguroVida extends Beneficio {

    private static BeneficioSeguroVida instance;

    private BeneficioSeguroVida(float valorBase) {
        super(valorBase);
    }

    public static BeneficioSeguroVida getInstance(float valorBase) {
        if (instance == null) {
            instance = new BeneficioSeguroVida(valorBase);
        }
        return instance;
    }

    @Override
    public float calcularCustoParaEmpresa() {
        return getValorBase() * getCategoria().percentualCobertura() * 1.1f;
    }
}

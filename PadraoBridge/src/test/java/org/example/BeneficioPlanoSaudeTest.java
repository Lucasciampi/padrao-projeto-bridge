package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BeneficioPlanoSaudeTest {

    static BeneficioPlanoSaude beneficioPlanoSaude;

    @BeforeEach
    void setUp() {
        beneficioPlanoSaude = new BeneficioPlanoSaude();
        beneficioPlanoSaude.setValorBase(100.0f);
    }

    @Test
    void deveRetornarValorPlanoSaudeBasico() {
        beneficioPlanoSaude.setCategoria(CategoriaBasico.getInstance());
        assertEquals(50.0f, beneficioPlanoSaude.calcularCustoParaEmpresa());
    }

    @Test
    void deveRetornarValorPlanoSaudeIntermediario() {
        beneficioPlanoSaude.setCategoria(CategoriaIntermediario.getInstance());
        assertEquals(75.0f, beneficioPlanoSaude.calcularCustoParaEmpresa());
    }

    @Test
    void deveRetornarValorPlanoSaudePremium() {
        beneficioPlanoSaude.setCategoria(CategoriaPremium.getInstance());
        assertEquals(100.0f, beneficioPlanoSaude.calcularCustoParaEmpresa());
    }

}
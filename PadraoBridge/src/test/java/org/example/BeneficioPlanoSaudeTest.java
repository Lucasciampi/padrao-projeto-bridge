package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BeneficioPlanoSaudeTest {

    static BeneficioPlanoSaude beneficioPlanoSaude;

    @BeforeEach
    void setUp() {
        beneficioPlanoSaude = new BeneficioPlanoSaude(100.0f);
    }

    @Test
    void deveRetornarValorPlanoSaudeBasico() {
        Categoria categoria = new CategoriaBasico();
        beneficioPlanoSaude.setCategoria(categoria);
        assertEquals(50.0f, beneficioPlanoSaude.calcularCustoParaEmpresa());
    }

    @Test
    void deveRetornarValorPlanoSaudeIntermediario() {
        Categoria categoria = new CategoriaIntermediario();
        beneficioPlanoSaude.setCategoria(categoria);
        assertEquals(75.0f, beneficioPlanoSaude.calcularCustoParaEmpresa());
    }

    @Test
    void deveRetornarValorPlanoSaudePremium() {
        Categoria categoria = new CategoriaPremium();
        beneficioPlanoSaude.setCategoria(categoria);
        assertEquals(100.0f, beneficioPlanoSaude.calcularCustoParaEmpresa());
    }

}
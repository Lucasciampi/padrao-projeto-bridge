package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BeneficioSeguroVidaTest {

    static BeneficioSeguroVida beneficioSeguroVida;

    @BeforeEach
     void setUp() {
        beneficioSeguroVida = new BeneficioSeguroVida();
        beneficioSeguroVida.setValorBase(100.0f);
    }

    @Test
    void deveRetornarValorSeguroVidaBasico() {
        beneficioSeguroVida.setCategoria(CategoriaBasico.getInstance());
        assertEquals(55.0f, beneficioSeguroVida.calcularCustoParaEmpresa());
    }

    @Test
    void deveRetornarValorSeguroVidaIntermediario() {
        beneficioSeguroVida.setCategoria(CategoriaIntermediario.getInstance());
        assertEquals(82.5f, beneficioSeguroVida.calcularCustoParaEmpresa());
    }

    @Test
    void deveRetornarValorSeguroVidaPremium() {
        beneficioSeguroVida.setCategoria(CategoriaPremium.getInstance());
        assertEquals(110.0f, beneficioSeguroVida.calcularCustoParaEmpresa());
    }

}
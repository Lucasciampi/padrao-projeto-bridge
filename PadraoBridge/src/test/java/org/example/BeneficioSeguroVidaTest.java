package org.example;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BeneficioSeguroVidaTest {

    static BeneficioSeguroVida beneficioSeguroVida;

    @BeforeAll
    static void setUp() {
        beneficioSeguroVida = BeneficioSeguroVida.getInstance(100.0f);
    }

    @Test
    void deveRetornarValorSeguroVidaBasico() {
        Categoria categoria = new CategoriaBasico();
        beneficioSeguroVida.setCategoria(categoria);
        assertEquals(55.0f, beneficioSeguroVida.calcularCustoParaEmpresa());
    }

    @Test
    void deveRetornarValorSeguroVidaIntermediario() {
        Categoria categoria = new CategoriaIntermediario();
        beneficioSeguroVida.setCategoria(categoria);
        assertEquals(82.5f, beneficioSeguroVida.calcularCustoParaEmpresa());
    }

    @Test
    void deveRetornarValorSeguroVidaPremium() {
        Categoria categoria = new CategoriaPremium();
        beneficioSeguroVida.setCategoria(categoria);
        assertEquals(110.0f, beneficioSeguroVida.calcularCustoParaEmpresa());
    }

}
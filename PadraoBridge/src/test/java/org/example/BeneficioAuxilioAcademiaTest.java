package org.example;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BeneficioAuxilioAcademiaTest {

    static BeneficioAuxilioAcademia beneficioAuxilioAcademia;

    @BeforeAll
    static void setUp() {
        beneficioAuxilioAcademia = BeneficioAuxilioAcademia.getInstance(100.0f);
    }

    @Test
    void deveRetornarValorAuxilioAcademiaBasico() {
        Categoria categoria = new CategoriaBasico();
        beneficioAuxilioAcademia.setCategoria(categoria);
        assertEquals(25.0f, beneficioAuxilioAcademia.calcularCustoParaEmpresa());
    }

    @Test
    void deveRetornarValorAuxilioAcademiaIntermediario() {
        Categoria categoria = new CategoriaIntermediario();
        beneficioAuxilioAcademia.setCategoria(categoria);
        assertEquals(37.5f, beneficioAuxilioAcademia.calcularCustoParaEmpresa());
    }

    @Test
    void deveRetornarValorAuxilioAcademiaPremium() {
        Categoria categoria = new CategoriaPremium();
        beneficioAuxilioAcademia.setCategoria(categoria);
        assertEquals(50.0f, beneficioAuxilioAcademia.calcularCustoParaEmpresa());
    }



}
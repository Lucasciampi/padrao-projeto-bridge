package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BeneficioAuxilioAcademiaTest {

    static BeneficioAuxilioAcademia beneficioAuxilioAcademia;

    @BeforeEach
     void setUp() {
        beneficioAuxilioAcademia = new BeneficioAuxilioAcademia();
        beneficioAuxilioAcademia.setValorBase(100.0f);
    }

    @Test
    void deveRetornarValorAuxilioAcademiaBasico() {
        beneficioAuxilioAcademia.setCategoria(CategoriaBasico.getInstance());
        assertEquals(25.0f, beneficioAuxilioAcademia.calcularCustoParaEmpresa());
    }

    @Test
    void deveRetornarValorAuxilioAcademiaIntermediario() {
        beneficioAuxilioAcademia.setCategoria(CategoriaIntermediario.getInstance());
        assertEquals(37.5f, beneficioAuxilioAcademia.calcularCustoParaEmpresa());
    }

    @Test
    void deveRetornarValorAuxilioAcademiaPremium() {
        beneficioAuxilioAcademia.setCategoria(CategoriaPremium.getInstance());
        assertEquals(50.0f, beneficioAuxilioAcademia.calcularCustoParaEmpresa());
    }
}
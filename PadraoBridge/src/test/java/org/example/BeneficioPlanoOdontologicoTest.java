package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BeneficioPlanoOdontologicoTest {

    static BeneficioPlanoOdontologico beneficioPlanoOdontologico;

    @BeforeEach
    void setUp() {
        beneficioPlanoOdontologico = new BeneficioPlanoOdontologico();
        beneficioPlanoOdontologico.setValorBase(100.0f);
    }

    @Test
    void deveRetornarValorPlanoOdontologicoBasico() {
        beneficioPlanoOdontologico.setCategoria(CategoriaBasico.getInstance());
        assertEquals(50.0f, beneficioPlanoOdontologico.calcularCustoParaEmpresa());
    }

    @Test
    void deveRetornarValorPlanoOdontologicoIntermediario() {
        beneficioPlanoOdontologico.setCategoria(CategoriaIntermediario.getInstance());
        assertEquals(75.0f, beneficioPlanoOdontologico.calcularCustoParaEmpresa());
    }

    @Test
    void deveRetornarValorPlanoOdontologicoPremium() {
        beneficioPlanoOdontologico.setCategoria(CategoriaPremium.getInstance());
        assertEquals(100.0f, beneficioPlanoOdontologico.calcularCustoParaEmpresa());
    }

}
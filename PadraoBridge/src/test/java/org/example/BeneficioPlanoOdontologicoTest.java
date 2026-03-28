package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BeneficioPlanoOdontologicoTest {

    static BeneficioPlanoOdontologico beneficioPlanoOdontologico;

    @BeforeEach
    void setUp() {
        beneficioPlanoOdontologico = new BeneficioPlanoOdontologico(100.0f);
    }

    @Test
    void deveRetornarValorPlanoOdontologicoBasico() {
        Categoria categoria = new CategoriaBasico();
        beneficioPlanoOdontologico.setCategoria(categoria);
        assertEquals(50.0f, beneficioPlanoOdontologico.calcularCustoParaEmpresa());
    }

    @Test
    void deveRetornarValorPlanoOdontologicoIntermediario() {
        Categoria categoria = new CategoriaIntermediario();
        beneficioPlanoOdontologico.setCategoria(categoria);
        assertEquals(75.0f, beneficioPlanoOdontologico.calcularCustoParaEmpresa());
    }

    @Test
    void deveRetornarValorPlanoOdontologicoPremium() {
        Categoria categoria = new CategoriaPremium();
        beneficioPlanoOdontologico.setCategoria(categoria);
        assertEquals(100.0f, beneficioPlanoOdontologico.calcularCustoParaEmpresa());
    }

}
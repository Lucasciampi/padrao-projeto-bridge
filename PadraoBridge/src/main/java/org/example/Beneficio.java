package org.example;

public abstract class Beneficio {

    private Categoria categoria;
    private float valorBase;

    public Beneficio(float valorBase) {
        this.valorBase = valorBase;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public float getValorBase() {
        return valorBase;
    }

    public void setValorBase(float valorBase) {
        this.valorBase = valorBase;
    }

    public abstract float calcularCustoParaEmpresa();
}

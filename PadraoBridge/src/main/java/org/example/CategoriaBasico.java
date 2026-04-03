package org.example;

public class CategoriaBasico implements Categoria {

    private static CategoriaBasico instance;

    private CategoriaBasico() {}

    public static CategoriaBasico getInstance() {
        if (instance == null) {
            instance = new CategoriaBasico();
        }
        return instance;
    }

    @Override
    public float percentualCobertura() {
        return 0.5f;
    }
}

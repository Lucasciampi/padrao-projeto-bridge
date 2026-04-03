package org.example;

public class CategoriaIntermediario implements Categoria {

    private static CategoriaIntermediario instance;

    private CategoriaIntermediario() {}

    public static CategoriaIntermediario getInstance() {
        if (instance == null) {
            instance = new CategoriaIntermediario();
        }
        return instance;
    }

    @Override
    public float percentualCobertura() {
        return 0.75f;
    }

}

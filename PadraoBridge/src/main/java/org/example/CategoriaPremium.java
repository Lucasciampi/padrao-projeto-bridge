package org.example;

public class CategoriaPremium implements Categoria {

    private static CategoriaPremium instance;

    private CategoriaPremium() {}

    public static CategoriaPremium getInstance() {
        if (instance == null) {
            instance = new CategoriaPremium();
        }
        return instance;
    }

    @Override
    public float percentualCobertura() {
        return 1.0f;
    }

}

package model;

public enum Tipo {

    CACHORRO("cachorro"),
    GATO("gato");

    private String nome;
    Tipo(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}

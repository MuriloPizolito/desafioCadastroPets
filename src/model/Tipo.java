package model;

public enum Tipo {

    CACHORRO("Cachorro"),
    GATO("Gato");

    private String nome;

    Tipo(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}

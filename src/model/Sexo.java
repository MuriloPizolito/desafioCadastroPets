package model;

public enum Sexo {

    MACHO("Macho"),
    FEMEA("Fêmea");

    private String nome;

    Sexo(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}

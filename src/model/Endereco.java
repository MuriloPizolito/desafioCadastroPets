package model;

public class Endereco {

    private String rua;
    private int numeroCasa;
    private String cidade;

    public Endereco(String rua, int numeroCasa, String cidade) {
        this.rua = rua;
        this.numeroCasa = numeroCasa;
        this.cidade = cidade;
    }

    public int getNumeroCasa() {
        return numeroCasa;
    }

    public String getCidade() {
        return cidade;
    }

    public String getRua() {
        return rua;
    }
}

package model;

import exception.ErrosCadastro;

public class Pet {

    private String nome;
    private Tipo tipo;
    private Sexo sexo;
    private Endereco endereco;
    //    private String endereco;
    private double idade;
    private double peso;
    private String raca;

    public final String NAO_INFORMADO = "Não informado";

    public Pet() {
    }

    public Pet(String nome, Tipo tipo, Sexo sexo, Endereco endereco, double idade, double peso, String raca) {
        this.nome = nome;
        this.tipo = tipo;
        this.sexo = sexo;
        this.endereco = endereco;
        this.idade = idade;
        this.peso = peso;
        this.raca = raca;
    }

    public void verificaNomePet(String nome) {
        if (!nome.trim().matches("[A-Za-z]+ [A-Za-z]+")) {
            throw new ErrosCadastro("Nome inválido! O nome deve ser completo(nome e sobrenome) e não pode conter caracteres especiais.");
        }
    }


    public void verificaIdadePet(Double idade) {
        if (idade > 20) {
            throw new ErrosCadastro("Idade inválida!");
        }
    }

    public void verificaPesoPet(Double peso) {
        if (peso > 60 || peso < 0.5) {
            throw new ErrosCadastro("Peso inválido!");
        }
    }

    public void verificaRacaPet(String raca) {
        if (!raca.matches("[A-Za-z]+")) {
            throw new ErrosCadastro("Raça inválida! Não pode conter caracteres especiais.");
        }

    }


    @Override
    public String toString() {
        return "1 - " + nome + '\n' +
                "2 - " + tipo + '\n' +
                "3 - " + sexo + '\n' +
                "4 - " + endereco.getRua() + ", " + endereco.getNumeroCasa() + ", " + endereco.getCidade() + '\n' +
                "5 - " + idade + " anos" + '\n' +
                "6 - " + peso + " kg" + '\n' +
                "7 - " + raca;
    }

// adicionar no toString
// talvez os gets do endereco no toString aqui. endereco.getRua()


    public void setNome(String nome) {
        this.nome = nome;
    }
}

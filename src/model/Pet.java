package model;

import exception.ErrosCadastro;

public class Pet {

    private String nome;
    private Tipo tipo;
    private Sexo sexo;
    //    private Endereco endereco;
    private String endereco;
    private double idade;
    private double peso;
    private String raca;

    public Pet() {
    }

    public Pet(String nome, Tipo tipo, Sexo sexo, String endereco, double idade, double peso, String raca) {
        this.nome = nome;
        this.tipo = tipo;
        this.sexo = sexo;
        this.endereco = endereco;
        this.idade = idade;
        this.peso = peso;
        this.raca = raca;
    }

    public void verificaIdadePet(Double idade) {
        if (idade > 20){
            throw new ErrosCadastro("Idade inválida");
        }

    }

    public void verificaPesoPet(Double peso) {
        if (peso > 60 || peso < 0.5){
            throw new ErrosCadastro("Peso inválido");
        }
    }



    @Override
    public String toString() {
        return "1 - " + nome + '\n' +
                "2 - " + tipo + '\n' +
                "3 - " + sexo + '\n' +
                "4 - " + endereco + '\n' +
                "5 - " + idade + " anos" + '\n' +
                "6 - " + peso + " kg" + '\n' +
                "7 - " + raca;
    }
// adicionar no toString

}

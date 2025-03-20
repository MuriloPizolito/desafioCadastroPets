package dadosTxt;

import model.Endereco;
import model.Pet;
import model.Sexo;
import model.Tipo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OperacoesMenu {

    LeituraTxt leituraTxt = new LeituraTxt();
    Scanner scanner = new Scanner(System.in);
    Pet pet = new Pet();

    public void lendoPerguntas() {
        leituraTxt.lendoArquivo();
    }

    public void cadastroPet() {
        String nome = scanner.nextLine();
        pet.verificaNomePet(nome);

        String tipo = scanner.nextLine();
        if (tipo.equalsIgnoreCase("Cachorro")) tipo = "CACHORRO";
        if (tipo.equalsIgnoreCase("Gato")) tipo = "GATO";

        String sexo = scanner.nextLine();
        if (sexo.equalsIgnoreCase("Macho")) sexo = "MACHO";
        if (sexo.equalsIgnoreCase("Fêmea")) sexo = "FEMEA";

        System.out.println("Rua " + '\n' +
                "Número da casa " + '\n' +
                "Cidade");
        String rua = scanner.nextLine();
        int numeroCasa = scanner.nextInt();
        scanner.nextLine();
        String cidade = scanner.nextLine();

        double idade = scanner.nextDouble();
        pet.verificaIdadePet(idade);

        double peso = scanner.nextDouble();
        pet.verificaPesoPet(peso);
        scanner.nextLine();

        String raca = scanner.nextLine();
        pet.verificaRacaPet(raca);

        Endereco endereco = new Endereco(rua, numeroCasa, cidade);
        pet = new Pet(nome, Tipo.valueOf(tipo), Sexo.valueOf(sexo), endereco, idade, peso, raca);

        List<Pet> petsList = new ArrayList<>();
        petsList.add(pet);
        System.out.println("teste lista de pets \n" + pet);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyyMMdd'T'HHmm");

        String dataFormatada = LocalDateTime.now().format(dateTimeFormatter);
        String nomeArquivo = nome.toUpperCase().replace(" ", "");

        File file = new File("petsCadastrados/" + dataFormatada + "-" + nomeArquivo + ".TXT");

        try (FileWriter fw = new FileWriter(file, true); BufferedWriter bw = new BufferedWriter(fw)) {
            bw.write(pet.toString());
            bw.newLine();
            bw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}

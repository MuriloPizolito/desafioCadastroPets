package dadosTxt;

import model.Pet;
import model.Sexo;
import model.Tipo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
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
        Tipo tipo = Tipo.valueOf(scanner.nextLine());
        Sexo sexo = Sexo.valueOf(scanner.nextLine());
        String endereco = scanner.nextLine();
        double idade = scanner.nextDouble();
        pet.verificaIdadePet(idade);
        double peso = scanner.nextDouble();
        pet.verificaPesoPet(peso);
        scanner.nextLine();
        String raca = scanner.nextLine();

        pet = new Pet(nome, tipo, sexo, endereco, idade, peso, raca);

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

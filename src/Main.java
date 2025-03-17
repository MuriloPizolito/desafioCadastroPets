import dadosTxt.OperacoesMenu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        OperacoesMenu operacoesMenu = new OperacoesMenu();

        while (true) {
            System.out.println("""
                    \n         
                    **Menu de opções:**     
                    1 - Cadastrar um novo pet
                    2 - Alterar os dados do pet cadastrado
                    3 - Deletar um pet cadastrado
                    4 - Listar todos os pets cadastrados
                    5 - Listar pets por algum critério (idade, nome, raça)
                    6 - Sair
                    """);
            System.out.println("Escolha uma opção: ");
            int escolha = scanner.nextInt();
            scanner.nextLine();


            switch (escolha) {
                case 1:
                    operacoesMenu.lendoPerguntas();
                    operacoesMenu.cadastroPet();
                    System.out.println("Pet cadastrado com sucesso!");
                    break;
                case 2:
                    System.out.println("");
                    break;
                case 3:
                    System.out.println("");
                    break;
                case 4:
                    System.out.println("");
                    break;
                case 5:
                    System.out.println("");
                    break;
                case 6:
                    System.out.println("Saindo...");
                    System.exit(0);
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }
    }

}

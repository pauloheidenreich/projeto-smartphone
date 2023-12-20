package br.com.mysmart;

import br.com.mysmart.internet.MyBrowser;
import br.com.mysmart.music.MyPlayer;
import br.com.mysmart.phone.MyPhone;

import java.util.Scanner;

public class UserInterface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int userChoice = 0;
        do {
            System.out.println("*".repeat(50));
            System.out.println("Meu Telefone! " +
                    "Escolha a opção desejada:\n" +
                    "1 - Telefone\n" +
                    "2 - Music Player\n" +
                    "3 - Navegador de Internet\n" +
                    "4 - Sair\n");
            System.out.print("Opção desejada: ");
            userChoice = sc.nextInt();
            switch (userChoice) {
                case 1:
                    System.out.println();
                    System.out.println("*".repeat(50));
                    System.out.println("Bem vindo ao MyPhone!");
                    System.out.println("Escolha a opção desejada:\n" +
                            "1 - Ligar\n" +
                            "2 - Atender\n" +
                            "3 - Iniciar Correio de Voz\n" +
                            "4 - Sair\n");
                    System.out.print("Opção desejada: ");
                    int userChoicePhone = sc.nextInt();
                    MyPhone newCall = new MyPhone();
                    do {
                        switch (userChoicePhone) {
                            case 1:
                                newCall.ligar();
                                userChoicePhone = 4;
                                break;
                            case 2:
                                newCall.atender();
                                userChoicePhone = 4;
                                break;
                            case 3:
                                newCall.iniciarCorreioVoz();
                                userChoicePhone = 4;
                                break;
                            case 4:
                                System.out.println("\nSaindo..\n");
                                break;
                            default:
                                System.out.println("\nOpção inválida\n");
                                userChoicePhone = 4;
                                break;
                        }
                    } while (userChoicePhone != 4);
                    break;
                case 2:
                    System.out.println();
                    System.out.println("*".repeat(50));
                    System.out.println("Bem vindo ao MusicPlayer!");
                    System.out.println("Escolha a opção desejada:\n" +
                            "1 - Tocar\n" +
                            "2 - Pausar Música\n" +
                            "3 - Selecionar Música\n" +
                            "4 - Sair\n");
                    System.out.print("Opção desejada: ");
                    int userChoiceMusic = sc.nextInt();
                    MyPlayer newPlaySession = new MyPlayer();
                    do {
                        switch (userChoiceMusic) {
                            case 1:
                                newPlaySession.tocar();
                                userChoiceMusic = 4;
                                break;
                            case 2:
                                newPlaySession.pausarMusica();
                                userChoiceMusic = 4;
                                break;
                            case 3:
                                newPlaySession.selecionarMusica();
                                userChoiceMusic = 4;
                                break;
                            case 4:
                                System.out.println("\nSaindo..\n");
                                break;
                            default:
                                System.out.println("\nOpção inválida\n");
                                userChoiceMusic = 4;
                                break;
                        }
                    } while (userChoiceMusic != 4);
                    break;
                case 3:
                    System.out.println();
                    System.out.println("*".repeat(50));
                    System.out.println("Bem vindo ao MyBrowser!");
                    System.out.println("Escolha a opção desejada:\n" +
                            "1 - Exibir Página\n" +
                            "2 - Abrir nova aba\n" +
                            "3 - Atualizar página\n" +
                            "4 - Sair\n");
                    System.out.print("Opção desejada: ");
                    int userChoiceInternet = sc.nextInt();
                    MyBrowser newInternetSession = new MyBrowser();
                    do {
                        switch (userChoiceInternet) {
                            case 1:
                                newInternetSession.exibirPagina();
                                userChoiceInternet = 4;
                                break;
                            case 2:
                                newInternetSession.abriNovaAba();
                                userChoiceInternet = 4;
                                break;
                            case 3:
                                newInternetSession.atualizarPagina();
                                userChoiceInternet = 4;
                                break;
                            case 4:
                                System.out.println("\nSaindo..\n");
                                break;
                            default:
                                System.out.println("\nOpção inválida\n");
                                userChoiceInternet = 4;
                                break;
                        }
                    } while (userChoiceInternet != 4);
                    break;
                case 4:
                    System.out.println();
                    System.out.println("\nSaindo..\n");
                    break;
                default:
                    System.out.println();
                    System.out.println("\nOpção inválida\n");
                    userChoice = 0;
            }
        } while (userChoice != 4);

        sc.close();
    }
}

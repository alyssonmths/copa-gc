import service.Copa;
import util.CargaInicial;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Copa copa = new Copa();
        CargaInicial.carregar(copa);

        Scanner scanner = new Scanner(System.in);
        int opcao = -1;

        
        do {
            exibirMenu();
            System.out.print("Escolha uma opção: ");

            
            if (scanner.hasNextInt()) {
                opcao = scanner.nextInt();
                scanner.nextLine(); 
            } else {
                scanner.nextLine(); 
                System.out.println("\nEntrada inválida! Digite um número.\n");
                continue;
            }

            switch (opcao) {
                case 1:
                    
                    System.out.println("\n[Opção 1] ainda não implementada.\n");
                    break;
                case 2:
                    
                    System.out.println("\n[Opção 2] ainda não implementada.\n");
                    break;
                case 3:
                    
                    System.out.println("\n[Opção 3] ainda não implementada.\n");
                    break;
                case 4:
                    
                    System.out.println("\n[Opção 4] ainda não implementada.\n");
                    break;
                case 0:
                    System.out.println("\nEncerrando o sistema. Até mais!");
                    break;
                default:
                    System.out.println("\nOpção inexistente! Tente novamente.\n");
            }

        } while (opcao != 0);

        scanner.close();
    }

    private static void exibirMenu() {
        System.out.println("========================================");
        System.out.println("         COPA DO MUNDO - MENU");
        System.out.println("========================================");
        System.out.println("1 - Listar seleções por grupo");
        System.out.println("2 - Registrar placar de partida");
        System.out.println("3 - Listar artilheiros");
        System.out.println("4 - Exibir classificação dos grupos");
        System.out.println("0 - Sair");
        System.out.println("========================================");
    }
}
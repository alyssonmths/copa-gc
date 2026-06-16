import model.Partida;
import service.Copa;
import util.CargaInicial;

import java.util.List;
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
                    System.out.print("\nDigite a letra do grupo (A ou B): ");
                    String entradaGrupo = scanner.nextLine().trim().toUpperCase();

                    if (entradaGrupo.length() != 1 || (entradaGrupo.charAt(0) != 'A' && entradaGrupo.charAt(0) != 'B')) {
                        System.out.println("\nGrupo inválido! Digite A ou B.\n");
                    } else {
                        char grupo = entradaGrupo.charAt(0);
                        System.out.println("\n=== SELEÇÕES DO GRUPO " + grupo + " ===");
                        copa.listarGrupos(grupo);
                        System.out.println();
                    }
                    break;

                case 2:
                    List<Partida> partidas = copa.getPartidas();

                    if (partidas.isEmpty()) {
                        System.out.println("\nNenhuma partida registrada.\n");
                        break;
                    }

                    System.out.println("\n=== PARTIDAS DISPONÍVEIS ===");
                    for (int i = 0; i < partidas.size(); i++) {
                        Partida p = partidas.get(i);
                        System.out.println(i + " - " + p.getMandante().getNome()
                                + " vs " + p.getVisitante().getNome()
                                + " | Placar atual: " + p.getGolsA() + " x " + p.getGolsB());
                    }

                    System.out.print("\nDigite o número da partida: ");
                    if (!scanner.hasNextInt()) {
                        scanner.nextLine();
                        System.out.println("\nEntrada inválida!\n");
                        break;
                    }
                    int indice = scanner.nextInt();
                    scanner.nextLine();

                    if (indice < 0 || indice >= partidas.size()) {
                        System.out.println("\nPartida inexistente!\n");
                        break;
                    }

                    System.out.print("Gols do mandante (" + partidas.get(indice).getMandante().getNome() + "): ");
                    if (!scanner.hasNextInt()) {
                        scanner.nextLine();
                        System.out.println("\nEntrada inválida!\n");
                        break;
                    }
                    int golsA = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Gols do visitante (" + partidas.get(indice).getVisitante().getNome() + "): ");
                    if (!scanner.hasNextInt()) {
                        scanner.nextLine();
                        System.out.println("\nEntrada inválida!\n");
                        break;
                    }
                    int golsB = scanner.nextInt();
                    scanner.nextLine();

                    copa.registrarPlacar(indice, golsA, golsB);
                    System.out.println("\nPlacar registrado com sucesso: "
                            + partidas.get(indice).getMandante().getNome() + " "
                            + golsA + " x " + golsB + " "
                            + partidas.get(indice).getVisitante().getNome() + "\n");
                    break;

                case 3:
                    System.out.println("\n=== ARTILHEIROS ===");
                    copa.exibirrArtilheiros();
                    System.out.println();
                    break;

                case 4:
                    System.out.println();
                    copa.calcularClassificacao();
                    System.out.println();
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
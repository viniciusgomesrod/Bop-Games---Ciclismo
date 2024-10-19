/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.rafaelfaria_viniciusgomes_v1;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RafaelFaria_ViniciusGomes_v1 {
    private static List<Ciclista> ciclistas = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao sistema de competição de ciclismo do BOP GAMES!");
        
        // Cadastrar os ciclistas
        System.out.print("Quantos ciclistas irão participar? ");
        int numCiclistas = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha

        // Perguntar quantas etapas
        System.out.print("Quantas etapas irão ocorrer? ");
        int numEtapas = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha

        // Cadastro das etapas
        List<Etapa> etapas = new ArrayList<>();
        for (int i = 1; i <= numEtapas; i++) {
            System.out.println("\nCadastro da Etapa " + i + ":");
            System.out.print("Data (yyyy-mm-dd): ");
            String dataStr = scanner.nextLine();
            LocalDate data = LocalDate.parse(dataStr);

            System.out.print("Hora inicial (hh:mm): ");
            String horaInicialStr = scanner.nextLine();
            LocalTime horaInicial = LocalTime.parse(horaInicialStr);

            // Adiciona a etapa com data e hora (a duração será adicionada por ciclista)
            etapas.add(new Etapa(i, data, horaInicial, null));
        }

        // Cadastro dos ciclistas
        for (int i = 0; i < numCiclistas; i++) {
            System.out.println("\nCadastro do Ciclista " + (i + 1) + ":");
            System.out.print("Nome: ");
            String nome = scanner.nextLine();
            System.out.print("Número: ");
            int numero = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha
            System.out.print("Cidade de origem: ");
            String cidade = scanner.nextLine();

            Ciclista ciclista = new Ciclista(numero, nome, cidade);

            // Cadastrar a duração de cada etapa para o ciclista
            for (int j = 0; j < etapas.size(); j++) {
                System.out.println("\nCadastro da duração da Etapa " + (j + 1) + " para o ciclista " + nome + ":");
                System.out.print("Duração da etapa (minutos e segundos separados por espaço, ex: 32 45): ");
                int minutos = scanner.nextInt();
                int segundos = scanner.nextInt();
                scanner.nextLine(); // Consumir a quebra de linha

                Duration duracao = Duration.ofMinutes(minutos).plusSeconds(segundos);

                // Clonar a etapa e adicionar a duração para cada ciclista
                Etapa etapaComDuracao = new Etapa(etapas.get(j).getNumero(), etapas.get(j).getData(), etapas.get(j).getHoraInicial(), duracao);
                ciclista.adicionarEtapa(etapaComDuracao);
            }

            ciclistas.add(ciclista);
        }

        // Exibir menu para comparações entre ciclistas
        int opcao;
        do {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1. Comparar dois ciclistas no final da competição");
            System.out.println("2. Comparar dois ciclistas em uma etapa específica");
            System.out.println("3. Sair");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            switch (opcao) {
                case 1:
                    compararCiclistas();
                    break;
                case 2:
                    compararCiclistasNaEtapa();
                    break;
                case 3:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 3);

        scanner.close();
    }

    private static void compararCiclistas() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número do primeiro ciclista: ");
        int numCiclista1 = scanner.nextInt();
        System.out.print("Digite o número do segundo ciclista: ");
        int numCiclista2 = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha

        Ciclista ciclista1 = encontrarCiclistaPorNumero(numCiclista1);
        Ciclista ciclista2 = encontrarCiclistaPorNumero(numCiclista2);

        if (ciclista1 != null && ciclista2 != null) {
            System.out.println(ciclista1.compararComOutroCiclista(ciclista2));
        } else {
            System.out.println("Um ou ambos os ciclistas não foram encontrados.");
        }
    }

    private static void compararCiclistasNaEtapa() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número do primeiro ciclista: ");
        int numCiclista1 = scanner.nextInt();
        System.out.print("Digite o número do segundo ciclista: ");
        int numCiclista2 = scanner.nextInt();
        System.out.print("Digite o número da etapa: ");
        int numEtapa = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha

        Ciclista ciclista1 = encontrarCiclistaPorNumero(numCiclista1);
        Ciclista ciclista2 = encontrarCiclistaPorNumero(numCiclista2);

        if (ciclista1 != null && ciclista2 != null) {
            System.out.println(ciclista1.compararEtapaComOutroCiclista(ciclista2, numEtapa));
        } else {
            System.out.println("Um ou ambos os ciclistas não foram encontrados.");
        }
    }

    private static Ciclista encontrarCiclistaPorNumero(int numero) {
        for (Ciclista ciclista : ciclistas) {
            if (ciclista.getNumero() == numero) {
                return ciclista;
            }
        }
        return null;
    }
}

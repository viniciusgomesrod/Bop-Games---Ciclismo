/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.rafaelfaria_viniciusgomes_bopgames;

import java.util.Scanner;

public class RafaelFaria_ViniciusGomes_BopGames {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicitando informações dos ciclistas
        Ciclista ciclista1 = criarCiclista(sc, 1);
        Ciclista ciclista2 = criarCiclista(sc, 2);

        // Registrando as etapas para cada ciclista
        registrarEtapas(sc, ciclista1);
        registrarEtapas(sc, ciclista2);

        // Comparando os ciclistas
        compararCiclistas(ciclista1, ciclista2);
        
        sc.close();
    }

    private static Ciclista criarCiclista(Scanner sc, int numeroCiclista) {
        System.out.print("Digite o nome do Ciclista " + numeroCiclista + ": ");
        String nome = sc.nextLine();
        System.out.print("Digite o número do Ciclista " + numeroCiclista + ": ");
        int numero = sc.nextInt();
        sc.nextLine(); // Limpar buffer
        System.out.print("Digite a cidade do Ciclista " + numeroCiclista + ": ");
        String cidade = sc.nextLine();

        return new Ciclista(nome, numero, cidade);
    }

    private static void registrarEtapas(Scanner sc, Ciclista ciclista) {
        for (int i = 1; i <= 21; i++) {
            System.out.println("Digite as informações da Etapa " + i + ":");
            System.out.print("Número da Etapa: ");
            int numero = sc.nextInt();
            System.out.print("Dia: ");
            int dia = sc.nextInt();
            System.out.print("Mês: ");
            int mes = sc.nextInt();
            System.out.print("Ano: ");
            int ano = sc.nextInt();
            System.out.print("Horas de duração: ");
            int horas = sc.nextInt();
            System.out.print("Minutos de duração: ");
            int minutos = sc.nextInt();
            System.out.print("Segundos de duração: ");
            int segundos = sc.nextInt();
            
            Data data = new Data(dia, mes, ano);
            Hora hora = new Hora(horas, minutos, segundos);
            Duracao duracao = new Duracao(Hora hora, int distancia);

            Etapa etapa = new Etapa(numero, data, duracao);
            
            ciclista.registrarEtapa(etapa);
            System.out.println("Etapa " + i + " registrada para " + ciclista.getNome());
        }
    }

    private static void compararCiclistas(Ciclista ciclista1, Ciclista ciclista2) {
        // Tempo total de cada ciclista
        System.out.println("Tempo total de " + ciclista1.getNome() + ": " + ciclista1.calcularTempoTotal() + " segundos");
        System.out.println("Tempo total de " + ciclista2.getNome() + ": " + ciclista2.calcularTempoTotal() + " segundos");

        // Diferença de tempo entre os ciclistas
        System.out.println(ciclista1.difTempoEntreCiclistas(ciclista2));

        // Verificando quem venceu uma etapa específica
        System.out.print("Digite o número da etapa para verificar o vencedor: ");
        Scanner sc = new Scanner(System.in);
        int numeroEtapa = sc.nextInt();
        Ciclista vencedor = ciclista1.vencedorDaEtapa(ciclista2, numeroEtapa);
        System.out.println("Vencedor da Etapa " + numeroEtapa + ": " + vencedor.getNome());
    }
}


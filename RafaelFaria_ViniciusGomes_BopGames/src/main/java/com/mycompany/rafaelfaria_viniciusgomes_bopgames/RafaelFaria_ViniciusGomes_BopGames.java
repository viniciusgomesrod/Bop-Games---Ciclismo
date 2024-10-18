/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.rafaelfaria_viniciusgomes_bopgames;

public class RafaelFaria_ViniciusGomes_BopGames {

    public static void main(String[] args) {
        // Criando ciclistas para a competição
        Ciclista ciclista1 = new Ciclista("Fulano", 1, "Belo Horizonte");
        Ciclista ciclista2 = new Ciclista("Beltrano", 2, "Contagem");

        // Criando etapas e registrando-as para os ciclistas
        Etapa etapa1 = new Etapa(1, new Data(1, 10, 2024), new Duracao(new Hora(2, 30, 0), 5000)); // 1h30m
        Etapa etapa2 = new Etapa(2, new Data(2, 10, 2024), new Duracao(new Hora(1, 45, 0), 4500)); // 1h15m

        ciclista1.registrarEtapa(etapa1);
        ciclista1.registrarEtapa(etapa2);

        ciclista2.registrarEtapa(etapa1);
        ciclista2.registrarEtapa(etapa2);

        // Calculando e exibindo o tempo total de cada ciclista
        int tempoTotalCiclista1 = ciclista1.calcularTempoTotal();
        int tempoTotalCiclista2 = ciclista2.calcularTempoTotal();

        System.out.println("Tempo total de " + ciclista1.getNome() + ": " + tempoTotalCiclista1 + " segundos");
        System.out.println("Tempo total de " + ciclista2.getNome() + ": " + tempoTotalCiclista2 + " segundos");

        // Comparando os dois ciclistas
        System.out.println(ciclista1.difTempoEntreCiclistas(ciclista2));

        // Verificando quem venceu uma etapa específica
        System.out.println("Vencedor da Etapa 1: " + ciclista1.vencedorDaEtapa(ciclista2, 1).getNome());
    }
}

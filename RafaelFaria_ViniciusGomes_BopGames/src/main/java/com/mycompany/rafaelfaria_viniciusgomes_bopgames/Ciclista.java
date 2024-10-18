/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.mycompany.rafaelfaria_viniciusgomes_bopgames;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author viniciusgomesrodrigues
 */

public class Ciclista extends Participante {
    private static final int ETAPAS = 21;
    private List<Etapa> etapas;
    private int etapasRegistradas;

    public Ciclista(String nome, int numero, String cidadeOrigem) {
        super(nome, numero, cidadeOrigem);
        this.etapas = new ArrayList<>();
        this.etapasRegistradas = 0;
    }

    public void registrarEtapa(Etapa etapa) {
        if (etapasRegistradas < ETAPAS) {
            etapas.add(etapa);
            etapasRegistradas++;
        } else {
            System.out.println("Todas as etapas já foram registradas.");
        }
    }

    public int calcularTempoTotal() {
        int tempoTotal = 0;
        for (Etapa e : etapas) {
            tempoTotal += e.getDuracao().DuracaoEmSeg();
        }
        return tempoTotal;
    }

    public String difTempoEntreCiclistas(Ciclista outro) {
        int tempoThis = this.calcularTempoTotal();
        int tempoOutro = outro.calcularTempoTotal();

        int difTempo = Math.abs(tempoThis - tempoOutro);
        int minutos = difTempo / 60;
        int segundos = difTempo % 60;

        if (tempoThis < tempoOutro) {
            return String.format("%s venceu a corrida por %d minutos e %d segundos à frente.", this.getNome(), minutos, segundos);
        } else if (tempoThis > tempoOutro) {
            return String.format("%s venceu a corrida por %d minutos e %d segundos à frente.", outro.getNome(), minutos, segundos);
        } else {
            return "Os dois ciclistas terminaram a corrida no mesmo tempo.";
        }
    }

    public Ciclista vencedorDaEtapa(Ciclista outro, int etapa) {
        Duracao duracaoThis = this.etapas.get(etapa - 1).getDuracao();
        Duracao duracaoOutro = outro.etapas.get(etapa - 1).getDuracao();

        if (duracaoThis.MaiorQue(duracaoOutro)) {
            return outro;
        } else {
            return this;
        }
    }
}

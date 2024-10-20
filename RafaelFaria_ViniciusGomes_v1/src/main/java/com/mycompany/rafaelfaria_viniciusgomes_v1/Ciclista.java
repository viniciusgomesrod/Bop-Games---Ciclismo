/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rafaelfaria_viniciusgomes_v1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class Ciclista extends Participante {
    private List<Etapa> etapas;

    public Ciclista(int numero, String nome, String cidade) {
        super(numero, nome, cidade);
        this.etapas = new ArrayList<>();
    }

    // Adiciona uma etapa ao ciclista
    public void adicionarEtapa(Etapa etapa) {
        etapas.add(etapa);
    }

    public List<Etapa> getEtapas() {
        return etapas;
    }
    
    // Compara o tempo total de dois ciclistas ao final da competição
    public String compararComOutroCiclista(Ciclista outroCiclista) {
        Duration totalTempoCiclista1 = getTempoTotal();
        Duration totalTempoCiclista2 = outroCiclista.getTempoTotal();

        // Verifica se os tempos são iguais
        if (totalTempoCiclista1.compareTo(totalTempoCiclista2) == 0) {
            return "Os ciclistas " + this.getNome() + " e " + outroCiclista.getNome() + 
                   " terminaram juntos com o mesmo tempo total.";
        } else if (totalTempoCiclista1.compareTo(totalTempoCiclista2) < 0) {
            Duration diferenca = totalTempoCiclista2.minus(totalTempoCiclista1);
            return this.getNome() + " terminou à frente com uma diferença de " +
                   diferenca.toMinutesPart() + " minutos e " +
                   diferenca.toSecondsPart() + " segundos.";
        } else {
            Duration diferenca = totalTempoCiclista1.minus(totalTempoCiclista2);
            return outroCiclista.getNome() + " terminou à frente com uma diferença de " +
                   diferenca.toMinutesPart() + " minutos e " +
                   diferenca.toSecondsPart() + " segundos.";
        }
    }

    // Compara o desempenho de dois ciclistas em uma etapa específica
    public String compararEtapaComOutroCiclista(Ciclista outroCiclista, int numeroEtapa) {
        Etapa etapa1 = etapas.get(numeroEtapa - 1);
        Etapa etapa2 = outroCiclista.etapas.get(numeroEtapa - 1);

        Duration duracao1 = etapa1.getDuracao();
        Duration duracao2 = etapa2.getDuracao();

        // Verifica se os tempos são iguais
        if (duracao1.compareTo(duracao2) == 0) {
            return "Os ciclistas " + this.getNome() + " e " + outroCiclista.getNome() + 
                   " terminaram juntos na etapa " + numeroEtapa + ".";
        } else if (duracao1.compareTo(duracao2) < 0) {
            Duration diferenca = duracao2.minus(duracao1);
            return this.getNome() + " terminou à frente na etapa " + numeroEtapa + 
                   " com uma diferença de " + diferenca.toMinutesPart() + " minutos e " +
                   diferenca.toSecondsPart() + " segundos.";
        } else {
            Duration diferenca = duracao1.minus(duracao2);
            return outroCiclista.getNome() + " terminou à frente na etapa " + numeroEtapa + 
                   " com uma diferença de " + diferenca.toMinutesPart() + " minutos e " +
                   diferenca.toSecondsPart() + " segundos.";
        }
    }

    // Calcula o tempo total gasto pelo ciclista em todas as etapas
    public Duration getTempoTotal() {
        Duration tempoTotal = Duration.ZERO;
        for (Etapa etapa : etapas) {
            tempoTotal = tempoTotal.plus(etapa.getDuracao());
        }
        return tempoTotal;
    }
}

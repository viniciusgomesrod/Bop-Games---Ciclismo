/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.mycompany.rafaelfaria_viniciusgomes_bopgames;

/**
 *
 * @author viniciusgomesrodrigues
 */

public class Duracao {
    private Hora horaInicial;
    private int duracaoTotal; // duração total em segundos

    public Duracao(Hora horaInicial, int duracaoTotal) {
        this.horaInicial = horaInicial;
        this.duracaoTotal = duracaoTotal;
    }

    public int DuracaoEmSeg() {
        return duracaoTotal;
    }

    public boolean MaiorQue(Duracao outraDuracao) {
        return this.duracaoTotal > outraDuracao.duracaoTotal;
    }

    public String Relatorio() {
        int horas = duracaoTotal / 3600;
        int minutos = (duracaoTotal % 3600) / 60;
        int segundos = duracaoTotal % 60;
        return String.format("%d horas, %d minutos, %d segundos", horas, minutos, segundos);
    }
}

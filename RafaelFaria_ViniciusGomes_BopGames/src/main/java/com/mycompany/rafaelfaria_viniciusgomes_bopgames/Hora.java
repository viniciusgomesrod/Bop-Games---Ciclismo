/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.mycompany.rafaelfaria_viniciusgomes_bopgames;

/**
 *
 * @author viniciusgomesrodrigues
 */

public class Hora {
    private int horas;
    private int minutos;
    private int segundos;

    public Hora(int horas, int minutos, int segundos) {
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
    }

    public boolean EstaNaFrenteDe(Hora outra) {
        int totalSegundosThis = this.horas * 3600 + this.minutos * 60 + this.segundos;
        int totalSegundosOutra = outra.horas * 3600 + outra.minutos * 60 + outra.segundos;

        return totalSegundosThis > totalSegundosOutra;
    }

    public String HoraFormatada() {
        return String.format("%02d:%02d:%02d", horas, minutos, segundos);
    }
}

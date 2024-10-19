/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rafaelfaria_viniciusgomes_v1;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;

public class Etapa {
    private int numero;
    private LocalDate data;
    private LocalTime horaInicial;
    private Duration duracao;

    public Etapa(int numero, LocalDate data, LocalTime horaInicial, Duration duracao) {
        this.numero = numero;
        this.data = data;
        this.horaInicial = horaInicial;
        this.duracao = duracao;
    }

    public Duration getDuracao() {
        return duracao;
    }

    public int getNumero() {
        return numero;
    }

    public LocalDate getData() {
        return data;
    }

    public LocalTime getHoraInicial() {
        return horaInicial;
    }
}
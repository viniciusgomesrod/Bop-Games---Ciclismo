/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.mycompany.rafaelfaria_viniciusgomes_bopgames;

public class Duracao {
    private Hora hora;
    private int distancia;

    // Construtor
    public Duracao(Hora hora, int distancia) {
        if (distancia < 0) {
            throw new IllegalArgumentException("A distância não pode ser negativa.");
        }
        this.hora = hora;
        this.distancia = distancia;
    }

    // Getter e Setter para a hora
    public Hora getHora() {
        return hora;
    }

    public void setHora(Hora hora) {
        this.hora = hora;
    }

    // Getter e Setter para a distância
    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    public int getTotalSegundos() {
        return (hora.getHoras() * 3600) + (hora.getMinutos() * 60) + hora.getSegundos();
    }
    
    // Método Relatório
    public String relatorio() {
        return "Tempo: " + hora.getHorasFormatadas() + " - Distância: " + distancia + " metros";
    }
}


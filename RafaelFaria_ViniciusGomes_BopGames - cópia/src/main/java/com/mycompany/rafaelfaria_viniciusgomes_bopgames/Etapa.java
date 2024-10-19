/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.mycompany.rafaelfaria_viniciusgomes_bopgames;

public class Etapa {
    private int numero;
    private Data data;
    private Duracao duracao;

    // Construtor
    public Etapa(int numero, Data data, Duracao duracao) {
        this.numero = numero;
        this.data = data;
        this.duracao = duracao;
    }

    // Getter e Setter para o número da etapa
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    // Getter e Setter para a data da etapa
    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    // Getter e Setter para a duração da etapa
    public Duracao getDuracao() {
        return duracao;
    }

    public void setDuracao(Duracao duracao) {
        this.duracao = duracao;
    }
}

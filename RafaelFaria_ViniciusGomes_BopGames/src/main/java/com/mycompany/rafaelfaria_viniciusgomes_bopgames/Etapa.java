/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.mycompany.rafaelfaria_viniciusgomes_bopgames;

/**
 *
 * @author viniciusgomesrodrigues
 */

public class Etapa {
    private int numero;
    private Data data;
    private Duracao duracao;

    public Etapa(int numero, Data data, Duracao duracao) {
        this.numero = numero;
        this.data = data;
        this.duracao = duracao;
    }

    public Duracao getDuracao() {
        return duracao;
    }
}

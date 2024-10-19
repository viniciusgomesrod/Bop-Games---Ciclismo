/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rafaelfaria_viniciusgomes_v1;

public abstract class Participante {
    private int numero;
    private String nome;
    private String cidade;

    public Participante(int numero, String nome, String cidade) {
        this.numero = numero;
        this.nome = nome;
        this.cidade = cidade;
    }

    public int getNumero() {
        return numero;
    }

    public String getNome() {
        return nome;
    }

    public String getCidade() {
        return cidade;
    }
}

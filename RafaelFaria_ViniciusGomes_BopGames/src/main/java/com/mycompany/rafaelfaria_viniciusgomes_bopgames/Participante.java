/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.mycompany.rafaelfaria_viniciusgomes_bopgames;

/**
 *
 * @author viniciusgomesrodrigues
 */
public class Participante {
    private String nome;
    private int numero;
    private String cidadeOrigem;

    public Participante(String nome, int numero, String cidadeOrigem) {
        this.nome = nome;
        this.numero = numero;
        this.cidadeOrigem = cidadeOrigem;
    }

    public String getNome() {
        return nome;
    }

    public int getNumero() {
        return numero;
    }

    public String getCidadeOrigem() {
        return cidadeOrigem;
    }
}

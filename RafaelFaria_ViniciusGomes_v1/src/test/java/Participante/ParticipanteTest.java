/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

package Participante;

import com.mycompany.rafaelfaria_viniciusgomes_v1.Participante;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParticipanteTest {

    private class TestParticipante extends Participante {
        public TestParticipante(int numero, String nome, String cidade) {
            super(numero, nome, cidade);
        }
    }

    @Test
    void testParticipanteCreation() {
        TestParticipante participante = new TestParticipante(1, "João", "Belo Horizonte");
        assertEquals(1, participante.getNumero());
        assertEquals("João", participante.getNome());
        assertEquals("Belo Horizonte", participante.getCidade());
    }
}


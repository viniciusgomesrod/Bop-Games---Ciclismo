/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Etapa;

import com.mycompany.rafaelfaria_viniciusgomes_v1.Etapa;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;

class EtapaTest {

    @Test
    void testEtapaCreation() {
        Etapa etapa = new Etapa(1, LocalDate.of(2024, 10, 20), LocalTime.of(10, 0), Duration.ofMinutes(30));
        assertEquals(1, etapa.getNumero());
        assertEquals(LocalDate.of(2024, 10, 20), etapa.getData());
        assertEquals(LocalTime.of(10, 0), etapa.getHoraInicial());
        assertEquals(Duration.ofMinutes(30), etapa.getDuracao());
    }
}

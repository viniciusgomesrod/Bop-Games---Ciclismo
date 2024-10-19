/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

package Ciclista;

import com.mycompany.rafaelfaria_viniciusgomes_v1.Ciclista;
import com.mycompany.rafaelfaria_viniciusgomes_v1.Etapa;
import com.mycompany.rafaelfaria_viniciusgomes_v1.Participante;
import com.mycompany.rafaelfaria_viniciusgomes_v1.RafaelFaria_ViniciusGomes_v1;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;

class CiclistaTest {

    @Test
    void testCiclistaCreation() {
        Ciclista ciclista = new Ciclista(1, "Ana", "Contagem");
        assertEquals(1, ciclista.getNumero());
        assertEquals("Ana", ciclista.getNome());
        assertEquals("Contagem", ciclista.getCidade());
    }

    @Test
    void testAdicionarEtapa() {
        Ciclista ciclista = new Ciclista(1, "Ana", "Contagem");
        Etapa etapa = new Etapa(1, LocalDate.of(2024, 10, 20), LocalTime.of(10, 0), Duration.ofMinutes(30));
        ciclista.adicionarEtapa(etapa);
        assertEquals(1, ciclista.getEtapas().size());
        assertEquals(etapa, ciclista.getEtapas().get(0));
    }

    @Test
    void testCompararComOutroCiclista() {
        Ciclista ciclista1 = new Ciclista(1, "Ana", "Contagem");
        Ciclista ciclista2 = new Ciclista(2, "Pedro", "Belo Horizonte");

        // Adicionando etapas
        ciclista1.adicionarEtapa(new Etapa(1, LocalDate.of(2024, 10, 20), LocalTime.of(10, 0), Duration.ofMinutes(30)));
        ciclista2.adicionarEtapa(new Etapa(1, LocalDate.of(2024, 10, 20), LocalTime.of(10, 0), Duration.ofMinutes(25)));

        String resultado = ciclista1.compararComOutroCiclista(ciclista2);
        assertTrue(resultado.contains("Pedro terminou à frente com uma diferença"));
    }

    @Test
    void testCompararEtapaComOutroCiclista() {
        Ciclista ciclista1 = new Ciclista(1, "Ana", "Contagem");
        Ciclista ciclista2 = new Ciclista(2, "Pedro", "Belo Horizonte");

        // Adicionando etapas
        ciclista1.adicionarEtapa(new Etapa(1, LocalDate.of(2024, 10, 20), LocalTime.of(10, 0), Duration.ofMinutes(30)));
        ciclista2.adicionarEtapa(new Etapa(1, LocalDate.of(2024, 10, 20), LocalTime.of(10, 0), Duration.ofMinutes(25)));

        String resultado = ciclista1.compararEtapaComOutroCiclista(ciclista2, 1);
        assertTrue(resultado.contains("Pedro terminou à frente na etapa 1 com uma diferença"));
    }
}



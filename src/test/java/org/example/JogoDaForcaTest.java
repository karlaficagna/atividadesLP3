package org.example;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.io.InputStream;


class JogoDaForcaTest {

    @Test
    void jogoDaForcaTest() {
        // Simulando a entrada do usuário com as letras "A", "B" e "P"
        String input = "A\nB\nP\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        JogoDaForca jogo = new JogoDaForca();
        jogo.iniciar();
    }
}
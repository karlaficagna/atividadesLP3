package org.example.jogo;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.example.jogo.JogoForca.MAX_TENTATIVAS;
import static org.example.jogo.JogoForca.SECRET_WORD;
import static org.junit.jupiter.api.Assertions.assertEquals;

class JogoForcaTest {


    @Test
    void iniciarTest() {


        String input = "P\nR\nO\nG\nR\nA\nM\nA\nC\nA\nO\n";
        InputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        JogoForca jogo = new JogoForca(SECRET_WORD, MAX_TENTATIVAS);
        jogo.iniciar();

        String output = outputStream.toString();
        String expectedOutput = "Palavra: P_________A_\n" +
                "Tentativas restantes: 6\n" +
                "Digite uma letra: Palavra: PR______A____\n" +
                "Tentativas restantes: 5\n" +
                "Digite uma letra: Palavra: PROGR___A____\n" +
                "Tentativas restantes: 4\n" +
                "Digite uma letra: Palavra: PROGRA_A____\n" +
                "Tentativas restantes: 3\n" +
                "Digite uma letra: Palavra: PROGRAMA____\n" +
                "Tentativas restantes: 2\n" +
                "Digite uma letra: Palavra: PROGRAMACAO\n" +
                "Tentativas restantes: 1\n" +
                "Digite uma letra: Parabéns! Você ganhou!\n";

        output = outputStream.toString();
        assertEquals("PROGRAMACAO", output);
    }

}
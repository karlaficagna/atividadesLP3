package org.example.jogo;

import static org.example.jogo.JogoForca.MAX_TENTATIVAS;
import static org.example.jogo.JogoForca.SECRET_WORD;

public class Main {

    public static void main(String[] args) {

        JogoForca jogo = new JogoForca(SECRET_WORD, MAX_TENTATIVAS);
        jogo.iniciar();

    }
}

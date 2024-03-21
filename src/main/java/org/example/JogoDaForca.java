package org.example;

import java.util.Scanner;

import static org.example.BonecoForca.desenharBoneco;

public class JogoDaForca {

    private static final String PALAVRA_SECRETA = "PROGRAMACAO";
    private static final int MAX_TENTATIVAS = 6;

    public static void main(String[] args) {

        JogoDaForca jogo = new JogoDaForca();
        jogo.iniciar();
    }

    public void iniciar() {
        char[] palavraAdivinhada = new char[PALAVRA_SECRETA.length()];
        boolean[] letrasReveladas = new boolean[PALAVRA_SECRETA.length()];
        int tentativas = 0;
        int erros = 0;

        // Inicializa o array da palavra a ser adivinhada com '_'
        for (int i = 0; i < palavraAdivinhada.length; i++) {
            palavraAdivinhada[i] = '_';
        }

        Scanner scanner = new Scanner(System.in);

        while (tentativas < MAX_TENTATIVAS) {
            System.out.println("Palavra: " + String.valueOf(palavraAdivinhada));
            System.out.println("Tentativas restantes: " + (MAX_TENTATIVAS - tentativas));
            System.out.print("Digite uma letra: ");
            char tentativa = scanner.next().toUpperCase().charAt(0);

            boolean letraEncontrada = false;
            for (int i = 0; i < PALAVRA_SECRETA.length(); i++) {
                if (PALAVRA_SECRETA.charAt(i) == tentativa) {
                    if (!letrasReveladas[i]) {
                        palavraAdivinhada[i] = tentativa;
                        letrasReveladas[i] = true;
                        letraEncontrada = true;
                    } else {
                        System.out.println("Você já tentou essa letra.");
                        letraEncontrada = true;
                    }
                }
            }

            if (!letraEncontrada) {
                System.out.println("Letra não encontrada na palavra.");
                desenharBoneco(++erros);
                tentativas++;
            }

            if (acertou(palavraAdivinhada)) {
                System.out.println("Parabéns! Você ganhou!");
                break;
            }
        }

        if (tentativas == MAX_TENTATIVAS) {
            System.out.println("Você perdeu! A palavra era: " + PALAVRA_SECRETA);
        }

        scanner.close();
    }

    private boolean acertou(char[] palavraAdivinhada) {
        for (char letra : palavraAdivinhada) {
            if (letra == '_') {
                return false;
            }
        }
        return true;
    }

}



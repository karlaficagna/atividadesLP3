package org.example.jogo;

import java.util.Arrays;
import java.util.Scanner;


public class JogoForca {

    public static final String SECRET_WORD = "PROGRAMACAO";
    public static final int MAX_TENTATIVAS = 7;

    public JogoForca(String secretWord, int maxTentativas) {
    }

    public void iniciar() {
        char[] guessword = new char[SECRET_WORD.length()];
        boolean[] letrasReveladas = new boolean[SECRET_WORD.length()];
        int tentativas = 0;
        int erros = 0;

        Arrays.fill(guessword, '_');

        Scanner scanner = new Scanner(System.in);

        while (tentativas < MAX_TENTATIVAS) {
            System.out.println("Palavra: " + String.valueOf(guessword));
            System.out.println("Tentativas restantes: " + (MAX_TENTATIVAS - tentativas));
            System.out.print("Digite uma letra: ");
            char tentativa;
            tentativa = scanner.next().toUpperCase().charAt(0);

            boolean letraEncontrada = false;
            for (int i = 0; i < SECRET_WORD.length(); i++) {
                if (SECRET_WORD.charAt(i) == tentativa) {
                    if (!letrasReveladas[i]) {
                        guessword[i] = tentativa;
                        letrasReveladas[i] = true;
                    } else {
                        System.out.println("Você já tentou essa letra.");
                    }
                    letraEncontrada = true;
                }
            }
            BonecoForca desenharboneco = new BonecoForca();

            if (!letraEncontrada) {
                System.out.println("Letra não encontrada na palavra.");
                desenharboneco.desenharBoneco(++erros);
                tentativas++;
            }

            if (acertou(guessword)) {
                System.out.println("Parabéns! Você ganhou!");
                break;
            }
        }

        if (tentativas == MAX_TENTATIVAS) {
            System.out.println("Você perdeu! A palavra era: " + SECRET_WORD);
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



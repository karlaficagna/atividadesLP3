package org.example;

public class BonecoForca {

    JogoDaForca forca = new JogoDaForca();

    static void desenharBoneco(int erros) {
        switch (erros) {
            case 1:
                System.out.println("  O");
                break;
            case 2:
                System.out.println("  O");
                System.out.println(" /");
                break;
            case 3:
                System.out.println("  O");
                System.out.println(" /|");
                break;
            case 4:
                System.out.println("  O");
                System.out.println(" /|\\");
                break;
            case 5:
                System.out.println("  O");
                System.out.println(" /|\\");
                System.out.println(" /");
                break;
            case 6:
                System.out.println("  O");
                System.out.println(" /|\\");
                System.out.println(" / \\");
                break;
        }
    }
}

package org.example;


import org.example.calculator.IMCCalculator;
import org.junit.jupiter.api.Test;

class IMCCalculatorTest {

    @Test
    void calculator() {
        // IMCCalculator com peso 70kg e altura 1.75m
        IMCCalculator calculator = new IMCCalculator(64.8, 1.53);

        double imc = calculator.calculateIMC();

        System.out.println("Seu IMC eh: " + imc);
    }
}
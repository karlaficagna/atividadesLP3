package org.example.calculator;

public class IMCCalculator {
    private double weight; // peso em quilogramas
    private double height; // altura em metros

    public IMCCalculator(double weight, double height) {
        this.weight = weight;
        this.height = height;
    }

    public double calculateIMC() {
        if (height <= 0 || weight <= 0) {
            throw new IllegalArgumentException("Altura e peso devem ser maiores que zero.");
        }
        return weight / (height * height);
    }
}

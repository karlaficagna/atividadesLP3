package org.example;

import org.example.converter.CurrencyConverter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CurrencyConverterTest {

    @Test
    void testConvert() {
        CurrencyConverter converter = new CurrencyConverter(0.85); // Exemplo: 1 Euro = 0.85 Dólar

        assertEquals(850.0, converter.convert(1000.0), 0.0); // Testando a conversão de 1000 Euros para Dólares
        assertEquals(42.5, converter.convert(50.0), 0.0); // Testando a conversão de 50 Euros para Dólares
    }

}
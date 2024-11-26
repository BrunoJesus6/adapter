package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PessoaTest {

    @Test
    void deveConverterDolarParaEuro() {
        Pessoa pessoa = new Pessoa();

        pessoa.setValorEmDolar(100.0f);
        assertEquals(85.0f, pessoa.getValorEmEuro(), 0.01f);
    }

    @Test
    void deveConverterEuroParaDolar() {
        Pessoa pessoa = new Pessoa();

        pessoa.setValorEmEuro(85.0f);
        assertEquals(100.0f, pessoa.getValorEmDolar(), 0.01f);
    }
}
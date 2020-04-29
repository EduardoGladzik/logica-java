package model;

import static org.junit.jupiter.api.Assertions.*;

class PessoaTest {

    Pessoa pessoa = new Pessoa();

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        pessoa.setIdade(10);
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @org.junit.jupiter.api.Test
    void calcularIdadeMeses() {
        assertEquals(120, pessoa.calcularIdadeMeses());
    }
}
package model;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import model.Combustivel;

/**
 * @author Eduardo Gladzik, Christopher e Luís
 * @version 1.0
 * @since 09/04/2020 13:48
 */
class CombustivelTest {

    Combustivel combustivel = new Combustivel();

    public CombustivelTest() {
    }

    @BeforeEach
    void setUp() {
        combustivel.setQuantidadeDelitros(1);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void calcularValorPagar() {
        assertEquals(4.49, combustivel.calcularValorPagar(0), 0.0);
        assertEquals(3.68, combustivel.calcularValorPagar(1), 0.0);
        assertEquals(3.71, combustivel.calcularValorPagar(2), 0.0);
        assertEquals(8.17, combustivel.calcularValorPagar(3), 0.0);
    }
}
package model;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Eduardo Gladzik
 * @version 1.0
 */
class ProdutoTest {

    Produto produto = new Produto();

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void calcularPrecoTotal() {
        produto.setPreco(10);
        produto.setQuantidade(2);
        assertEquals(20, produto.calcularPrecoTotal(), 0.0);
    }
}
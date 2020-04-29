package model;
import model.Nadador;
import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Eduardo Gladzik, Christopher e Luís
 * @verison 1.0
 * @since 09/04/2020 14:22
 */
class NadadorTest {

    Nadador nadador = new Nadador();

    public NadadorTest() {
    }

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @org.junit.jupiter.api.Test
    void verificarCategoria() {
        nadador.setIdade(1);
        assertEquals("não pode ser nadador", nadador.verificarCategoria());
        nadador.setIdade(8);
        assertEquals("Infantil", nadador.verificarCategoria());
        nadador.setIdade(11);
        assertEquals("Juvenil", nadador.verificarCategoria());
        nadador.setIdade(18);
        assertEquals("Adulto", nadador.verificarCategoria());
    }
}
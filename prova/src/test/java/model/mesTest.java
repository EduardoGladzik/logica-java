package model;
import model.Mes;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;
/**
 * @author Eduardo Gladzik, Christopher e Luís
 * @version 1.0
 * @since 09/04/2020 13:17
 */
class mesTest {

    public mesTest() {
    }

    @BeforeEach
    void setUp() {

    }

    @AfterEach
    void tearDown() {

    }

    Mes mes = new Mes();

    @org.junit.jupiter.api.Test
    void verificarTrimestre() {
        mes.setMesDeNascimento(1);
        assertEquals("1° Trimestre", mes.verificarTrimestre());
        mes.setMesDeNascimento(2);
        assertEquals("1° Trimestre", mes.verificarTrimestre());
        mes.setMesDeNascimento(3);
        assertEquals("1° Trimestre", mes.verificarTrimestre());
        mes.setMesDeNascimento(4);
        assertEquals("2° Trimestre", mes.verificarTrimestre());
        mes.setMesDeNascimento(5);
        assertEquals("2° Trimestre", mes.verificarTrimestre());
        mes.setMesDeNascimento(6);
        assertEquals("2° Trimestre", mes.verificarTrimestre());
        mes.setMesDeNascimento(7);
        assertEquals("3° Trimestre", mes.verificarTrimestre());
        mes.setMesDeNascimento(8);
        assertEquals("3° Trimestre", mes.verificarTrimestre());
        mes.setMesDeNascimento(9);
        assertEquals("3° Trimestre", mes.verificarTrimestre());
        mes.setMesDeNascimento(10);
        assertEquals("4° Trimestre", mes.verificarTrimestre());
        mes.setMesDeNascimento(11);
        assertEquals("4° Trimestre", mes.verificarTrimestre());
        mes.setMesDeNascimento(12);
        assertEquals("4° Trimestre", mes.verificarTrimestre());
    }
}
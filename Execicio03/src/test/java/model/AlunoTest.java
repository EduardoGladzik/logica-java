package model;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Eduardo Gladzik
 * @version 1.0
 */
class AlunoTest {

    Aluno aluno = new Aluno();

    AlunoTest() {
        aluno.notas[0] = 10;
        aluno.notas[1] = 10;
        aluno.notas[2] = 10;
    }

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @org.junit.jupiter.api.Test
    void calcularMediaAritimetica() {
        assertEquals(10, aluno.calcularMediaAritimetica(), 0.0);
    }

    @org.junit.jupiter.api.Test
    void verificarConceito() {
        assertEquals("A", aluno.verificarConceito());
    }


}
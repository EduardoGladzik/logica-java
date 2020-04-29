package model;

import static org.junit.jupiter.api.Assertions.*;

class ValoresTest extends Valores {

    Valores valores = new Valores();

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @org.junit.jupiter.api.Test
    void testCalcularDistanciaEntreDoisPontosNoPlanoCartesiano() {
        valores.setValorX2(2);
        valores.setValorX1(-3);
        valores.setValorY2(1);
        valores.setValorY1(-11);
        assertEquals(13, valores.calcularDistanciaEntreDoisPontosNoPlanoCartesiano(), 0.0);
    }

    @org.junit.jupiter.api.Test
    void testCalcularDistanciaEntreOsPontosX1eY1() {
        valores.setValorY1(10);
        valores.setValorX1(5);
        assertEquals(5, valores.calcularDistanciaEntreOsPontosX1eY1(), 0.0);
    }

    @org.junit.jupiter.api.Test
    void testCalcularDistanciaEnreOsPontosY2eX2() {
        valores.setValorY2(10);
        valores.setValorX2(5);
        assertEquals(5, valores.calcularDistanciaEnreOsPontosY2eX2(), 0.0);
    }

}
package ar.unlam.reconquistando.armas;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MagiaTest {
    private Arma arma;

    @BeforeEach
    public void setUp() {
        arma = new Magia();
    }

    @Test
    public void testMagia() {
        assertEquals(14, arma.getRangoMinimo());
        assertEquals(28, arma.getRangoMaximo());
        assertEquals(113, arma.getAtaqueBasico());
        
        arma.setRangoMinimo(12);
        assertEquals(12, arma.getRangoMinimo());
        
        arma.setRangoMaximo(12);
        assertEquals(12, arma.getRangoMaximo());
        
        arma.setAtaqueBasico(20);
        assertEquals(20, arma.getAtaqueBasico());
    }
}

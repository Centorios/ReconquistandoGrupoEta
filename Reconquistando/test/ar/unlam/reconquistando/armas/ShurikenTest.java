package ar.unlam.reconquistando.armas;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ShurikenTest {
    private Arma arma;

    @BeforeEach
    public void setUp() {
        arma = new Shuriken();
    }

    @Test
    public void testShuriken() {
        assertEquals(17, arma.getRangoMinimo());
        assertEquals(41, arma.getRangoMaximo());
        assertEquals(56, arma.getAtaqueBasico());
        
        arma.setRangoMinimo(12);
        assertEquals(12, arma.getRangoMinimo());
        
        arma.setRangoMaximo(12);
        assertEquals(12, arma.getRangoMaximo());
        
        arma.setAtaqueBasico(20);
        assertEquals(20, arma.getAtaqueBasico());
    }
}

package ar.unlam.reconquistando.armas;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CatapultaTest {
    private Arma arma;

    @BeforeEach
    public void setUp() {
        arma = new Catapulta();
    }

    @Test
    public void testCatapulta() {
        assertEquals(5, arma.getRangoMinimo());
        assertEquals(46, arma.getRangoMaximo());
        assertEquals(27, arma.getAtaqueBasico());
        
        arma.setRangoMinimo(12);
        assertEquals(12, arma.getRangoMinimo());
        
        arma.setRangoMaximo(12);
        assertEquals(12, arma.getRangoMaximo());
        
        arma.setAtaqueBasico(20);
        assertEquals(20, arma.getAtaqueBasico());
    }
}

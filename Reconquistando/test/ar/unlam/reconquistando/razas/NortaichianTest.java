package ar.unlam.reconquistando.razas;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.unlam.reconquistando.armas.Arco;


class NortaichianTest {

	private Nortaichian nortaichian;

	@BeforeEach
	void setUp() {
		nortaichian = new Nortaichian();
	}

	@Test
	void testConstructor() {
		assertNotNull(nortaichian);
		assertEquals(66, nortaichian.getSaludInicial());
		assertEquals(66, nortaichian.getSaludMaxima());
		assertEquals(0, nortaichian.getContadorDeTurnos());
		assertInstanceOf(Arco.class, nortaichian.getArma());
	}

	@Test
	void testSettersAndGetters() {
		nortaichian.setSaludInicial(150);
		assertEquals(150, nortaichian.getSaludInicial());

		nortaichian.setSaludMaxima(250);
		assertEquals(250, nortaichian.getSaludMaxima());

		nortaichian.setContadorDeTurnos(5);
		assertEquals(5, nortaichian.getContadorDeTurnos());
		
		nortaichian.setAtacado(true);
		assertEquals(true, nortaichian.isAtacado());
		
		nortaichian.setPiedra(true);
		assertEquals(true, nortaichian.isPiedra());
	}
}
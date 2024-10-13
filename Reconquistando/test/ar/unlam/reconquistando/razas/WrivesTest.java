package ar.unlam.reconquistando.razas;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ar.unlam.reconquistando.armas.Magia;


class WrivesTest {

	private Wrives wrives;

	@BeforeEach
	void setUp() {
		wrives = new Wrives();
	}

	@Test
	void testConstructor() {
		assertNotNull(wrives);
		assertEquals(108, wrives.getSaludInicial());
		assertEquals(108, wrives.getSaludMaxima());
		assertEquals(0, wrives.getContadorDeTurnos());
		assertInstanceOf(Magia.class, wrives.getArma());
	}

	@Test
	void testSettersAndGetters() {
		wrives.setSaludInicial(150);
		assertEquals(150, wrives.getSaludInicial());

		wrives.setSaludMaxima(250);
		assertEquals(250, wrives.getSaludMaxima());

		wrives.setContadorDeTurnos(5);
		assertEquals(5, wrives.getContadorDeTurnos());
		
		wrives.setPacifico(true);
		assertEquals(true, wrives.isPacifico());
	}
}
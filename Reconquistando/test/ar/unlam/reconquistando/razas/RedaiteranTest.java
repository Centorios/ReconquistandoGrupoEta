package ar.unlam.reconquistando.razas;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ar.unlam.reconquistando.armas.Shuriken;


class RedaiteranTest {

	private Redaiteran redaiteran;

	@BeforeEach
	void setUp() {
		redaiteran = new Redaiteran();
	}

	@Test
	void testConstructor() {
		assertNotNull(redaiteran);
		assertEquals(36, redaiteran.getSaludInicial());
		assertEquals(36, redaiteran.getSaludMaxima());
		assertEquals(0, redaiteran.getContadorDeTurnos());
		assertInstanceOf(Shuriken.class, redaiteran.getArma());
	}

	@Test
	void testSettersAndGetters() {
		redaiteran.setSaludInicial(150);
		assertEquals(150, redaiteran.getSaludInicial());

		redaiteran.setSaludMaxima(250);
		assertEquals(250, redaiteran.getSaludMaxima());

		redaiteran.setContadorDeTurnos(5);
		assertEquals(5, redaiteran.getContadorDeTurnos());
		
		redaiteran.setContadorDeAtaques(2);
		assertEquals(2, redaiteran.getContadorDeAtaques());
	}
}
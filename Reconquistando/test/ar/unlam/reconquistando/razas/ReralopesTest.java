package ar.unlam.reconquistando.razas;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.unlam.reconquistando.armas.Catapulta;


class ReralopesTest {

	private Reralopes reralopes;

	@BeforeEach
	void setUp() {
		reralopes = new Reralopes();
	}

	@Test
	void testConstructor() {
		assertNotNull(reralopes);
		assertEquals(53, reralopes.getSaludInicial());
		assertEquals(53, reralopes.getSaludMaxima());
		assertEquals(0, reralopes.getContadorDeTurnos());
		assertInstanceOf(Catapulta.class, reralopes.getArma());
	}
	
	@Test
	void testAtacar() {
		reralopes.setContadorAtaques(0);
		reralopes.atacar(reralopes);
		
		reralopes.setContadorAtaques(1);
		reralopes.atacar(reralopes);
	}

	@Test
	void testDescansar() {
		reralopes.descansar();
		assertEquals(3, reralopes.getContadorAtaques());
	}
	
	@Test
	void testRecibirDanio() {
		reralopes.recibirDanio(10);
		assertEquals(0, reralopes.getContadorAtaques());
	}
	
	@Test
	void testSettersAndGetters() {
		reralopes.setSaludInicial(150);
		assertEquals(150, reralopes.getSaludInicial());

		reralopes.setSaludMaxima(250);
		assertEquals(250, reralopes.getSaludMaxima());

		reralopes.setContadorDeTurnos(5);
		assertEquals(5, reralopes.getContadorDeTurnos());
		
		reralopes.setContadorAtaques(1);
		assertEquals(1, reralopes.getContadorAtaques());
	}
}
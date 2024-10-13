package ar.unlam.reconquistando.razas;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.unlam.reconquistando.armas.Arco;


class NortaichianTest {

	private Nortaichian nortaichian;
	private Redaiteran radaiteranAtacado;

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
	void testAtacarSinFuria() {		
		assertEquals(0, nortaichian.getContadorFuria());
		assertEquals(false, nortaichian.isPiedra());
		nortaichian.atacar(radaiteranAtacado);
		assertEquals(66, nortaichian.getSaludInicial());
	}
	
	@Test
	void testAtacarConFuria() {		
		nortaichian.recibirDanio(10);
		assertEquals(2, nortaichian.getContadorFuria());
		assertEquals(false, nortaichian.isPiedra());
		nortaichian.atacar(radaiteranAtacado);
		assertEquals(1, nortaichian.getContadorFuria());
	}
	
	@Test
	void testAtacarSiendoPiedra() {		
		nortaichian.descansar();
		nortaichian.atacar(radaiteranAtacado);
		assertEquals(true, nortaichian.isPiedra());
	}
	
	@Test
	void testRecibirDanio() {
		nortaichian.recibirDanio(50);
		
		assertEquals(2, nortaichian.getContadorFuria());
		assertEquals(16, nortaichian.getSaludInicial());
		
		nortaichian.descansar();
		nortaichian.recibirDanio(10);
		assertEquals(61, nortaichian.getSaludInicial());
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
		
		nortaichian.setContadorFuria(2);
		assertEquals(2, nortaichian.getContadorFuria());
	}
}
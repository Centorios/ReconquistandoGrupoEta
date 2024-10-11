package ar.unlam.reconquistando.razas;

import ar.unlam.reconquistando.armas.Arma;
import ar.unlam.reconquistando.armas.Shuriken;

public class Redaiteran extends Raza {

	private int contadorDeAtaques = 0;
	
	private static final int SALUD_INICIAL = 36;

	public Redaiteran() {
		super(SALUD_INICIAL, SALUD_INICIAL, new Shuriken());
	}

	public int getContadorDeAtaques() {
		return contadorDeAtaques;
	}

	public void setContadorDeAtaques(int contadorDeAtaques) {
		this.contadorDeAtaques = contadorDeAtaques;
	}

	@Override
	public void atacar(Arma arma, Raza objetivo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int descansar() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int recibirDaño() {
		// TODO Auto-generated method stub
		return 0;
	}
}

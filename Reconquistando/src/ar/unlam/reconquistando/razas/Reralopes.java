package ar.unlam.reconquistando.razas;

import ar.unlam.reconquistando.armas.Arma;
import ar.unlam.reconquistando.armas.Catapulta;

public class Reralopes extends Raza {

	private static final int SALUD_INICIAL = 53;

	public Reralopes() {
		super(SALUD_INICIAL, SALUD_INICIAL, new Catapulta());
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

package ar.unlam.reconquistando.razas;

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
	public void atacar(Raza objetivo) {
		// Ver que onda el rango de ataque
		int ataqueExtra = 3 * this.contadorDeAtaques;
		objetivo.recibirDanio(this.arma.getAtaqueBasico() + ataqueExtra);
		this.contadorDeAtaques++;
	}

	@Override
	public void descansar() {
		// no le sucede nada
	}
}

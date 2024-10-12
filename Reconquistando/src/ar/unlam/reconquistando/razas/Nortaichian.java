package ar.unlam.reconquistando.razas;

import ar.unlam.reconquistando.armas.Arco;

public class Nortaichian extends Raza {

	private boolean atacado = false;
	private boolean piedra = false;
	
	private static final int SALUD_INICIAL = 66;
	
	public Nortaichian() {
		super(SALUD_INICIAL, SALUD_INICIAL, new Arco());
	}
	
	@Override
	public void atacar(Raza objetivo) {
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

	public boolean isAtacado() {
		return atacado;
	}

	public void setAtacado(boolean atacado) {
		this.atacado = atacado;
	}

	public boolean isPiedra() {
		return piedra;
	}

	public void setPiedra(boolean piedra) {
		this.piedra = piedra;
	}
}

package ar.unlam.reconquistando.razas;

import ar.unlam.reconquistando.armas.Arco;

public class Nortaichian extends Raza {

	private int contadorFuria = 0;
	private boolean atacado = false;
	private boolean piedra = false;
	
	private static final int SALUD_INICIAL = 66;
	
	public Nortaichian() {
		super(SALUD_INICIAL, SALUD_INICIAL, new Arco());
	}
	
	@Override
	public void atacar(Raza objetivo) {
		int danio = this.getArma().getAtaqueBasico();
		
		if(this.contadorFuria > 0) {
			danio *= 2;
			this.contadorFuria--;
		}
		
		if(!this. piedra) {
			objetivo.recibirDanio(danio);
			super.saludInicial += super.saludInicial * 0.04;
		}
	}

	@Override
	public void descansar() {
		this.saludInicial = this.saludMaxima;
		this.piedra = true;
		// revisar lo de contador contiguo ( que no son los propios ) 
	}

	@Override
	public void recibirDanio(int danio) {
		this.contadorFuria = 2;
		super.recibirDanio(this.piedra ? danio / 2 : danio);
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

	public int getContadorFuria() {
		return contadorFuria;
	}

	public void setContadorFuria(int contadorFuria) {
		this.contadorFuria = contadorFuria;
	}
}

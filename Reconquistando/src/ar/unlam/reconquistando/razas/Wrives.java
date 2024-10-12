package ar.unlam.reconquistando.razas;
import ar.unlam.reconquistando.armas.Magia;

public class Wrives extends Raza {

	private boolean atacado = false;
	
	private static final int AUMENTO_SALUD_MAXIMA = 50;
	private static final int SALUD_INICIAL = 108;

	public Wrives() {
		super(SALUD_INICIAL, SALUD_INICIAL, new Magia());
	}

	@Override
	public void atacar(Raza objetivo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void descansar() {
		
	}

	@Override
	public void recibirDanio(int d) {
	}
	
	public boolean isAtacado() {
		return atacado;
	}

	public void setAtacado(boolean atacado) {
		this.atacado = atacado;
	}
}

package ar.unlam.reconquistando.razas;
import ar.unlam.reconquistando.armas.Magia;
import ar.unlam.reconquistando.escenario.eBando;

public class Wrives extends Raza {
	private boolean pacifico = false;
	private int contadorAtaque = 0;
	private static final int AUMENTO_SALUD = 50;
	private static final int SALUD_INICIAL = 108;

	public Wrives(eBando bando) {
		super(SALUD_INICIAL, SALUD_INICIAL, new Magia(), bando);
	}

	@Override
	public void atacar(Raza objetivo) {
		if(pacifico) 
			return;
		
		contadorAtaque++;
		
		int danio = this.arma.getAtaqueBasico();
		
		if (contadorAtaque % 2 == 0) {
			danio *= 2;
		}
		
		objetivo.recibirDanio(danio);
	}

	@Override
	public void descansar() {
		this.pacifico = true;
		this.saludInicial += AUMENTO_SALUD;
		this.saludMaxima += AUMENTO_SALUD;
	}

	@Override
	public void recibirDanio(int danio) {
		this.pacifico = false;
		super.recibirDanio(danio * 2);
	}

	public boolean isPacifico() {
		return pacifico;
	}

	public void setPacifico(boolean pacifico) {
		this.pacifico = pacifico;
	}

	public int getContadorAtaque() {
		return contadorAtaque;
	}

	public void setContadorAtaque(int contadorAtaque) {
		this.contadorAtaque = contadorAtaque;
	}
}

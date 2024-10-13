package ar.unlam.reconquistando.razas;

import java.util.Random;

import ar.unlam.reconquistando.armas.Catapulta;
import ar.unlam.reconquistando.escenario.eBando;

public class Reralopes extends Raza {

	private int contadorAtaques = 0;
	private static final int SALUD_INICIAL = 53;

	public Reralopes(eBando bando) {
		super(SALUD_INICIAL, SALUD_INICIAL, new Catapulta(), bando);
	}

	@Override
	public void atacar(Raza objetivo) {
		Random random = new Random();
		int resultado = random.nextInt(4); // revisar

        // Si el resultado es 0 o 1, el ataque falla
        if (resultado < 2) {
            // falló el ataque
        } else {
            // Si el resultado es 2 o 3, el ataque tiene éxito
        	int danio = this.arma.getAtaqueBasico() * (this.contadorAtaques > 0 ? 2 : 1);
        	this.contadorAtaques--;
            objetivo.recibirDanio(danio);
        }
	}

	@Override
	public void descansar() {
		this.contadorAtaques = 3;
	}

	@Override
	public void recibirDanio(int danio) {
		this.contadorAtaques = 0;
		super.recibirDanio(danio);
	}
	
	public int getContadorAtaques() {
		return contadorAtaques;
	}

	public void setContadorAtaques(int contadorAtaques) {
		this.contadorAtaques = contadorAtaques;
	}
}

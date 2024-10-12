package ar.unlam.reconquistando.razas;

import ar.unlam.reconquistando.armas.Arma;

public abstract class Raza {

	private int saludInicial;
	private int saludMaxima;
	private int contadorDeTurnos;
	private Arma arma;
	
	public Raza(int saludInicial, int saludMaxima, Arma arma) {
		super();
		this.saludInicial = saludInicial;
		this.saludMaxima = saludMaxima;
		this.contadorDeTurnos = 0;
		this.arma = arma;
	}

	public abstract void atacar(Raza objetivo);
	public abstract int descansar();
	public abstract int recibirDaño();
	
	// setters y getters
	public int getSaludInicial() {
		return saludInicial;
	}

	public void setSaludInicial(int saludInicial) {
		this.saludInicial = saludInicial;
	}

	public int getSaludMaxima() {
		return saludMaxima;
	}

	public void setSaludMaxima(int saludMaxima) {
		this.saludMaxima = saludMaxima;
	}

	public int getContadorDeTurnos() {
		return contadorDeTurnos;
	}

	public void setContadorDeTurnos(int contadorDeTurnos) {
		this.contadorDeTurnos = contadorDeTurnos;
	}

	public Arma getArma() {
		return arma;
	}
}

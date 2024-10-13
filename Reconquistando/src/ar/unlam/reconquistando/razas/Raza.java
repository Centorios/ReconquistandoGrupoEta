package ar.unlam.reconquistando.razas;

import ar.unlam.reconquistando.armas.Arma;
import ar.unlam.reconquistando.escenario.eBando;

public abstract class Raza {

	protected int saludInicial;
	protected int saludMaxima;
	protected int contadorDeTurnos;
	protected Arma arma;
	protected eBando bando;

	public Raza(int saludInicial, int saludMaxima, Arma arma, eBando bando) {
		super();
		this.saludInicial = saludInicial;
		this.saludMaxima = saludMaxima;
		this.contadorDeTurnos = 0;
		this.arma = arma;
		this.bando = bando;
	}

	public abstract void atacar(Raza objetivo);
	public abstract void descansar();
	
	public void recibirDanio(int danioRecibido) {
		this.saludInicial -= danioRecibido;
	}
	
	public boolean estaDesmayado() {
		return saludInicial <= 0;
	}
	
	public boolean estaHerido() {
		return this.saludInicial != this.saludMaxima;
	}
	
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
	
	public eBando getBando() {
		return bando;
	}
}

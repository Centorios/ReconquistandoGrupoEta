package ar.unlam.reconquistando.armas;

public abstract class Arma {
	private int rangoMinimo;
	private int rangoMaximo;
	private int ataqueBasico;
	
	public Arma(int rangoMinimo, int rangoMaximo, int ataqueBasico) {
		this.rangoMinimo = rangoMinimo;
		this.rangoMaximo = rangoMaximo;
		this.ataqueBasico = ataqueBasico;
	}

	public int getRangoMinimo() {
		return rangoMinimo;
	}

	public void setRangoMinimo(int rangoMinimo) {
		this.rangoMinimo = rangoMinimo;
	}

	public int getRangoMaximo() {
		return rangoMaximo;
	}

	public void setRangoMaximo(int rangoMaximo) {
		this.rangoMaximo = rangoMaximo;
	}

	public int getAtaqueBasico() {
		return ataqueBasico;
	}

	public void setAtaqueBasico(int ataqueBasico) {
		this.ataqueBasico = ataqueBasico;
	}

}

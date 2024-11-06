package ar.unlam.reconquistando.graph_structure;

public class Camino {

	private String destino;
	private int distancia;

	public Camino(String destino, int distancia) {
		this.destino = destino;
		this.distancia = distancia;
	}

	public String getDestino() {
		return destino;
	}

	public int getDistancia() {
		return distancia;
	}
}

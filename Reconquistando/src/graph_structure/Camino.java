package graph_structure;

public class Camino {

	private Nodo destino;
	private int distancia;

	public Camino(Nodo destino, int distancia) {
		this.destino = destino;
		this.distancia = distancia;
	}

	public Nodo getDestino() {
		return destino;
	}

	public int getdistancia() {
		return distancia;
	}
}

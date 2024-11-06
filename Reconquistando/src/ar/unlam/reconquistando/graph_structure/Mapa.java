package ar.unlam.reconquistando.graph_structure;

import java.util.*;

public class Mapa {
	private static Mapa instancia; // Singleton
	private Map<Nodo, List<Camino>> listaAdyacencia;
	private String startPoint;
	private String endPoint;

	// Constructor privado para el patrón singleton
	private Mapa() {
		listaAdyacencia = new HashMap<>();
	}

	// Método para obtener la instancia única de Mapa
	public static Mapa getInstancia() {
		if (instancia == null) {
			instancia = new Mapa();
		}
		return instancia;
	}

	public boolean agregarNodo(String nombre, int habitantes, String raza, String tipo) {
		Nodo nodo = new Nodo(nombre, habitantes, raza, tipo);

		 if (listaAdyacencia.containsKey(nodo)) {
		        return false;
		    }
		 listaAdyacencia.put(nodo, new ArrayList<>());
		 return true;
	}

	public void agregarArista(String nombreOrigen, String nombreDestino, int distancia) {
		Nodo origen = buscarNodo(nombreOrigen);
		Nodo destino = buscarNodo(nombreDestino);
		if (origen != null && destino != null) {
			listaAdyacencia.get(origen).add(new Camino(nombreDestino, distancia));
			listaAdyacencia.get(destino).add(new Camino(nombreOrigen, distancia));
		}
	}

	// Método para obtener los vecinos de un nodo
	public List<Camino> obtenerVecinos(Nodo nodo) {
		return listaAdyacencia.getOrDefault(nodo, Collections.emptyList());
	}

	public Nodo buscarNodo(String nombre) {
		for (Nodo nodo : listaAdyacencia.keySet()) {
			if (nodo.getNombrePoblado().equals(nombre)) {
				return nodo;
			}
		}
		return null;
	}

	public void setStartPoint(String start) {
		startPoint = start;
	}

	public void setEndPoint(String end) {
		endPoint = end;
	}
	
	public String getStartPoint() {
		return startPoint;
	}

	public String getEndPoint() {
		return endPoint;
	}

	public Nodo obtenerNodoInicial() {
		return buscarNodo(startPoint);
	}

	public Nodo obtenerNodoFinal() {
		return buscarNodo(endPoint);
	}
}
package ar.unlam.reconquistando.graph_structure;
import java.util.Objects;

public class Nodo {
    private String nombrePoblado;
    private String raza;
    private String tipo; // puede ser "propio", "aliado", "enemigo"
    private int habitantes; 

    public Nodo(String nombrePoblado, int habitantes, String raza, String tipo) {
        this.nombrePoblado = nombrePoblado;
        this.habitantes = habitantes;
        this.raza = raza;
        this.tipo = tipo;
    }

    public String getNombrePoblado() {
        return nombrePoblado;
    }

    public int getHabitantes() {
        return habitantes;
    }

    public String getRaza() {
        return raza;
    }

    public String getTipo() {
        return tipo;
    }

    // Necesarias para insertar, eliminar y buscar en el mapa 
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Nodo nodo = (Nodo) o;
        return nombrePoblado.equals(nodo.nombrePoblado);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombrePoblado);
    }
}
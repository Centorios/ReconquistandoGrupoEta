package ar.unlam.reconquistando.main;

import ar.unlam.reconquistando.graph_structure.*;

import java.util.List;

import org.junit.Assert;

import ar.unlam.reconquistando.File_Processing.FileMap;
/*
import ar.unlam.reconquistando.escenario.eBando;
import ar.unlam.reconquistando.razas.Nortaichian;
import ar.unlam.reconquistando.razas.Raza;
import ar.unlam.reconquistando.razas.Reralopes;
import ar.unlam.reconquistando.razas.Wrives;
import ar.unlam.reconquistando.tda.ColaDePrioridad;
import ar.unlam.reconquistando.tda.ComparadorRaza;
*/ 
@SuppressWarnings("unused")
public class Main {

	public static void main(String[] args) {
		
		FileMap archMapa = new FileMap("Input_1.txt");
		archMapa.leerArchivoMapa();						//se carga el mapa que es singleton
		
		
		/*
		 //Prueba exitosa de lectura de archivo y obtencion de datos de las estructuras cargadas
		  
		 System.out.println(Mapa.getInstancia().buscarNodo("1").getRaza());
		
		List<Camino> vecinosDeUno = Mapa.getInstancia().obtenerVecinos(Mapa.getInstancia().buscarNodo("1"));
		for (Camino camino : vecinosDeUno) {
		    
		    int distancia = camino.getDistancia(); 
		    String destino = camino.getDestino();

		    System.out.println("Distancia: " + distancia + ", Destino: " + destino);
		}
		*/
		
/*		ColaDePrioridad<Raza> cola = new ColaDePrioridad<>(10, new ComparadorRaza());
		Raza daniadaAliada = new Reralopes(eBando.ALIADO);
		daniadaAliada.recibirDanio(10);
		
		Raza daniadaPropio = new Nortaichian(eBando.PROPIO);
		daniadaPropio.recibirDanio(20);
		
		Raza daniadaAliada2 = new Wrives(eBando.ALIADO);
		daniadaAliada2.recibirDanio(10);
		
        // Agregar guerreros
        cola.insert(new Nortaichian(eBando.PROPIO));
        cola.insert(daniadaPropio);
        cola.insert(daniadaAliada);
        cola.insert(new Nortaichian(eBando.PROPIO));
        cola.insert(daniadaPropio);
        cola.insert(daniadaAliada2);
        cola.insert(new Nortaichian(eBando.ALIADO));
        cola.insert(daniadaAliada2);

        // Procesar la cola
        while (!cola.isEmpty()) {
            Raza guerrero = cola.extractMax();
            System.out.println(guerrero.getBando() + ", Salud: " + guerrero.getSaludInicial()
            		+ " / " + guerrero.getSaludMaxima());
        }
*/
	}
}
package ar.unlam.reconquistando.File_Processing;
import ar.unlam.reconquistando.graph_structure.*;

import java.io.File;
import java.util.Scanner;

public class FileMap {

	private String ruta;

	// Constructor
	public FileMap(String ruta) {
		this.ruta = ruta;
	}
	
	public boolean leerArchivoMapa() {
		Scanner scanner = null;
		Mapa mapa = Mapa.getInstancia();

		String nombrePoblado;
		int habitantes; 
	    String raza;
	    String tipo; 
	    	    
	    String destino;
	    String origen;
		int distancia;
	      
		int nroNodos=0;
		int i;

		try {
			File file = new File(this.ruta);
			scanner = new Scanner(file);

			if(scanner.hasNext())
				nroNodos= scanner.nextInt();
			
			for(i = 0 ; i < nroNodos ; i++) {
				
					nombrePoblado = scanner.next();
					habitantes = scanner.nextInt();
				    raza = scanner.next();
				    tipo = scanner.next(); 				    
					mapa.agregarNodo(nombrePoblado, habitantes, raza, tipo);
				
			}						//fin del for controlando el numero de nodos
			
			//Lectura de nodos inicial y final
			
			scanner.nextLine();					
		    String linea = scanner.nextLine();

		    if (linea.contains("->")) {	
		            
		    String[] partes = linea.split("->"); 
		    
		    mapa.setStartPoint(partes[0].trim());
		    mapa.setEndPoint(partes[1].trim());
		            
		    }	
		    
		    //Lectura de caminos
		    
		    while(scanner.hasNext())
		    {
		    	origen = scanner.next();
		    	destino = scanner.next();
		 		distancia = scanner.nextInt();

		 		mapa.agregarArista(origen, destino, distancia);
		 		
		    }

		} catch (Exception e) {
			e.printStackTrace();
			return false;
		} finally {				//se ejecuta siempre
			scanner.close();
		}
		return true;
	}
}

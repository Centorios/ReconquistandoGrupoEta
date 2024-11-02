package graph_structure;

import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.Assert;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class Map_Test_File {

	 private Mapa mapa;
	 
	@BeforeAll
	public void setUp() {
		mapa = Mapa.getInstancia();
		
		//Agregamos algunos nodos al mapa
		mapa.agregarNodo("1", 100, "Wrives", "propio");
        mapa.agregarNodo("2", 30, "Reralopes", "aliado");
        mapa.agregarNodo("3", 40, "Nortaichian", "enemigo");
        mapa.agregarNodo("4", 70, "Radaiteran", "enemigo");
        
        //Agregamos aristas entre los nodos
        mapa.agregarArista("1", "2", 10);
        mapa.agregarArista("1", "3", 20);
        mapa.agregarArista("2", "3", 5);
        //el 4 no tiene aristas
	
        mapa.setStartPoint("1");
	}
 
	//Comprobamos que los poblados existen en el mapa
	
	@Test
	public void testExistencia() {
		
		Assert.assertEquals("Wrives", mapa.buscarNodo("1").getRaza());
		Assert.assertEquals(null, mapa.buscarNodo("5"));
	}
	
	
	//Comprobamos que hay aristas/caminos en uno de ellos, y si no hay caminos en otro
	
	@Test
	public void testCaminos() {
		// obtenerVecinos(nodoConAristas)
		Nodo nodoConAristas =  mapa.buscarNodo("3");
		Nodo nodoSinAristas =  mapa.buscarNodo("4");
		
		List<Camino> vecinosDeCuatro = mapa.obtenerVecinos(nodoSinAristas);
	    Assert.assertTrue(vecinosDeCuatro.isEmpty());	//el nodo 4 tiene 0 vecinos
	     
	    List<Camino> vecinosDeTres = mapa.obtenerVecinos(nodoConAristas);
	    Assert.assertEquals(2, vecinosDeTres.size());	//el nodo 3 tiene 2 vecinos
		
	}
	
	//Comprobamos que no se puede insertar un nodo con el mismo nombre de poblado
	//(pero difiriendo en los demas datos) asegurando la comparacion del hashmap
	
	@Test
    public void testAgregarNodoYaExistente() {
        
        boolean agregadoSegundaVez = mapa.agregarNodo("1", 95, "Raidateran", "enemigo");
        
        Assert.assertFalse(agregadoSegundaVez);
    }

}

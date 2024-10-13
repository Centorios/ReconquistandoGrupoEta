package ar.unlam.reconquistando.tda;

import java.util.Comparator;

import ar.unlam.reconquistando.escenario.eBando;
import ar.unlam.reconquistando.razas.Raza;

public class ComparadorRaza implements Comparator<Raza> {

	@Override
	public int compare(Raza raza1, Raza raza2) {
		// Prioridad:
        // 1. Razas aliados sin daño
        // 2. Razas propios sin daño
        // 3. Razas aliados con daño
		// 4. Razas propios con daño

        if (raza1.estaHerido() != raza2.estaHerido()) {
            return raza1.estaHerido() ? 1 : -1;
        } else if (!raza1.estaHerido() && !raza2.estaHerido()) {
        	return raza1.getBando().equals(eBando.ALIADO) ? -1 : 1;
        } else {
        	return raza1.getBando().equals(eBando.ALIADO) ? -1 : 1;
        }
	}	
}

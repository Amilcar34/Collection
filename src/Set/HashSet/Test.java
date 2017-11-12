package Set.HashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
/**
 *Se hace una lista Set.HashSet ya que se requiere algo que procese rapido 
 *y noes de prioridad en orden en que se vallan cargando los objetos
 *
 *Se instancia HashSet ya que no se quieren objetos duplicados
 */

public final class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Empleados e1 = new Empleados("Jorge", 534653);
		Empleados e2 = new Empleados("Javier", 5324653);
		Empleados e3 = new Empleados("Chespirito", 87987984);
		Empleados e4 = new Empleados("Lorena", 321332168);
		Empleados e5 = new Empleados("Laura", 5684354);
		
		
		Set<Empleados> listaEmpleados = new HashSet<Empleados>();
		
		listaEmpleados.add(e1);
		listaEmpleados.add(e2);
		listaEmpleados.add(e3);
		listaEmpleados.add(e4);
		listaEmpleados.add(e5);
		
		
		//Muestro todos los obj del Set.HashSet
		for (Iterator iterator = listaEmpleados.iterator(); iterator.hasNext();) {
			Empleados empleados = (Empleados) iterator.next();
			
			System.out.println(empleados.getNombre());
		}
		
		System.out.println();
		
		//Itero el Set.HashSet para buscar un obj en particular y eliminarlo
		Iterator<Empleados> it = listaEmpleados.iterator();
		
		while (it.hasNext()) {
			Empleados obj = it.next();
			
			if (obj.getNombre().equals("Jorge"))
				it.remove();
		}
		
		//muestro los cambioes efectuados
		for (Empleados empleados : listaEmpleados) {
			System.out.println(empleados.getNombre());
		}
	}

}

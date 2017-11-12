package Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

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
		
		
		//Muestro todos los obj del Set
		for (Iterator iterator = listaEmpleados.iterator(); iterator.hasNext();) {
			Empleados empleados = (Empleados) iterator.next();
			
			System.out.println(empleados.getNombre());
		}
		
		System.out.println();
		
		//Itero el Set para buscar un obj en particular y eliminarlo
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

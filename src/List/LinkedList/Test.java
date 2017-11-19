package List.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class Test {

	public static void main(String[] args) {

		List<Persona> li = new LinkedList<Persona>();

		li.add(new Persona("Juan", "Alberto"));
		li.add(new Persona("Cacho", "rodriguez"));
		li.add(new Persona("Lorena", "Trigatio"));
		li.add(new Persona("Jimena", "Torres"));
		li.add(new Persona("Lucas", "Vitalio"));

		for (Persona per : li) {

			System.out.println(per.getNombre() + " " + per.getApellido());
		}

		System.out.println();
		Iterator<Persona> it = li.iterator();

		while (it.hasNext()) {
			Persona persona = (Persona)it.next();

			System.out.println(persona.getNombre());
			if(persona.getNombre().equals("Lorena"));
				persona.setNombre("Mabel");
		}

		System.out.println();
		for (Persona persona : li) {
			System.out.println(persona.getNombre() + " " + persona.getApellido());
		}

	}

}

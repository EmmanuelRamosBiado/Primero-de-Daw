/*
 *      TestHashMap
 *      
 *      Ejemplo de los métodos más habituales de un HashMap
 *      Recorrido de valores y claves
 *      Ordenación de claves y valores.
 *      
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class TestHashMap {

	public static void main(String argv[]) {

		HashMap<Integer, Alumno> ma = new HashMap<Integer, Alumno>();

		// Uso de clave un campo de objeto, esto no siempre es necesario.
		ma.put(9101, new Alumno(9101, "Juan", 8.5f));
		ma.put(9010, new Alumno(9010, "Eva", 7.7f));
		ma.put(9052, new Alumno(9052, "Elena", 5.5f));
		ma.put(9023, new Alumno(9023, "Pedro", 6.5f));

		Alumno al = ma.remove(9052); // Devuelve el objeto borrado
		ma.remove(1111); // Devuelve Null

		// Lo vuelvo a introducir
		ma.put(al.nummatricula, al);

		// Si contiene la clave obtengo su valor
		if (ma.containsKey(9052)) {
			System.out.println(" El mapa contiene " + ma.get(9052));
		}

		System.out.println("\nLista de todos las claves:");
		// Obtener todas las claves SET
		for (Integer clave : ma.keySet()) {
			System.out.println(">" + clave);
		}

		System.out.println("\nLista de todos los valores:");
		// Obtener todos los valores: Collections
		for (Alumno alum : ma.values()) {
			System.out.println(">" + alum);
		}

		System.out.println("\nLista de todos las entradas: clave -> valor");
		// Obtener el conjunto de entradas pares clave - valor
		for (Map.Entry entrada : ma.entrySet()) {
			System.out.println(">" + entrada.getKey() + ":" + entrada.getValue());
		}

		System.out.println("\nLista de ORDENADA todos las claves:");
		// Se puede tener ordenado un map por clave si utilizamos un TreeMap en vez de
		// HashMap
		// Pero es mas lento
		TreeMap<Integer, Alumno> tm = new TreeMap<Integer, Alumno>(ma);
		// Obtener todas las claves SET
		for (Integer clave : tm.keySet()) {
			System.out.println(">" + clave + "->" + tm.get(clave));
		}

		System.out.println("\nLista de ORDENADA todos las valores:");
		// Siempre podemos ordenar los valores o las claves si obtenemos la lista de
		// valores y la ordenamos
		List<Alumno> listalum = new ArrayList<Alumno>(ma.values());

		// Ordenarlos por nombre con una expresión lambda directamente
		Collections.sort(listalum, (al1, al2) -> al1.nombre.compareTo(al2.nombre));

		for (Alumno alum : listalum) {
			System.out.println(">" + alum);
		}

	}

}

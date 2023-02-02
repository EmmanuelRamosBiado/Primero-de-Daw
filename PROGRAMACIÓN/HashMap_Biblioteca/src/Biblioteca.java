import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Biblioteca {
	public static void main(String argv[]) {

		HashMap<String, Libro> disponibles = new HashMap<String, Libro>();
		HashMap<String, Libro> prestados = new HashMap<String, Libro>();

		Scanner sc = new Scanner(System.in);

		// Rellenar las listas con valores de prueba
		Libro nuevo = new Libro(19, "El Quijote", " Cervantes", Genero.NOVELA, 2012);

		disponibles.put(nuevo.titulo, nuevo);
		disponibles.put("El Buscón", new Libro(20, "El Buscón", "Quevedo", Genero.NOVELA, 1997));
		disponibles.put("Romeo y Julieta", new Libro(21, "Romeo y Julieta", "Shakespeare ", Genero.TEATRO, 1997));
		disponibles.put("Mio Cid", new Libro(22, "Mio Cid", "Anónimo", Genero.POESIA, 1989));

		System.out.println("Libros disponibles:");
		// Ordenacion de objetos --> Interfaz Comparable
		// Collections.sort(disponibles);
		verCatalogo(disponibles.values());

		prestados.put("Harry Potter I", new Libro(30, "Harry Potter I", "J. K. Rowling", Genero.NOVELA, 1998));
		prestados.put("Guerra y Paz", new Libro(34, "Guerra y Paz", "León Tolstói", Genero.NOVELA, 1975));
		prestados.put("El Decamerón", new Libro(19, "El Decamerón", "Giovanni Boccaccio", Genero.CUENTOS, 1992));

		System.out.println("Libros prestados:");
		// Collections.sort(prestados);
		verCatalogo(prestados.values());

		// Pedir datos al usuarios y probar el método prestarLibro

		System.out.println(" ¿Que libro desea?:");
		String titulo = sc.nextLine();
		int resu = prestarLibro(titulo, prestados, disponibles);
		if (resu == 0)
			System.out.println("El libro no está en el catalogo");
		else if (resu == -1)
			System.out.println("El libro está prestado");
		else
			System.out.println("Su pestamo ha sido anotado");

		System.out.println("Libros disponibles:");
		// Collections.sort(disponibles);
		verCatalogo(disponibles.values());

		System.out.println("Libros prestados:");
		// Collections.sort(prestados);
		verCatalogo(prestados.values());

	}

	private static void verCatalogo(Collection<Libro> lista) {
		List<Libro> listaaux = new ArrayList<Libro>(lista);
		Collections.sort(listaaux);
		int i = 1;
		for (Libro l : listaaux) {
			System.out.println((i) + ":" + l);
			i++;
		}

	}

	// Primera version: realizo una busqueda secuencial

	/*
	 * private static Libro buscarId(String titulo, HashMap<String, Libro> lista) {
	 * 
	 * Libro resu = null; // For sobre colecciones o arrays for (Libro libroaux
	 * :lista) { if (libroaux.titulo.equals(titulo)) { resu = libroaux; break; } }
	 * return resu; // Devuelo le libro o null si no esta }
	 * 
	 */

	/*
	 * Devuelve: 0 si no existe el libro en niguna de la listas 1 Si puede
	 * prestarlo, el libro pasa de ldisponibles a lprestados -1 Si ya esta prestado.
	 */

	public static int prestarLibro(String titulo, HashMap<String, Libro> lprestados,
			HashMap<String, Libro> ldisponibles) {

		// Busco en ambas listas
		Libro libroprestado = lprestados.get(titulo);
		Libro librodisponible = ldisponibles.get(titulo);

		if (libroprestado == null && librodisponible == null)
			return 0; // No esta en catalogo
		if (libroprestado != null)
			return -1; // Esta prestado

		ldisponibles.remove(librodisponible.titulo);
		lprestados.put(librodisponible.titulo, librodisponible);
		return 1;
	}

}

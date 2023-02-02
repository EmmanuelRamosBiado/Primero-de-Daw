
/**
 * Write a description of class Biblioteca here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Biblioteca {
	public static void main(String argv[]) {

		ArrayList<Libro> disponibles = new ArrayList<Libro>();
		ArrayList<Libro> prestados = new ArrayList<Libro>();
		Scanner sc = new Scanner(System.in);

		// Rellenar las listas con valores de prueba
		Libro nuevo = new Libro(19, "El Quijote", " Cervantes", Genero.NOVELA, 2012);

		disponibles.add(nuevo);
		disponibles.add(new Libro(20, "El Buscón", "Quevedo", Genero.NOVELA, 1997));
		disponibles.add(new Libro(21, "Romeo y Julieta", "Shakespeare ", Genero.TEATRO, 1997));
		disponibles.add(new Libro(22, "Mio Cid", "Anónimo", Genero.POESIA, 1989));

		prestados.add(new Libro(30, "Harry Potter I", "J. K. Rowling", Genero.NOVELA, 1998));
		prestados.add(new Libro(34, "Guerra y Paz", "León Tolstói", Genero.NOVELA, 1975));
		prestados.add(new Libro(49, "El Decamerón", "Giovanni Boccaccio", Genero.CUENTOS, 1992));

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

	}

	/*
	 * Devuelve: 0 si no existe el libro en niguna de la listas 1 Si puede
	 * prestarlo, el libro pasa de ldisponibles a lprestados -1 Si ya esta prestado.
	 */
	public static int prestarLibro(String titulo, ArrayList<Libro> lprestados, ArrayList<Libro> ldisponibles) {

		int idprestado = buscarId(titulo, lprestados);
		int iddisponible = buscarId(titulo, ldisponibles);

		if (idprestado == -1 && iddisponible == -1)
			return 0; // No esta en catalogo
		if (idprestado != -1)
			return -1; // Esta prestado

		Libro libroaPrestar = ldisponibles.remove(iddisponible);
		lprestados.add(libroaPrestar);
		return 1;
	}

	public static int buscarId(String titulo, ArrayList<Libro> lista) {
		int valor = -1;

		for (Libro libroaux : lista) {
			if (libroaux.titulo.equals(titulo)) {
				valor = libroaux.id;
				break;
			}
		}

		return valor;
	}

}

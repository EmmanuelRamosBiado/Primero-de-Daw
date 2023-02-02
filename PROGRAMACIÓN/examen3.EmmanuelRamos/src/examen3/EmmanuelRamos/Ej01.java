package examen3.EmmanuelRamos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ej01 {

	public static void main(String[] args) throws FileNotFoundException {

		int nlinea = 1;
		int contador = 0;
		String linea;

		String palabra = args[1];

		if (args.length != 2) {
			System.out.println("Error en parámetros  <Fichero><palabra>");
			System.exit(1);
		}

		String fichero1 = args[0];

		File f1 = new File(fichero1);
		Scanner sc = new Scanner(f1);

		if (!f1.canRead()) {
			System.out.println("Error: no se puede leer el fichero:" + args[1]);
		}

		while (sc.hasNext()) {
			linea = sc.nextLine();
			if (linea.contains(palabra)) {
				System.out.println(nlinea + ": " + linea);
				contador++;
			}
			nlinea++;
		}

		System.out.println("La palabra " + args[1] + " aparece " + contador + " veces en el fichero");

		sc.close();

	}

}

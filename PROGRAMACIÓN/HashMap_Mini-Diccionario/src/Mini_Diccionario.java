import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Mini_Diccionario {

	public static void main(String[] args) {
		HashMap<String, String> diccionario = new HashMap<>();

		int correctas = 0;
		int erroneas = 0;

		Scanner sc = new Scanner(System.in);

		diccionario.put("comer", "eat");
		diccionario.put("beber", "drink");
		diccionario.put("papel", "paper");
		diccionario.put("perro", "dog");
		diccionario.put("manzana", "apple");
		diccionario.put("agua", "water");
		diccionario.put("fuego", "fire");
		diccionario.put("brazo", "arm");
		diccionario.put("electricidad", "electricity");
		diccionario.put("ciudad", "city");

		// Creo en un ArrayList a partir de la lista de clave para poder acceder por
		// posición
		// Podemos crear una Colección a partir de otra aunque sean de distinto tipo
		ArrayList<String> listaEspañol = new ArrayList<String>(diccionario.keySet());

		/* ----------- PRIMERA FORMA MÁS SENCILLA --- */

		System.out.println(" PRIMERA FORMA:");
		// Desordeno la lista de forma aleatoria
		Collections.shuffle(listaEspañol);

		System.out.println(" Indique cual es la traducción a inglés de la siguientes palabras:");

		int puntos = 0;
		// Pregunto por las 5 primeras (no hay posibles repeticiones)
		for (int i = 0; i < 5; i++) {

			String palabraEnEspañol = listaEspañol.get(i); // Palabra en español aleatoria
			System.out.print(palabraEnEspañol + " ? ");
			String palabraEnIngles = sc.next();
			String resu = diccionario.get(palabraEnEspañol);
			if (resu.contentEquals(palabraEnIngles)) {
				System.out.println("> Respuesta correcta.");
				puntos++;
			} else {
				System.out.println("> Error. La respuesta correcta es " + resu);
			}
		}

		System.out.println(" Has acertado " + puntos + " de cinco palabras.");

	}

}

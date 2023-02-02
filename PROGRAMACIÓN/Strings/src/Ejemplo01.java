import java.util.Arrays;

public class Ejemplo01 {

	public static void main(String[] args) {

		int prueba[][] = { { 3, 3, 3 }, { 4, 3, 6 }, { 7, 3, 3 } };
		int prueba2[] = { 1, 2, 3, 4, 5, 7, 6, 5, 12, 112, 34 };
		int numero = 3;

		System.out.println("Número de veces que se repite el número: " + numVecesNumero(prueba, numero));
		System.out.println(Arrays.toString(prueba2));
		Arrays.sort(prueba2);
		System.out.println(Arrays.toString(prueba2));
	}

	public static int numVecesNumero(int tabla[][], int num) {
		int cont = 0;

		if (tabla != null) {
			for (int fila = 0; fila < tabla.length; fila++) {
				for (int columna = 0; columna < tabla[fila].length; columna++) {
					if (tabla[fila][columna] == num) {
						cont++;
					}
				}
			}
		}

		return cont;

	}

}

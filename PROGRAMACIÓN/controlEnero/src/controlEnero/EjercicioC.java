package controlEnero;

public class EjercicioC {

	public static void main(String[] args) {

		int tabla[][] = { { 10, 20, 32 }, { 12, 500, 23 }, { 2, 34, 5, 10, 53, 5 }, { 23, 12 } };

		System.out.println("sdcsc" + coordMax(tabla));
	}

	public static int[] coordMax(int matriz[][]) {

		int array[] = new int[2];
		int fila = 0;
		int columna = 0;

		int mayor = matriz[0][0];

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (matriz[i][j] > mayor) {
					mayor = matriz[i][j];
					fila = i;
					columna = j;

				}
			}
		}

		array[0] = fila;
		array[1] = columna;

		return array;
	}

}

package controlEnero;

public class EjercicioB {

	public static void main(String[] args) {

		int tabla[] = { 10, 34, 3, 5 };
		int numero = 12;

		añadirValor(tabla, numero);

		for (int i = 0; i < args.length; i++) {
			System.out.println(tabla[i]);
		}
	}

	public static void añadirValor(int tabla[], int valor) {

		for (int i = tabla.length - 1; i == 0 ; i--) {
			for (int j = tabla.length; j == 0 ; j--) {
				int aux = tabla[j];
				tabla[j] = tabla[j-1];
				tabla[j-1] = aux;
			}
		}
		
		tabla[0] = valor;

	}
}

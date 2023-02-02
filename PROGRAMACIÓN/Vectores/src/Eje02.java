import java.util.Scanner;

public class Eje02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tabla[] = new int[10];
		for (int i = 0; i < tabla.length; i++) {
			System.out.print("Introduce valor nº " + (i + 1) + ": ");
			tabla[i] = sc.nextInt();
		}
		invertirTabla(tabla);
		System.out.println("Tabla invertida :");
		for (int i = 0; i < tabla.length; i++) {
			System.out.print(tabla[i] + " ");
		}

	}

	public static void invertirTabla(int[] tabla) {
		int aux;
		for (int i = 0; i < tabla.length / 2; i++) {
			aux = tabla[i];
			tabla[i] = tabla[tabla.length - i - 1];
			tabla[tabla.length - (i + 1)] = aux;
		}
	}
}

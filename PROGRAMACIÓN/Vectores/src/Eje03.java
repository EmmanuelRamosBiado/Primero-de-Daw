import java.util.Scanner;

public class Eje03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tabla[] = new int[10];
		for (int i = 0; i < tabla.length; i++) {
			System.out.print("Introduce valor n� " + (i + 1) + ": ");
			tabla[i] = sc.nextInt();
		}

		System.out.println("N�meros pares: ");
		for (int i = 0; i < tabla.length; i++) {
			if (tabla[i] % 2 == 0) {
				System.out.print(tabla[i] + " ");
			}
		}

		System.out.println("");

		System.out.println("N�mero impares: ");
		for (int i = 0; i < tabla.length; i++) {
			if (tabla[i] % 2 != 0) {
				System.out.print(tabla[i] + " ");
			}
		}
	}

}

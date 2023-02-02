import java.util.Scanner;

public class Eje14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tabla[] = new int[5];
		for (int i = 0; i < tabla.length; i++) {
			System.out.print("Introduce el valor del nº " + (i + 1) + " :");
			tabla[i] = sc.nextInt();
		}

		for (int i = 0; i < tabla.length; i++) {
			System.out.print(tabla[i] + ":");
			for (int j = 0; j < tabla[i]; j++) {

				System.out.print("*");
			}
			System.out.println();
		}

	}

}

import java.util.Scanner;

public class Eje09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tabla[] = new int[10];
		boolean valor = false;

		for (int i = 0; i < tabla.length; i++) {
			System.out.print("Introduce valor nº " + (i + 1) + ": ");
			tabla[i] = sc.nextInt();
		}

		for (int i = 0; i < (tabla.length - 1); i++) {
			if (tabla[i] < tabla[i + 1]) {
				valor = true;
			} else {
				valor = false;
				break;
			}
		}

		if (valor == true) {
			System.out.println("La tabla está ordenanda.");
		} else {
			System.out.println("La tabla no está ordenada.");
		}

	}

}

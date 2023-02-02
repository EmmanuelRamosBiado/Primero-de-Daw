import java.util.Scanner;

public class Eje19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tabla[] = new int[10];
		int valor = 1;
		int i = 0;

		do {
			System.out.print("Escribe un número, y si quieres terminar introduce 0: ");
			valor = sc.nextInt();
			if (valor % 3 == 0) {

				tabla[i] = valor;
				i++;
			}
		} while (valor != 0);

		System.out.println("Números divisibles entre 3: ");
		for (i = 0; i < tabla.length; i++) {
			if (tabla[i] != 0) {
				System.out.println(tabla[i]);
			}
		}
	}

}

import java.util.Scanner;

public class Eje05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tabla[] = new int[20];
		float media = 0;
		float porcentaje = 0;
		int suma = 0;
		int cont = 0;
		for (int i = 0; i < tabla.length; i++) {
			System.out.print("Introduce el valor nº " + (i + 1) + " :");
			tabla[i] = sc.nextInt();
			suma += tabla[i];
		}

		media = (suma / 20);

		for (int i = 0; i < tabla.length; i++) {
			if (tabla[i] > media) {
				cont++;
			}
		}

		porcentaje = ((cont * 100) / 20);
		System.out.println("Porcentaje de valores que superan la media: " + porcentaje + " %");
	}

}

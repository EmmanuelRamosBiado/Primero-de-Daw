package controlEnero;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int tabla[] = new int[30];

		// Ejercicio A

		for (int i = 0; i < tabla.length; i++) {
			tabla[i] = r.nextInt(1000 - 100) + 100;
		}

		// Ejercicio B

		Arrays.sort(tabla);

		// Ejercicio C

		System.out.print("Introduce un número: ");
		int valor = sc.nextInt();

		for (int i = 0; i < tabla.length; i++) {
			if (tabla[i] == valor) {
				System.out.println("El número que ha introducido se encuentra en la tabla.");
			} else {
				System.out.println("El número que ha introducido no se encuentra en la tabala.");
			}
		}
	}

}

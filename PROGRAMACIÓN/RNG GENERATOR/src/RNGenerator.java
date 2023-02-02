import java.util.Random;
import java.util.Scanner;

public class RNGenerator {

	public static void main(String[] args) {

		generaNum();

	}

	private static void generaNum() {
		Random rd = new Random();
		
		int valor = rd.nextInt(pideNumMax()) + 1;
		System.out.println(valor);
	}

	private static int pideNumMax() {
		Scanner sc = new Scanner(System.in);
		int numero = 0;

		System.out.print("Introduce un número: ");
		numero = sc.nextInt();

		return numero;
	}

}

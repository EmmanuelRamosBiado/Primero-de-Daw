import java.util.InputMismatchException;
import java.util.Scanner;

public class Eje_01 {

	public static void main(String[] args) {

		int num1 = 0;
		int num2 = 0;
		int resu = 0;
		char operador;
		boolean error;

		Scanner sc = new Scanner(System.in);

		do {
			error = false;
			System.out.print("Introduce un n�mero: ");
			try {
				num1 = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Eso no es un n�mero");
				sc.next();
				error = true;
			}
		} while (error);

		do {
			error = false;
			System.out.print("Introduce otro n�mero: ");
			try {
				num2 = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Eso no es un n�mero");
				sc.next();
				error = true;
			}
		} while (error);

		System.out.println("Sumar (+)");
		System.out.println("Restar (-)");
		System.out.println("Multiplicar (*)");
		System.out.println("Dividir (/)");
		operador = sc.next().charAt(0);

		switch (operador) {
		case '+': {

			resu = num1 + num2;
			break;
		}
		case '-': {
			resu = num1 - num2;
			break;
		}
		case '*': {
			resu = num1 * num2;
			break;
		}
		case '/': {
			try {
				resu = num1 / num2;
			} catch (ArithmeticException e) {
				System.out.println("No puedes dividir entre 0");
				error = true;
			}
			break;
		}
		default:
			System.out.println("Has introducido un s�mbolo err�neo.");
			break;
		}

		if (error == true) {
			System.out.println("Resultado = " + resu);
		}
	}
}

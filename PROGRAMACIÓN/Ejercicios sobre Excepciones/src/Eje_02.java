import java.util.InputMismatchException;
import java.util.Scanner;

public class Eje_02 {

	static final int LIMITE = 99999;

	public static void main(String[] args) {

		int num1 = 0;
		int num2 = 0;
		int resu = 0;
		char operador;
		boolean error;

		Scanner sc = new Scanner(System.in);

		do {
			error = false;
			System.out.print("Introduce un número: ");
			try {
				num1 = sc.nextInt();
				if (Math.abs(num1) > LIMITE) {
					throw new DesbordamientoException(num1);
				}
			} catch (InputMismatchException e) {
				System.out.println("Eso no es un número");
				sc.next();
				error = true;
			} catch (DesbordamientoException ex) {
				error = true;
				System.out.println(ex.getMessage());
			}

		} while (error);

		do {
			error = false;
			System.out.print("Introduce otro número: ");
			try {
				num2 = sc.nextInt();
				if (Math.abs(num2) > LIMITE) {
					throw new DesbordamientoException(num2);
				}
			} catch (InputMismatchException e) {
				System.out.println("Eso no es un número");
				sc.next();
				error = true;
			} catch (DesbordamientoException ex) {
				error = true;
				System.out.println(ex.getMessage());
			}
		} while (error);

		// Selección del símbolo
		System.out.println("Sumar (+)");
		System.out.println("Restar (-)");
		System.out.println("Multiplicar (*)");
		System.out.println("Dividir (/)");
		operador = sc.next().charAt(0);

		// Operaciones
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
			System.out.println("Has introducido un símbolo erróneo.");
			break;
		}

		// Chequeo si el resultado supera el límite
		try {
			if (Math.abs(resu) > LIMITE) {
				throw new DesbordamientoException(resu);
			}

		} catch (DesbordamientoException ex) {
			error = true;
			System.out.println(ex.getMessage());
		}

		// Muestra el resultado
		if (error != true) {

			System.out.println("Resultado = " + resu);
		}
	}
}

import java.util.Scanner;

public class pseudocodigo05 {

	public static void main(String[] args) {

		String simbolo;
		float resultado, num1, num2;

		Scanner sc = new Scanner(System.in);

		System.out.print("Escribe un n�mero: ");
		num1 = sc.nextInt();
		System.out.print("Escribe otro n�mero: ");
		num2 = sc.nextInt();
		System.out.print("Elige entre +, -, * o /: ");
		simbolo = sc.next();

		switch (simbolo) {
		case "+":
			resultado = (num1 + num2);
			System.out.println(resultado);
			break;

		case "-":
			resultado = (num1 - num2);
			System.out.println(resultado);
			break;

		case "*":
			resultado = (num1 * num2);
			System.out.println(resultado);
			break;

		case "/":
			resultado = (num1 / num2);
			System.out.println(resultado);
			break;

		default:
			System.out.println("Error.");
			break;
		}
	}

}

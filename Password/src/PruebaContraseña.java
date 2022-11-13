import java.util.Scanner;

public class PruebaContrase�a {

	public static void main(String[] args) {

		int cantidadContrase�as;
		char opcion;
		String contrase�a = "";

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce el n�mero de contrase�as que quieras crear: ");
		cantidadContrase�as = sc.nextInt();

		Password contrase�as[] = new Password[cantidadContrase�as];

		for (int i = 0; i < contrase�as.length; i++) {
			System.out.println("�Quieres crear una contrase�a autom�ticamente? (S/N)");
			opcion = sc.next().charAt(0);

			if (opcion == 'S') {
				contrase�as[i] = new Password();
			}

			if (opcion == 'N') {
				contrase�a = sc.next();
				contrase�as[i] = new Password(contrase�a);
			}
		}

		boolean fuerte[] = new boolean[cantidadContrase�as];

		for (int i = 0; i < fuerte.length; i++) {
			fuerte[i] = contrase�as[i].esFuerte();
		}

		System.out.println("VALOR               FUERTE");
		for (int i = 0; i < contrase�as.length; i++) {
			System.out.println(contrase�as[i].getPassword() + "               " + contrase�as[i].esFuerte());
		}
	}

}

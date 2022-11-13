import java.util.Scanner;

public class PruebaContraseña {

	public static void main(String[] args) {

		int cantidadContraseñas;
		char opcion;
		String contraseña = "";

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce el número de contraseñas que quieras crear: ");
		cantidadContraseñas = sc.nextInt();

		Password contraseñas[] = new Password[cantidadContraseñas];

		for (int i = 0; i < contraseñas.length; i++) {
			System.out.println("¿Quieres crear una contraseña automáticamente? (S/N)");
			opcion = sc.next().charAt(0);

			if (opcion == 'S') {
				contraseñas[i] = new Password();
			}

			if (opcion == 'N') {
				contraseña = sc.next();
				contraseñas[i] = new Password(contraseña);
			}
		}

		boolean fuerte[] = new boolean[cantidadContraseñas];

		for (int i = 0; i < fuerte.length; i++) {
			fuerte[i] = contraseñas[i].esFuerte();
		}

		System.out.println("VALOR               FUERTE");
		for (int i = 0; i < contraseñas.length; i++) {
			System.out.println(contraseñas[i].getPassword() + "               " + contraseñas[i].esFuerte());
		}
	}

}

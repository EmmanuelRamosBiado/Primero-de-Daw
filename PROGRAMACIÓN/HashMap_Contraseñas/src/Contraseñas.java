import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Contraseñas {

	public static void main(String[] args) {

		HashMap<String, String> contraseñas = new HashMap<String, String>();

		Scanner sc = new Scanner(System.in);
		String usuario;
		String contraseña;
		int intentos = 3;

		// Usuarios y contraseñas válidas
		contraseñas.put("usuario1", "contraseña1");
		contraseñas.put("usuario2", "contraseña2");
		contraseñas.put("usuario3", "contraseña3");
		contraseñas.put("usuario4", "contraseña4");
		contraseñas.put("usuario5", "contraseña5");

		// Bucle para introducir el usuario y la contraseña
		while (intentos != 0) {
			System.out.print("Introduce el nombre del usuario: ");
			usuario = sc.next();
			System.out.print("Introduce la contraseña: ");
			contraseña = sc.next();

			revisar(usuario, contraseña, contraseñas);

			if (revisar(usuario, contraseña, contraseñas)) {
				System.out.println("Ha accedido a área restringida.");
				break;
			} else {
				System.out.println("Ha introducido un valor erróneo.");
				intentos--;
				System.out.println("Le quedan " + intentos + " intentos.");
			}
		}

		// Mensaje que se muestra si se han agotado todos los intentos
		if (intentos == 0) {
			System.out.println("Lo siento, no tiene acceso al área restringida.");
		}

	}

	// Método para revisar el usuario y la contraseña introducida con los del
	// HashMap
	private static boolean revisar(String usuario, String contraseña, HashMap<String, String> contraseñas) {
		boolean valor = false;

		for (Map.Entry usu : contraseñas.entrySet()) {
			if (usuario.equals(usu.getKey()) && contraseña.equals(usu.getValue())) {
				valor = true;
				break;
			}
		}

		return valor;
	}

}

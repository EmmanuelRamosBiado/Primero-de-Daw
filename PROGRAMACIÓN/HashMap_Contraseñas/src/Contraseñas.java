import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Contrase�as {

	public static void main(String[] args) {

		HashMap<String, String> contrase�as = new HashMap<String, String>();

		Scanner sc = new Scanner(System.in);
		String usuario;
		String contrase�a;
		int intentos = 3;

		// Usuarios y contrase�as v�lidas
		contrase�as.put("usuario1", "contrase�a1");
		contrase�as.put("usuario2", "contrase�a2");
		contrase�as.put("usuario3", "contrase�a3");
		contrase�as.put("usuario4", "contrase�a4");
		contrase�as.put("usuario5", "contrase�a5");

		// Bucle para introducir el usuario y la contrase�a
		while (intentos != 0) {
			System.out.print("Introduce el nombre del usuario: ");
			usuario = sc.next();
			System.out.print("Introduce la contrase�a: ");
			contrase�a = sc.next();

			revisar(usuario, contrase�a, contrase�as);

			if (revisar(usuario, contrase�a, contrase�as)) {
				System.out.println("Ha accedido a �rea restringida.");
				break;
			} else {
				System.out.println("Ha introducido un valor err�neo.");
				intentos--;
				System.out.println("Le quedan " + intentos + " intentos.");
			}
		}

		// Mensaje que se muestra si se han agotado todos los intentos
		if (intentos == 0) {
			System.out.println("Lo siento, no tiene acceso al �rea restringida.");
		}

	}

	// M�todo para revisar el usuario y la contrase�a introducida con los del
	// HashMap
	private static boolean revisar(String usuario, String contrase�a, HashMap<String, String> contrase�as) {
		boolean valor = false;

		for (Map.Entry usu : contrase�as.entrySet()) {
			if (usuario.equals(usu.getKey()) && contrase�a.equals(usu.getValue())) {
				valor = true;
				break;
			}
		}

		return valor;
	}

}

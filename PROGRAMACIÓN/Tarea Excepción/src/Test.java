import java.util.Scanner;
/**
 *	 
 * @author Emmanuel Ramos Biado
 *
 */
public class Test {
	static String tpalabros[] = { "caca", "culo", "pedo", "pis" };

	public static void main(String argv[]) {

		Scanner sc = new Scanner(System.in);
		/**
		 * String que el usuario ha introducido
		 */
		String valor = "";
		
		System.out.println("Introduce tus mensajes, o pulsa . Para terminar:");
		// Completar
		
		do {
			try {
				valor = leerLineaOK(sc);
			} catch (BurradasNOException e) {
				System.out.println("Se ha producido la excepción " + e.getMessage());
			}
		} while (!valor.equals("."));
		System.out.println("Fin del programa");

	}
	/**
	 * Compara el String que introduce el usuario con las palabras obscenas de la tabla
	 * @param sc - Es el escáner que recibe
	 * @return Devuelve el String que el usuario ha introducido
	 * @throws BurradasNOException
	 */
	public static String leerLineaOK(Scanner sc) throws BurradasNOException {
		// completar
		String valor = sc.nextLine();
		for (int i = 0; i < tpalabros.length; i++) {
			if (valor.contains(tpalabros[i])) {
				throw new BurradasNOException(tpalabros[i]);
			}
		}
		if (!valor.equals(".")) {
			System.out.println("OK");
		}
		return valor;
	}
}
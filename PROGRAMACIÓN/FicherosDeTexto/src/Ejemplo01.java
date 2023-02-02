import java.io.File;
import java.util.Date;
import java.util.Scanner;

public class Ejemplo01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Indique le nombre de un fichero o directorio:");
		String nombre = sc.nextLine();

		File fichero = new File(nombre);
		if (fichero.exists()) {
			System.out.println("Nombre: " + fichero.getName());
			System.out.println("- Ruta completa: " + fichero.getAbsolutePath());
			System.out.println("- Tamaño: " + fichero.length() + " bytes");
			System.out.println("- Última modificación: " + new Date(fichero.lastModified()));
			if (fichero.isFile()) {
				System.out.println("- Fichero normal");
			} else if (fichero.isDirectory()) {
				System.out.println("- Directorio");
				String ficheros[] = fichero.list();
				for (int i = 0; i < ficheros.length; i++) {
					System.out.print(nombre+ "\\" + ficheros[i]);
					File aux = new File(ficheros[i]);
					System.out.println("  --> Tamaño = " + aux.length());
				}
			}

		} else {
			System.out.println("El fichero '" + nombre + "' no existe");
		}

	}

}

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class CopiarTex {

	public static void main(String[] args) throws FileNotFoundException {

		if (args.length != 2) {
			System.out.println("Error. Ha introducido un número erróneo de parámetros.");
			System.exit(1);
		}

		String fichero1 = args[0];
		String fichero2 = args[1];

		File f1 = new File(fichero1);
		File f2 = new File(fichero2);

		Scanner sc = new Scanner(f1);
		PrintWriter pw = new PrintWriter(f2);

		if (!f1.canRead()) {
			System.out.println("Error: no se puede leer el fichero:" + args[1]);
		}

		String linea;
		while (sc.hasNext()) {
			linea = sc.nextLine();
			pw.println(linea);
		}

		System.out.println("Archivo copiado.");

		sc.close();
		pw.close();

	}

}

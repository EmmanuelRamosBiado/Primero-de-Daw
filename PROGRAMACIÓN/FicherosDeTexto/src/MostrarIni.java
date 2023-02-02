import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MostrarIni {

	public static void main(String[] args) throws FileNotFoundException {

		if (args.length != 2) {
			System.out.println("Error. Uso <número> <fichero>");
			System.exit(1);
		}

		int nlineas = 0;
		try {
			nlineas = Integer.parseInt(args[0]);
		} catch (NumberFormatException ex) {
			System.out.println("Debe introducir un número de líneas");
			System.exit(2);
		}
		String fichero = args[1];

		File ff = new File(fichero);

		if (!ff.canRead()) {
			System.out.println("Error: no se puede leer el fichero:" + args[1]);
		}

		Scanner sc = new Scanner(ff);

		int clineas = 0;
		String linea;

		while (sc.hasNextLine() && clineas < nlineas) {
			linea = sc.nextLine();
			System.out.println(linea);
			clineas++;
		}

		sc.close();

	}

}

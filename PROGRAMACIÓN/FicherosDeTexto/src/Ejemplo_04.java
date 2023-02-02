import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ejemplo_04 {

	public static void main(String[] args) throws FileNotFoundException {

		File fl = new File("cosa.txt");
		File fw = new File("cosaordenada.txt");
		ArrayList<String> lista = new ArrayList<String>();

		Scanner sc = new Scanner(fl);
		PrintWriter pw = new PrintWriter(fw);

		String linea;
		while (sc.hasNextLine()) {
			linea = sc.nextLine();
			lista.add(linea);
		}

		Collections.sort(lista);

		for (String l : lista) {
			pw.println(l);
		}
		System.out.println("Fichero Ordenado.");

		sc.close();
		pw.close();

	}

}

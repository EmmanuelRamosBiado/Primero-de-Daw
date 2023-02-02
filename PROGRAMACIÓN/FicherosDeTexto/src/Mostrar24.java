import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Mostrar24 {

	public static void main(String[] args) throws FileNotFoundException {

		File fl = new File("cosa2.txt");
		Scanner sc = new Scanner(fl);
		Scanner sc2 = new Scanner(System.in);

		int contador = 1;
		String linea;
		String opcion;

		do {
			while (sc.hasNext() && contador <= 24) {
				linea = sc.nextLine();
				System.out.print(contador + ": ");
				System.out.println(linea);
				contador++;
			}
			if (contador == 25) {
				System.out.print("Pulse intro si desea continuar: ");
				opcion = sc2.nextLine();
				contador = 1;
			}
		} while (sc.hasNext());

		sc.close();

	}

}

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;

public class ProcesarOrdenadores {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		ArrayList<Ordenador> listaPC = new ArrayList<Ordenador>();
		// Leer
		FileInputStream fin = new FileInputStream("ordenadores.objetos");
		ObjectInputStream foin = new ObjectInputStream(fin);

		try {
			Ordenador aux = (Ordenador) foin.readObject();
			while (true) {
				listaPC.add(aux);
				aux = (Ordenador) foin.readObject();
			}

		} catch (EOFException ex) {
		}

		// Procesar el ArrayList
		Collections.sort(listaPC);

		System.out.println("ORDENADORES CON MÁS DE 1000GB");

		for (Ordenador ord : listaPC) {
			if (ord.disco >= 1000) {
				System.out.println(ord);
			}
		}

		listaPC.removeIf(x -> x.marca.equals("APPLE"));

		// Escribir ArrayList a Fichero

		volcarArraylist(listaPC);

		System.out.println("Datos procesados.");
	}

	private static void volcarArraylist(ArrayList<Ordenador> lista) throws IOException {
		FileOutputStream fw = new FileOutputStream("ordenadores.objetos");
		ObjectOutputStream fow = new ObjectOutputStream(fw);

		for (Ordenador ord : lista) {
			fow.writeObject(ord);
		}

		fow.close();
		fw.close();

	}
}

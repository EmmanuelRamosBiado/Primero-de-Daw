import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;

public class EscribirOrdenadores {

	private static String fichero = "ordenadores.objetos";

	public static void main(String[] args) {

		{
			try {
				// Creo Flujo de tipo fichero de byte
				FileOutputStream fos = new FileOutputStream(fichero);
				// Creo un Flujo de objetos sobre el fichero
				ObjectOutputStream oos = new ObjectOutputStream(fos);

				oos.writeObject(new Ordenador(202323, "HP", 2012, 8, 1000));
				oos.writeObject(new Ordenador(202323, "HP", 2014, 8, 2000));
				oos.writeObject(new Ordenador(102039, "LENOVO", 2010, 4, 500));
				oos.writeObject(new Ordenador(293000, "APPLE", 2012, 8, 1500));

				oos.close(); // Cierro el fujo de objectos
				fos.close(); // Cierro el flujo de
			} catch (IOException ioe) {
				ioe.printStackTrace();
			}

		}

	}
}
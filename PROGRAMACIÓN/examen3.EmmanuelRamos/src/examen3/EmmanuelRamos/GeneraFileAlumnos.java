package examen3.EmmanuelRamos;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;

public class GeneraFileAlumnos {
	public static void main(String argv[]) throws IOException {

		FileOutputStream fw = new FileOutputStream("alumnos.ser");
// Creo un Flujo de objetos sobre el fichero
		ObjectOutputStream fow = new ObjectOutputStream(fw);

		Alumno p = new Alumno("Pepito Pérez", 5, 6, 7);
		fow.writeObject(p);
		fow.writeObject(new Alumno("Elena Gómez", 7, 7, 10));
		fow.writeObject(new Alumno("Juana Muñoz", 4, 5, 6));
		fow.writeObject(new Alumno("Juan Sin Miedo", 3, 2, 10));
		fow.writeObject(new Alumno("Silvia TotalPro", 10, 10, 10));

		fow.close(); // Cierro el fujo de objectos
		fw.close(); // Cierro el flujo de bytes

		System.out.println("Fichero Generado.");

	}
}
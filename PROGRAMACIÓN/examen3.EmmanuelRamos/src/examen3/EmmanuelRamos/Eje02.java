package examen3.EmmanuelRamos;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Eje02 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		ArrayList<Alumno> lista = new ArrayList<Alumno>();

		String linea;

		FileInputStream fin = new FileInputStream("alumnos.ser");
		ObjectInputStream foin = new ObjectInputStream(fin);

		try {
			Alumno aux = (Alumno) foin.readObject();
			while (true) {
				lista.add(aux);
				aux = (Alumno) foin.readObject();
			}

		} catch (EOFException ex) {
		}
		
		

	}

}

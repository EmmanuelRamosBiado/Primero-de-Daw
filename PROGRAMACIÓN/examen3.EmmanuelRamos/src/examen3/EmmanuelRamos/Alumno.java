package examen3.EmmanuelRamos;

import java.io.Serializable;

public class Alumno implements Serializable {
	private static final long serialVersionUID = 1L;
	String nombre;
	int ev1;
	int ev2;
	int ev3;

	Alumno(String nombre, int n1, int n2, int n3) {
		this.nombre = nombre;
		this.ev1 = n1;
		this.ev2 = n2;
		this.ev3 = n3;
	}

	float media() {
		return ((float) (ev1 + ev2 + ev3) / 3);
	}

	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", ev1=" + ev1 + ", ev2=" + ev2 + ", ev3=" + ev3 + "]";
	}

}
public class Reloj {

	private int segundos;
	private boolean formato24;

	Reloj(int hora, int minutos, int segundos) {
		this.segundos = hora * 3600 + minutos * 60 + segundos;
		this.formato24 = true;
	}

	// Mostrar la hora: genera un String con el formado de hora 22:30:23
	// o 10:30:23 pm si el atributos Formato24 es falso

	public String mostrar() {

		return "";
	}

	// Cambiar formato24, recibe un valor true si quiero formato de
	// 24 o falso si quiero de 12
	public void cambiarFormato24(boolean formato24) {

	}

	// Incrementa en un segundo el valor de reloj
	public void tictac() {

	}

	// Comparar Hora, recibe como parámetro otro objeto Reloj
	// y me devuelve el número de segundos que tienen de diferencia

	public int comparar(Reloj otroreloj) {

		return 0;
	}

}

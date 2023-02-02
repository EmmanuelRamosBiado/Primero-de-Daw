import java.util.Arrays;

public class Almacen2 {

	static private final int LIBRE = 0;
	// Array con los valores almacenados
	private int tvalores[];
	private int valoresAlmacenados = 0;

	// Constructores sin parámetros creo una tabla de 10 elementos
	public Almacen2() {
		this(10); // Llamo al constructor con parámetros
	}

	// Constructor donde se fija tamaño máximo del Almacén
	public Almacen2(int tamaño) {
		tvalores = new int[tamaño];
		init();
	}

	// Pone todas las posiciones a LIBRES
	public void init() {
		valoresAlmacenados = 0;
	}

	// Muestra una cadena con los valores de la tabla
	public String toString() {
		String resu = "{";
		for (int i = 0; i < valoresAlmacenados; i++) {
			resu += tvalores[i];
			if (i < valoresAlmacenados - 1) {
				resu += ",";
			}
		}
		resu += "}";
		return resu;
	}

	// Devuelve el números de posiciones libres
	public int numPosicionesLibres() {

		return (tvalores.length - valoresAlmacenados);
	}

	// Devuelve el número de posiones ocupadas
	public int numPosicionesOcupadas() {

		return valoresAlmacenados;
	}

	// Devuelve verdadero o falso si está almacenado el valor en la tabla
	public boolean estaValor(int num) {
		for (int i = 0; i < valoresAlmacenados; i++) {
			if (tvalores[i] == num) {
				return true;
			}
		}
		return false;
	}

	// Almacena el valor el la tabla, devuelve false sin no puede almacenarlo
	public boolean ponValor(int num) {
		if (!estaLleno()) {
			tvalores[valoresAlmacenados] = num;
			valoresAlmacenados++;
			return true;
		} else {
			return false;
		}

	}

	// Elimina el elemento de la tabla, si no esta devuelve false
	public boolean sacarValor(int num) {
		boolean esta = false;

		if (estaValor(num)) {
			for (int i = 0; i < valoresAlmacenados; i++) {
				if (tvalores[i] == num) {
					for (int j = i; j < valoresAlmacenados - 1; j++) {
						tvalores[j] = tvalores[j + 1];
					}
					valoresAlmacenados--;
					esta = true;
					break;
				}
			}
		}
		return esta;

	}

	// Indica si el almacén esta lleno
	public boolean estaLleno() {

		return (tvalores.length == valoresAlmacenados);
	}
}

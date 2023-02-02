
public class PilaEnteros {

	int contadorNumeros = 0;
	int valores[];

	public PilaEnteros(int tamaño) {
		contadorNumeros = 0;
		valores = new int[tamaño];
	}

	public boolean push(int valor) {
		boolean val = true;

		if (!estaLleno()) {
			valores[contadorNumeros] = valor;
			contadorNumeros++;
		} else {
			val = false;
		}
		return val;
	}

	public int pop() {
		int aux;

		if (!estaVacio()) {
			aux = valores[contadorNumeros];
			valores[contadorNumeros] = 0;
			contadorNumeros--;
			return aux;
		} else {
			return -1;
		}
	}

	public int peek() {
		int valor;

		if (!estaVacio()) {
			valor = valores[contadorNumeros - 1];
		} else {
			valor = -1;
		}
		return valor;
	}

	public boolean estaLleno() {
		boolean valor = false;
		if (contadorNumeros == (valores.length - 1)) {
			valor = true;
		}
		return valor;
	}

	public boolean estaVacio() {
		boolean valor = false;
		if (contadorNumeros == 0) {
			valor = true;
		}
		return valor;
	}

}

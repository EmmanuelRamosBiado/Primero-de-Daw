
public class ListaLetra {

	NodoLetras inicio;

	ListaLetra(String cadena) {
		inicio = null;
		for (int i = cadena.length() - 1; i >= 0; i--) {
			ponAlprincipio(cadena.charAt(i));
		}
	}

	public void ponAlprincipio(char valor) {
		NodoLetras nuevo = new NodoLetras();
		nuevo.valor = valor;
		nuevo.siguiente = inicio;
		inicio = nuevo;
	}

	public String toString() {
		String resultado = "";
		NodoLetras paux = inicio;
		while (paux != null) {
			resultado += "->" + paux.valor;
			paux = paux.siguiente;
		}
		return resultado;
	}
}

public class ListaNodos2 {
	// instance variables - replace the example below with your own
	private Nodo ultimo;
	private Nodo primero;

	/**
	 * Constructor for objects of class ListaNodos2
	 */
	public ListaNodos2() {
		primero = null;
		ultimo = null;
	}

	public void ponAlPrincipio(int valor) {
		Nodo nuevo = new Nodo();
		nuevo.valor = valor;
		nuevo.siguiente = primero;
		primero = nuevo;
		// Si no hay ultimo
		if (ultimo == null) {
			ultimo = primero;
		}
	}

	public boolean estaVacia() {
		return (primero == null);

	}

	public void quitarAlPrincipio() {
		if (!estaVacia()) {
			// Si solo hay ultimo
			if (primero == ultimo) {
				primero = null;
				ultimo = null;
			} else {
				primero = primero.siguiente;
			}
		}
	}

	public void imprimir() {
		int numNodos = 0;
		Nodo aux = primero;
		System.out.println("------------------------");
		while (aux != null) {
			numNodos++;
			System.out.println(numNodos + " : " + aux.valor);
			aux = aux.siguiente;
		}
		System.out.println("------------------------");
	}

	public void ponAlFinal(int valor) {
		// Esta vacia primero y ultimo son iguales
		if (estaVacia()) {
			ponAlPrincipio(valor);
		} else {
			Nodo nuevo = new Nodo();
			nuevo.valor = valor;
			ultimo.siguiente = nuevo;
			ultimo = nuevo;
		}
	}

	public void quitarAlFinal() {
		if (!estaVacia()) {
			// Si solo hay uno;
			if (primero == ultimo) {
				primero = null;
				ultimo = null;
			} else {
				// Busco el anterior al ultimo
				Nodo aux = primero;
				while (aux.siguiente != ultimo) {
					aux = aux.siguiente;
				}
				// Ultimo pasa a ser el anterior y elimino la referencia
				ultimo = aux;
				ultimo.siguiente = null;
			}
		}
	}

	public int getPrimero() {
		if (estaVacia()) {
			return -1;
		} else {
			return primero.valor;
		}
	}

	public int getUltimo() {
		if (estaVacia()) {
			return -1;
		} else {
			return ultimo.valor;
		}
	}

	/*
	 * Quita un elemento concreto de la lista
	 * 
	 * @param valor a eliminar
	 * 
	 * @return true si lo elimina o false si no se encuentra
	 */
	public boolean quitar(int valor) {
		if (estaVacia())
			return false;
		if (primero.valor == valor) {
			quitarAlPrincipio();
			return true;
		}
		if (ultimo.valor == valor) {
			quitarAlFinal();
			return true;
		}
		// Puede estar por el medio
		Nodo p2 = primero;
		Nodo p1 = primero.siguiente;
		while (p1 != null) {
			// Si lo encuentro lo salto y devuelvo true
			if (p1.valor == valor) {
				p2.siguiente = p1.siguiente;
				return true;
			}
			p2 = p1;
			p1 = p1.siguiente;
		}
		return false;
	}

	/*
	 * Inserta un elemento de la lista en orden Se supone que la lista está ordenada
	 */

	public void ponEnOrden(int valor) {
		if (estaVacia())
			ponAlPrincipio(valor);
		else if (valor < primero.valor)
			ponAlPrincipio(valor);
		else if (valor > ultimo.valor)
			ponAlFinal(valor);
		else {
			// Pongo por el medio
			Nodo p2 = primero;
			Nodo p1 = primero.siguiente;
			while (p1 != null) {
				// Va antes lo inserto
				if (valor < p1.valor) {
					Nodo aux = new Nodo();
					aux.valor = valor;
					aux.siguiente = p1;
					p2.siguiente = aux;
					break;
				}
				p2 = p1;
				p1 = p1.siguiente;
			}

		} // else
	}
}

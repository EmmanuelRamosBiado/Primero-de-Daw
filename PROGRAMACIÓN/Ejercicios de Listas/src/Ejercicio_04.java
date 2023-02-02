public class Ejercicio_04 {
	public static void main(String argv[]) {

		ListaNodos2 milista = new ListaNodos2();
		ListaNodos2 lpar = new ListaNodos2();
		ListaNodos2 limpar = new ListaNodos2();

		// Pruebo los datos del ejercicio
		// milista → 3 → 8 → 12 → 7 → 2 → 5 → null
		milista.ponAlPrincipio(5);
		milista.ponAlPrincipio(2);
		milista.ponAlPrincipio(7);
		milista.ponAlPrincipio(12);
		milista.ponAlPrincipio(8);
		milista.ponAlPrincipio(3);

		System.out.println("Lista original (antes):");
		milista.imprimir();
		repartirLista(milista, lpar, limpar);
		System.out.println("Lista original (despues):");
		milista.imprimir();
		System.out.println("Lista Pares:");
		lpar.imprimir();
		System.out.println("Lista Impares:");
		limpar.imprimir();

	}
	/*
	 * Este método maneja listas de enteros y quitará elementos de la lista milista
	 * añadiéndolos a la lista de pares o impares según el valor de cada elemento.
	 * Al final milista debe quedar sin ningún elemento.
	 */

	public static void repartirLista(ListaNodos2 milista, ListaNodos2 listapares, ListaNodos2 listaimpares) {

		while (!milista.estaVacia()) {
			int valor = milista.getPrimero();
			if (valor % 2 == 0) {
				listapares.ponAlFinal(valor);
			} else {
				listaimpares.ponAlFinal(valor);
			}

			milista.quitarAlPrincipio();
		}

	}
}


// Clase de prueba COMPLETAR EL CÓDIGO DEL MÉTODO procesar Opción 
import java.util.Scanner;

public class TestAlmacen1 {

	static Scanner sc = null;

	static public void main(String[] argv) {

		Almacen1 prueba = new Almacen1();
		sc = new Scanner(System.in);
		int opcion;

		mostrarMenu();
		opcion = sc.nextInt();
		while (opcion != 0) {
			procesarOpcion(opcion, prueba);
			mostrarMenu();
			opcion = sc.nextInt();
		}
		sc.close();

	}

	static void mostrarMenu() {
		System.out.println("----- MENÚ DE  CONTROL DEL ALMACÉN -----");
		System.out.println(" 1.- Mostrar contenido del Almacén");
		System.out.println(" 2.- Poner un Valor  ");
		System.out.println(" 3.- Buscar un Valor ");
		System.out.println(" 4.- Borrar un Valor");
		System.out.println(" 5.- Contar posiciones ocupadas.");
		System.out.println(" 6.- Contar posiciones libres.");
		System.out.println(" 0.- Terminar");
		System.out.print(" Introduzca una opción:[1-6]: ");
	}

	// Procesa la opción introducida operando sobre el objeto Almacen1
	static void procesarOpcion(int opcion, Almacen1 parAlmacen) {
		// Completar......

		switch (opcion) {
		case 1:
			System.out.println();
			System.out.println("Aspecto de la tabla: " + parAlmacen.toString());
			System.out.println();
			break;

		case 2:
			System.out.println();
			System.out.print("Introduce un valor: ");
			int valor = sc.nextInt();
			if (!parAlmacen.ponValor(valor)) {
				System.err.println("El valor no se ha podido almacenar.");
			}
			System.out.println();
			break;

		case 3:
			System.out.println();
			System.out.print("Introduce un valor: ");
			valor = sc.nextInt();
			if (parAlmacen.estaValor(valor)) {
				System.out.println("El valor se encuentra en la tabla.");
			} else {
				System.out.println("El valor no se encuentra en la tabla");
			}
			System.out.println();
			break;

		case 4:
			System.out.println();
			System.out.print("Introduce un valor: ");
			valor = sc.nextInt();
			if (!parAlmacen.sacarValor(valor)) {
				System.out.println("El valor no se encuentra en la tabla.");
			} else {
				System.out.println("El valor se acaba de borrar ahora mismo.");
			}
			System.out.println();
			break;

		case 5:
			System.out.println();
			System.out.println("Nº de posiciones ocupadas: " + parAlmacen.numPosicionesOcupadas());
			System.out.println();
			break;

		case 6:
			System.out.println();
			System.out.println(" Posiciones libres : " + parAlmacen.numPosicionesLibres());
			System.out.println();
			break;
		}

	}

}

package examen3.EmmanuelRamos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GestionBancaria {
	public static void main(String argv[]) {

		Scanner sc = new Scanner(System.in);

		HashMap<Long, Cuenta> mcuentas = new HashMap<Long, Cuenta>();
		mcuentas.put(100293929L, new Cuenta(100293929L, "Ana Soria", 2123.34f));
		mcuentas.put(200293929L, new Cuenta(200293929L, "Pedro Roca", 5030.83f));
		mcuentas.put(300293929L, new Cuenta(300293929L, "Adan", 0.0f));
		mcuentas.put(400293929L, new Cuenta(400293929L, "Eva", 0.0f));
		mcuentas.put(500293929L, new Cuenta(500293929L, "Millonetis", 8552123.34f));

		System.out.println("Introduce un valor mínimo de saldo:");
		float valor = 0;
		// COMPLETAR: Leer valor
		valor = Float.parseFloat(introduceValor(sc));

		System.out.println(">Cuentas con saldo superior a " + valor);
		// COMPLETAR
		mostrarCuentas(valor, mcuentas);

		System.out.println(">Eliminado cuentas con saldo igual a 0 ");
		// COMPLETAR
		borrarCuentas(mcuentas);

		System.out.println(">Cuentas ordenadas por saldo");
		// COMPLETAR
		ordenarCuentas(mcuentas);
	}

	public static String introduceValor(Scanner sc) {
		String valor = "";
		boolean estado = true;

		do {
			valor = sc.nextLine();
			try {
				Float.parseFloat(valor);
				estado = true;

			} catch (NumberFormatException e) {
				System.out.print("Ha introducido un valor erróneo. Vuelve a intentarlo: ");
				estado = false;
			}
		} while (estado == false);

		return valor;

	}

	public static void mostrarCuentas(float valor, HashMap<Long, Cuenta> mcuentas) {
		for (Cuenta p : mcuentas.values()) {
			if (p.getSaldo() > valor) {
				System.out.println(p);
			}
		}
	}

	public static void borrarCuentas(HashMap<Long, Cuenta> mcuentas) {
		mcuentas.values().removeIf(value -> value.saldo == 0);
	}

	public static void ordenarCuentas(HashMap<Long, Cuenta> map) {
		ArrayList<Cuenta> listaCuentas = new ArrayList<Cuenta>(map.values());
		Collections.sort(listaCuentas);
	}

}
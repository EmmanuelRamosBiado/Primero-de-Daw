import java.util.Arrays;

public class Hospital {
	private Paciente tpacientes[]; // Al inicio todas las posiciones son igual a null
	private int contadorpacientes;

	public Hospital(int numpacientes) {
		tpacientes = new Paciente[numpacientes];
		contadorpacientes = 0;
	}

	// Ingreso de un paciente al hospital, devuelve false si no cabe
	public boolean ingreso(Paciente p) {
		boolean resu = false;
		if (tpacientes.length > contadorpacientes) {
			tpacientes[contadorpacientes] = p;
			contadorpacientes++;
			resu = true;
		}
		return resu;
	}

	// Alta del paciente - se borra de la tabla, su posición se pone a null
	// Devuelve false si no se encuentra
	public boolean alta(int id_paciente) {
		boolean valor = false;

		for (int i = 0; i < contadorpacientes; i++) {
			if (tpacientes[i].getId() == id_paciente) {
				tpacientes[i] = null;
				contadorpacientes--;
				valor = true;
			}
		}

		return valor;
	}

	// Devuelve el paciente con el identidador indicado o null si no existe
	public Paciente buscar(int id) {
		Paciente p = null;
		for (int i = 0; i < contadorpacientes; i++) {
			if (id == tpacientes[i].getId()) {
				p = tpacientes[i];
				break;
			}
		}
		return p;
	}

	// Imprime por consola la lista ORDENADO por NOMBRE de pacientes ***

	public void listapacientes() {

		Arrays.sort(tpacientes, 0, contadorpacientes, new OrdenarPorNombre());
		for (int i = 0; i < contadorpacientes; i++) {
			System.out.println(tpacientes[i]);
		}
	}

	// Devuelve el mas grave o el caso de paciente con la misma gravedad el
	// que su identificador sea mas bajo.
	public Paciente pacienteMasUrgente() {
		
		return null;

	}

}
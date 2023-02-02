import java.util.Random;

public class Cine {

	int nfilas;
	int ncolumnas;
	Espectador tasientos[][];
	Pelicula peli;
	float precio;
	int numEspectadores;

	public Cine(int nfilas, int ncolumnas, Pelicula peli, float precio) {
		this.peli = peli;
		this.precio = precio;
		tasientos = new Espectador[nfilas][ncolumnas];
		numEspectadores = 0;
	}

	public String venderAsiento(Espectador esp) {

		String msg = "";
		Random rd = new Random();

		// No tiene dinero suficiente
		if (esp.getDinero() < precio) {
			msg = "Lo sentimos " + esp.getNombre() + ", no tienes dinero.";
			return msg;
		}

		// No tiene la edad suficiente
		// peli.getEdadminima();

		// Posiciones libres
		if (numEspectadores < nfilas * ncolumnas) {
			boolean asignado = false;
			do {
				int posfila = rd.nextInt(nfilas);
				int posbutaca = rd.nextInt(ncolumnas);
				if (tasientos[posfila][posbutaca] == null) {
					asignado = true;
					tasientos[posfila][posbutaca] = esp;
					numEspectadores++;
					esp.setDinero(esp.getDinero() - precio);
					msg = "Fila " + (posfila + 1) + " Asiento " + ('A' + posbutaca);
				}

			} while (asignado == false);
		} else {
			msg = "No hay asientos libres.";
		}

		return msg;

	}

}

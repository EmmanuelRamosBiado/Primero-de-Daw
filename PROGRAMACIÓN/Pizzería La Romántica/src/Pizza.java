
public class Pizza {

	private TamañoPizza tamaño;
	private TipoPizza tipo;
	private EstadoPizza estado;

	private static int totalpizzaspedidas = 0;
	private static int totalpizzasservidas = 0;

	Pizza(TipoPizza tipo, TamañoPizza tamaño) {
		this.tipo = tipo;
		this.tamaño = tamaño;
		this.estado = EstadoPizza.PEDIDA;
		totalpizzaspedidas++;
	}

	public void sirve() {
		if (this.estado == EstadoPizza.PEDIDA) {
			this.estado = EstadoPizza.ENTREGADA;
			totalpizzasservidas++;
		}
	}

	public static int getTotalPedidas() {
		return totalpizzaspedidas;
	}

	public static int getTotalServidas() {
		return totalpizzasservidas;
	}

	public String toString() {
		return "Tipo:" + tipo + " Tamaño:" + tamaño + " Estado:" + estado;
	}
}

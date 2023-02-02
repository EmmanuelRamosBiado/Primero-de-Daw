
public class Pizza {

	private Tama�oPizza tama�o;
	private TipoPizza tipo;
	private EstadoPizza estado;

	private static int totalpizzaspedidas = 0;
	private static int totalpizzasservidas = 0;

	Pizza(TipoPizza tipo, Tama�oPizza tama�o) {
		this.tipo = tipo;
		this.tama�o = tama�o;
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
		return "Tipo:" + tipo + " Tama�o:" + tama�o + " Estado:" + estado;
	}
}

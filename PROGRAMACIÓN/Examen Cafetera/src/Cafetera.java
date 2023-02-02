
public class Cafetera {

	private int capacidadMaxima;
	private int cantidadActual;

	public Cafetera() {
		this.capacidadMaxima = 1000;
		this.cantidadActual = 0;
	}

	public Cafetera(int capacidadMaxima) {
		this.capacidadMaxima = capacidadMaxima;
		this.cantidadActual = 0;
	}

	public Cafetera(int capacidadMaxima, int cantidadActual) {
		this.capacidadMaxima = capacidadMaxima;
		if (cantidadActual > capacidadMaxima) {
			this.cantidadActual = capacidadMaxima;
		} else {
			this.cantidadActual = cantidadActual;
		}
	}

	public void llenarCafetera() {
		this.cantidadActual = capacidadMaxima;
	}

	public void servirTaza(int cantidad) {
		if ((cantidadActual - cantidad) < 0) {
			cantidadActual = 0;
		} else {
			cantidadActual -= cantidad;
		}
	}

	public void vaciarCafetera() {
		this.cantidadActual = 0;
	}

	public void agregarCafe(int cantidad) {
		if ((cantidadActual + cantidad) > capacidadMaxima) {
			cantidadActual = capacidadMaxima;
		} else {
			cantidadActual += cantidad;
		}
	}

	public String mostrarInfo() {
		return "Cantidad Actual: " + cantidadActual + " -- Capacidad Máxima: " + capacidadMaxima;
	}
}

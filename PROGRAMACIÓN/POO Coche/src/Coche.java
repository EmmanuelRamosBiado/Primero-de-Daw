public class Coche {
	// Definir los atributos

	private String modelo;
	private int distanciaTotal;
	private int distanciaParcial;
	private boolean motor;
	private int velocidad;
	private int velocidadMax;

	// Definir los métodos

	Coche(String modelo, int velocidadMax) {
		this.modelo = modelo;
		this.velocidadMax = velocidadMax;
		this.motor = false;
	}

	public boolean arrancar() {
		if (!motor) {
			motor = true;
		} else {
			infoError("El motor ya está encendido.");
		}
		return motor;
	}

	public boolean parar() {
		if (motor) {
			motor = false;
			distanciaParcial = 0;
		} else {
			infoError("El motor ya está apagado.");
		}
		return motor;
	}

	public boolean acelera(int cantidad) {
		boolean valor = false;
		if ((cantidad + velocidad <= velocidadMax) && (motor == true)) {
			velocidad += cantidad;
			valor = true;
		} else {
			if (cantidad + velocidad > velocidadMax) {
				infoError("No puedes superar la velocidad máxima.");
			}
			if (motor == false) {
				infoError("El motor está apagado.");
			}
		}
		return valor;
	}

	public boolean frena(int cantidad) {
		boolean valor = false;
		if ((motor == true) && (velocidad != 0)) {
			if (cantidad > velocidad) {
				velocidad = 0;
			} else {
				velocidad -= cantidad;
				valor = true;
			}
		} else {
			if (motor == false) {
				infoError("No puedes frenar si el motor está apagado.");
			}
			if (velocidad == 0) {
				infoError("No puedes frenar si la velocidad es 0.");
			}
		}
		return valor;
	}

	public boolean recorre() {
		boolean valor = false;
		if (motor == true) {
			distanciaTotal += velocidad;
			distanciaParcial += velocidad;
		} else {
			infoError("No puedes avanzar si el motor está apagado.");
		}
		return valor;
	}

	public String info() {
		String estado;
		if (motor == true) {
			estado = "Encendido";
		} else {
			estado = "Apagado";
		}
		return "Coche: " + modelo + ". Velocidad actual: " + velocidad + " Km/h. Motor: " + estado + ". Km parciales: "
				+ distanciaParcial + " Km. Km totales: " + distanciaTotal + " Km.";
	}

	public int getKilometros() {
		return distanciaParcial;
	}

	private void infoError(String mensaje) {
		System.err.println(mensaje);
	}
}
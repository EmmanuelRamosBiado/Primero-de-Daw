package repasopoo.primero;

public abstract class Bicicleta {

	private String color;
	protected int velocidad;
	private int precio;
	protected int marcha;
	private static int numerodeBicisCreadas = 0;

	static int calcularDistancia(int radio, int vueltas) {
		return (int) (2 * 3.1416 * radio * vueltas);
	}

	static int bicisFabricadas() {
		return numerodeBicisCreadas;
	}

	// Constructor que llama al constructor de abajo
	public Bicicleta() {
		this("Gris", 500);
	}

	// Constructor
	public Bicicleta(String color, int precio) {
		this.color = color;
		this.precio = precio;
		marcha = 0;
		velocidad = 0;
		numerodeBicisCreadas++;
	}

	public void fijarMarcha(int nuevaMarcha) {
		if (nuevaMarcha > 0) {
			this.marcha = nuevaMarcha;
		}
	}

	public void frenar() {
		velocidad = 0;
	}

	public void pedalear(int fuerza) {
		velocidad = fuerza * marcha;
	}

	public void verInfo() {
		System.out.println("Color: " + color + " Precio: " + precio + " Velocidad: " + velocidad);
	}
}

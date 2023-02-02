package repasopoo.primero;

public class BiciElectrica extends Bicicleta {
	private int bateria;
	private int ayuda;

	public BiciElectrica(String color, int precio, int bateria) {
		super(color, precio);
		this.bateria = bateria;
		this.ayuda = 0;
	}

	public void fijarayuda(int velocidadextra) {
		ayuda = velocidadextra;
	}

	@Override
	public void pedalear(int fuerza) {
		velocidad = fuerza * marcha + ayuda;
	}

	@Override
	public void verInfo() {
		super.verInfo();
		System.out.println("Batería: " + bateria);
	}
}

package repasopoo.primero;

public class BiciMonta�a extends Bicicleta {

	int amortiguacion;

	public BiciMonta�a(String color, int preciomercado, int amortiguacion) {
		super(color, preciomercado);
		this.amortiguacion = amortiguacion;
	}

	public void pedalear(int fuerza) {
		velocidad = fuerza * marcha;
	}
}

package repasopoo.primero;

public class BiciMontaña extends Bicicleta {

	int amortiguacion;

	public BiciMontaña(String color, int preciomercado, int amortiguacion) {
		super(color, preciomercado);
		this.amortiguacion = amortiguacion;
	}

	public void pedalear(int fuerza) {
		velocidad = fuerza * marcha;
	}
}

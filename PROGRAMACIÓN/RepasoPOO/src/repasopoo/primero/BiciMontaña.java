package repasopoo.primero;

public class BiciMontaņa extends Bicicleta {

	int amortiguacion;

	public BiciMontaņa(String color, int preciomercado, int amortiguacion) {
		super(color, preciomercado);
		this.amortiguacion = amortiguacion;
	}

	public void pedalear(int fuerza) {
		velocidad = fuerza * marcha;
	}
}

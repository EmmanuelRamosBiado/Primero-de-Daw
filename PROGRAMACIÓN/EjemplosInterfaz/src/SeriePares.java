
public class SeriePares implements Series {

	private int valorinicial;
	private int valoractual;

	// Constructor
	public SeriePares() {
		setComenzar(0);
	}

	public int getSiguiente() {
		this.valoractual += 2;
		return valoractual;
	}

	@Override
	public void reiniciar() {
		this.valoractual = this.valorinicial;

	}

	@Override
	public void setComenzar(int x) {
		this.valorinicial = x;
		this.valoractual = x;
	}

}

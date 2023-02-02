
public class SeriePotenciade5 implements Series {

	private int multiploInicial = 5;
	private int multiploActual = 5;
	private int contadorMultiplos;

	@Override
	public int getSiguiente() {
		this.multiploActual *= 5;
		contadorMultiplos = getContadorMultiplos() + 1;

		return multiploActual;
	}

	@Override
	public void reiniciar() {
		multiploActual = multiploInicial;
	}

	@Override
	public void setComenzar(int x) {
		this.multiploInicial = x;
		this.multiploActual = x;
	}

	public int getContadorMultiplos() {
		return contadorMultiplos;
	}

}

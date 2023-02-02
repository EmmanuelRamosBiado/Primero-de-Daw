
public class TestSeries {

	public static void main(String[] args) {
		SeriePares sp = new SeriePares();

		sp.setComenzar(4);
		for (int i = 1; i <= 10; i++) {
			System.out.print(sp.getSiguiente() + ", ");
		}

		System.out.println();
		sp.reiniciar();

		for (int i = 1; i <= 10; i++) {
			System.out.print(sp.getSiguiente() + ", ");
		}

		System.out.println();
		System.out.println("------------------");
		SeriePotenciade5 s5 = new SeriePotenciade5();
		s5.setComenzar(25);

		for (int i = 1; i <= 5; i++) {
			System.out.print(s5.getSiguiente() + ", ");
		}

		System.out.println("Números generados = " + s5.getContadorMultiplos());

		Series tseries[] = new Series[3];

		tseries[0] = sp;
		tseries[1] = new SeriePares();
		tseries[2] = new SeriePotenciade5();

		for (int i = 0; i < tseries.length; i++) {
			System.out.println(tseries[i].getSiguiente());
		}

	}

}

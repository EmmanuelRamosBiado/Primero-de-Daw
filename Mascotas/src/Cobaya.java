
public class Cobaya extends Mascota {

	public Cobaya(String nombre, Sexo vsexo) {
		super(nombre, vsexo);
	}

	public void decirAlgo() {
		System.out.println("XD");
	}

	public void gustosAlimentarios() {
		System.out.println("Pienso");
	}

	public Mascota cruzar(Mascota otra) {
		Mascota hijo = null;

		if ((this.getClass() == otra.getClass()) && (this.vsexo != otra.vsexo)) {
			Sexo sexohijo;
			if (Math.random() > 0.5) {
				sexohijo = Sexo.MACHO;
			} else {
				sexohijo = Sexo.HEMBRA;
			}

			hijo = new Cobaya("", sexohijo);
		}

		return hijo;
	}
}

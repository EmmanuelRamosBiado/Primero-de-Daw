
public class Gato extends Mascota {
	private String raza;

	public Gato(String nombre, Sexo vsexo, String raza) {
		super(nombre, vsexo);
		this.raza = raza;
	}

	public void decirAlgo() {
		System.out.println("Miau");
	}

	public void gustosAlimentarios() {
		System.out.println("Pescado");
	}

	public Mascota cruzar(Mascota otra) {
		Mascota hijo = null;

		if ((this.getClass() == otra.getClass()) && (this.vsexo != otra.vsexo)) {
			Sexo sexohijo = (Math.random() > 0.5) ? Sexo.MACHO : Sexo.HEMBRA;

			String razahijo;

			if (this.raza.equals(((Gato) otra).raza)) {
				razahijo = this.raza;
			} else {
				razahijo = "Mezcla";
			}
			hijo = new Gato("", sexohijo, razahijo);
		}
		return hijo;
	}

}

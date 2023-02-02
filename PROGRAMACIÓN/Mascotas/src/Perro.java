
public class Perro extends Mascota {
	private String raza;

	public Perro(String nombre, Sexo vsexo, String raza) {
		super(nombre, vsexo);
		this.raza = raza;
	}

	public void decirAlgo() {
		System.out.println("Guau");
	}

	public void gustosAlimentarios() {
		System.out.println("Carne");
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
			String razahijo;
			if (this.raza.equals(((Perro) otra).raza)) {
				razahijo = this.raza;
			} else {
				razahijo = "Mezcla";
			}
			hijo = new Perro("", sexohijo, razahijo);
		}

		return hijo;
	}
}

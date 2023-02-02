public abstract class Mascota {

	protected String nombre;
	protected Sexo vsexo;

	public Mascota(String nombre, Sexo vsexo) {

		this.nombre = nombre;
		this.vsexo = vsexo;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String toString() {
		// Obtengo en nombre de mi clase final (polimorfirmo)
		return "Soy un " + this.getClass().getName() + ", mi nombre es " + nombre + " Sexo = " + vsexo;

	}

	public abstract void decirAlgo();

	public abstract void gustosAlimentarios();

	public abstract Mascota cruzar(Mascota otra);

}
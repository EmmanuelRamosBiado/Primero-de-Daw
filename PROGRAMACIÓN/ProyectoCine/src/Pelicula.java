
public class Pelicula {

	private String titulo;
	private int duracion;
	private int edadminima;
	Genero genero;

	public Pelicula(String titulo, int duracion, int edadminima, Genero genero) {
		super();
		this.titulo = titulo;
		this.duracion = duracion;
		this.edadminima = edadminima;
		this.genero = genero;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public int getEdadminima() {
		return edadminima;
	}

	public void setEdadminima(int edadminima) {
		this.edadminima = edadminima;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

}

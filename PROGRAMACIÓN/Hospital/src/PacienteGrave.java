public class PacienteGrave extends Paciente {

	private TipoGravedad gravedad;

	public TipoGravedad getGravedad() {
		return gravedad;
	}
	
	public void setGravedad(TipoGravedad gravedad) {
		this.gravedad = gravedad;
	}

	public PacienteGrave(String nombre, TipoGravedad gravedad) {
		super(nombre);
		this.gravedad = gravedad;
	}

	public String toString() {
		return super.toString() + " Gravedad = " + gravedad;
	}
}

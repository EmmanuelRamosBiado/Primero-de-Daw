import java.util.Comparator;

public class ComparaPorNombre implements Comparator<Alumno> {

	@Override
	public int compare(Alumno arg0, Alumno arg1) {
		
		return arg0.nombre.compareTo(arg1.nombre);
	}

}

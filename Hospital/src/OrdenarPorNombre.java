import java.util.Comparator;

public class OrdenarPorNombre implements Comparator<Paciente>{

	@Override
	public int compare(Paciente o1, Paciente o2) {

		return o1.getNombre().compareTo(o2.getNombre());
	}

}

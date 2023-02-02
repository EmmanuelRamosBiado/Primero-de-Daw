import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;

public class Micoleccion {

	ArrayList<String> al;
	HashSet<String> hs;
	LinkedList<String> ll;

	Micoleccion() {
		al = new ArrayList<String>();
		hs = new HashSet<String>();
		ll = new LinkedList<String>();
	}

	void poner(String valor, int ncoleccion) {

		switch (ncoleccion) {
		case 1:
			al.add(valor);
			break;
		case 2:
			hs.add(valor);
			break;
		case 3:
			ll.add(valor);
			break;
		}
	}
}

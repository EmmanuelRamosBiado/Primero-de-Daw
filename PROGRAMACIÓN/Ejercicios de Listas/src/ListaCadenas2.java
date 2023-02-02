
public class ListaCadenas2 {
	NodoCadenas2 primero;

	ListaCadenas2() {
		primero = null;
	}

	public void ponAlPrincipio(String valor) {
		NodoCadenas2 resu=null;
		NodoCadenas2 aux=primero;
		
		NodoCadenas2 nuevo = new NodoCadenas2();
		nuevo.valor = valor;
		nuevo.siguiente = primero;
		primero = nuevo;
	}

	public boolean estaVacia() {
		return (primero == null);

	}

	public boolean buscar(String valor) {
		NodoCadenas2 resu = null;
		NodoCadenas2 aux=primero;

		while (aux!= null) {

		}

		return true;
	}
	
	public String toString() {
		String resu="";
		NodoCadenas2 aux=primero;
		while(aux!=null) {
			
		}
		return "";
	}

}

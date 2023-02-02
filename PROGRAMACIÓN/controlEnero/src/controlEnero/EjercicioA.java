package controlEnero;

public class EjercicioA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
	public static boolean rellenarTabla ( int contenedor[], int valores[]) {
		
		boolean valor = false;
		int tamañoValores = 0;
		int j = 0;
		
		for (int i = 0; i < contenedor.length; i++) {
			if (contenedor[i] == 0) {
				contenedor[i] = valores[j];
				j++;
				tamañoValores++;
			}
		}
		
		if (tamañoValores == valores.length) {
			valor = true;
		} else {
			valor = false;
		}
		
		return valor;
	}
}

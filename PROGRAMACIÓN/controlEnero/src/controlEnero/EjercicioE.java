package controlEnero;

public class EjercicioE {

	public static void main(String[] args) {
		

	}

	
	public static int[] dameDivEntre5(int valores[]) {
		
		int contador = 0;
		int k = 0;
		
		for (int i = 0; i < valores.length; i++) {
			if (valores[i] % 5 == 0) {
				contador++;
			}
		}
		
		int tabla[] = new int [contador];
		
		for (int i = 0; i < valores.length; i++) {
			if (valores[i] % 5 == 0) {
				tabla[k] = valores[i];
				k++;
			}
		}
		
		
		return tabla;
	}
}

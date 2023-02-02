package controlEnero;

public class EjercicioD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int tablaa [] = {10,2,5,3,6};
		int tablab[] = {3,5,10,7,14};
		//enComun {34,3,4,5,12} {8,4,2, 5};
		System.out.println(enComun(tablaa, tablab));
		
	}

	public static int enComun ( int ta[], int tb[]) {
		int valor = 0;
		
		for (int i = 0; i < ta.length; i++) {
			for (int j = 0; j < tb.length; j++) {
				if (ta[i] == tb[j]) {
					valor++;
				}
			}
		}
		
		return valor;
	}
	
	
	
	
}

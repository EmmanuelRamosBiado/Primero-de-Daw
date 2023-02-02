import java.util.Scanner;

public class Eje17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char tabla[] = new char [20];
		
		for (int i = 0; i < tabla.length; i++) {
			System.out.println("Introduce una letra: ");
			tabla[i] = sc.next().charAt(0);
		}
		
		for (int i = 0; i < (tabla.length-1); i++) {
			for (int j = 0; j < (tabla.length -1); j++) {
				if (tabla[j] > tabla[j+1]) {
					char aux = tabla[j];
					tabla[j] = tabla[j+1];
					tabla[j+1] = aux;
				}
			}
		}
		System.out.println("Tabla colocada:");
		for (int i = 0; i < tabla.length; i++) {
			System.out.print(tabla[i] + " ");
		}
	}

}

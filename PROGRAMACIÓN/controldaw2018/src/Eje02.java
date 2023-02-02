import java.util.Scanner;

public class Eje02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int contadorpar = 0;
		int contadorimpar = 0;
		int sumapar = 0;
		int sumaimpar = 0;
		double mediapar = 0;
		double mediaimpar = 0;
		int num = -1;
		
		do {
			System.out.print("Introduce un número o pulsa 0 para terminar: ");
			num = sc.nextInt();
			
			if (num % 2 == 0) {
				contadorpar++;
				sumapar += num;
			} else {
				contadorimpar++;
				sumaimpar += num;
			}
		} while (num != 0);
		
		mediapar = sumapar / contadorpar;
		mediaimpar = sumaimpar / contadorimpar;
		
		System.out.println("Número total de pares: " + contadorpar);
		System.out.println("Número total de impares: " + contadorimpar);
		
		if (mediapar > mediaimpar) {
			System.out.println("La media par es mayor.");
		} else {
			System.out.println("La media impar es mayor.");
		}
	}

}

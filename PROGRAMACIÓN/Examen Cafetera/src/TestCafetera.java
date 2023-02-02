import java.util.Iterator;
import java.util.Random;

public class TestCafetera {

	public static void main(String[] args) {

		Random valor = new Random();
		Cafetera cafetera[] = new Cafetera[4];

		cafetera[0] = new Cafetera();
		cafetera[1] = new Cafetera(valor.nextInt(2000) + 1000);
		cafetera[2] = new Cafetera(valor.nextInt(2000) + 1000);
		cafetera[3] = new Cafetera(valor.nextInt(2000) + 1000, 500);

		// Llenar todas las tazas de café
		for (int i = 0; i < cafetera.length; i++) {
			cafetera[i].llenarCafetera();
		}

		// Operaciones con servirTaza y agregarCafe
		for (int i = 0; i < cafetera.length; i++) {
			cafetera[i].servirTaza(valor.nextInt(2000));
			cafetera[i].agregarCafe(valor.nextInt(1000));
			cafetera[i].servirTaza(valor.nextInt(1500));
			cafetera[i].agregarCafe(valor.nextInt(750));
			cafetera[i].servirTaza(valor.nextInt(1000));
			cafetera[i].agregarCafe(valor.nextInt(500));
		}
		
		System.out.println("-------------------------------");
		System.out.println("ESTADO ACTUAL DE LAS CAFETERAS");
		System.out.println("-------------------------------");
		
		// Mostrar información
		for (int i = 0; i < cafetera.length; i++) {
			System.out.print("Cafetera Nº: " + (i + 1) + " -- ");
			System.out.println(cafetera[i].mostrarInfo());
			System.out.println();
		}
	}

}

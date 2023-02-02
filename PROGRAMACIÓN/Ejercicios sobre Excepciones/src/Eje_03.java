import java.util.Random;

public class Eje_03 {

	public static void main(String[] args) {

		try {
			generarAleatorios();
		} catch (DevilException e) {
			System.out.println("Se ha producido la excepción " + e.getMessage());
		}

		System.out.println("Fin del programa");

	}

	public static void generarAleatorios() throws DevilException {
		Random rd = new Random();
		int num;
		int contador666 = 0;

		while (true) {
			num = rd.nextInt(10) + 1;
			System.out.println(num);
			if (num == 6) {
				contador666++;
				if (contador666 == 3) {
					throw new DevilException();
				}
			} else {
				contador666 = 0;
			}
		}
	}

}

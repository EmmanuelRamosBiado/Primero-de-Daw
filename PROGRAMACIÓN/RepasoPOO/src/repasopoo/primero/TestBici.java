package repasopoo.primero;

public class TestBici {

	public static void main(String[] args) {

		System.out.println("Total de bicicletas: " + Bicicleta.bicisFabricadas());
		System.out.println("Distancia es " + Bicicleta.calcularDistancia(26, 10));
		System.out.println("-----------------");

		Bicicleta mia = new BiciMontaña("Rojo", 1000, 1);
		BiciElectrica tuya = new BiciElectrica("Azul", 400, 50);
		Bicicleta suya = new BiciMontaña("Negra", 500, 2);

		mia.fijarMarcha(1);
		tuya.fijarMarcha(2);
		suya.fijarMarcha(3);

		tuya.fijarayuda(10);

		mia.pedalear(10);
		tuya.pedalear(10);
		suya.pedalear(10);

		mia.verInfo();
		tuya.verInfo();
		suya.verInfo();

		System.out.println("-----------------");
		System.out.println("Total de bicicletas: " + Bicicleta.bicisFabricadas());
	}
}

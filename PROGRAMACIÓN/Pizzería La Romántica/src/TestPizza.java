public class TestPizza {
	public static void main(String argv[]) {

		Pizza p1 = new Pizza(TipoPizza.MARGARITA, TamañoPizza.MEDIANA);
		Pizza p2 = new Pizza(TipoPizza.CUATROQUESOS, TamañoPizza.FAMILIAR);
		p2.sirve();
		Pizza p3 = new Pizza(TipoPizza.BARBACOA, TamañoPizza.MEDIANA);
		System.out.println("INFORMACION SOBRE LAS PIZZAS");
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		p2.sirve();
		System.out.println(" Total Pizza pedidas: " + Pizza.getTotalPedidas());
		System.out.println(" Total Pizza servidas: " + Pizza.getTotalServidas());

	}
}

public class PilaEnterosTest {

	public static void main(String[] args) {

		PilaEnteros a = new PilaEnteros(5);
		
		System.out.print("{");
		for (int i = 0; i < a.valores.length; i++) {
			System.out.print(a.valores[i]);
			if (i != a.valores.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.println("}");
		System.out.println("Contador: " + a.contadorNumeros);
		System.out.println("-------------\n");

		a.push(5);
		a.push(6);
		
		System.out.print("{");
		for (int i = 0; i < a.valores.length; i++) {
			System.out.print(a.valores[i]);
			if (i != a.valores.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.println("}");
		System.out.println("Contador: " + a.contadorNumeros);
		System.out.println("-------------\n");
		
		a.pop();
		a.push(7);
		a.push(4);
		
		System.out.print("{");
		for (int i = 0; i < a.valores.length; i++) {
			System.out.print(a.valores[i]);
			if (i != a.valores.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.println("}");
		System.out.println("Contador: " + a.contadorNumeros);
		System.out.println("-------------\n");
		
		System.out.println(a.peek());
		System.out.println(a.estaVacio());
		System.out.println(a.estaLleno());

	}

}

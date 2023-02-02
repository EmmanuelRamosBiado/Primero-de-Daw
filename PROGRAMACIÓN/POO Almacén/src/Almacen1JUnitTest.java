import static org.junit.Assert.*;

import org.junit.Test;

public class Almacen1JUnitTest {

	@Test
	public void posicionesLibres() {
		Almacen1 almacen1 = new Almacen1();
		assertTrue(almacen1.numPosicionesLibres() == 10);
	}

	@Test
	public void anadirBuscarValores() {
		Almacen1 almacen1 = new Almacen1();

		// llamar a ponValor x veces
		almacen1.ponValor(1);
		almacen1.ponValor(2);
		almacen1.ponValor(3);
		almacen1.ponValor(4);

		// 2 llamadas estaValor y comprobar test
		assertTrue(almacen1.estaValor(1) == true);
		assertFalse(almacen1.estaValor(12) == true);

	}
}

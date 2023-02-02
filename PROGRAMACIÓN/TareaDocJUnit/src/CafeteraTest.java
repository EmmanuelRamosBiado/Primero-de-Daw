import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CafeteraTest {

	@Test
	void getCapacidadMaximaTest() {
		Cafetera c = new Cafetera();
		c.getCapacidadMáxima();
		assertTrue(c.getCapacidadMáxima() == 1000);
		assertEquals(1000, c.getCapacidadMáxima());
	}

	@Test
	void getCapacidadActualTest() {
		Cafetera c = new Cafetera(1500);
		c.vaciarCafetera();
		assertEquals(0, c.getCapacidadActual());
		c.llenarCafetera();
		assertFalse(c.getCapacidadActual() == 15000000);
	}

	@Test
	void llenarCafeteraTest() {
		Cafetera c = new Cafetera(1000, 500);
		c.llenarCafetera();
		assertTrue(c.getCapacidadActual() == 1000);
		assertTrue(c.getCapacidadActual() == c.getCapacidadMáxima());
	}

	@Test
	void vaciarCafeteraTest() {
		Cafetera c = new Cafetera(2000, 10);
		c.vaciarCafetera();
		assertTrue(c.getCapacidadActual() == 0);
		assertFalse(c.getCapacidadActual() == 123456789);
	}

	@Test
	void servirTazaTest() {
		Cafetera c = new Cafetera();
		c.llenarCafetera();
		c.servirTaza(500);
		assertEquals(500, c.getCapacidadActual());
		c.servirTaza(1000000);
		assertEquals(0, c.getCapacidadActual());
	}

	@Test
	void agregarCafeTest() {
		Cafetera c = new Cafetera(1500);
		c.agregarCafe(100000);
		assertEquals(c.getCapacidadMáxima(), c.getCapacidadActual());
		c.vaciarCafetera();
		c.agregarCafe(500);
		assertTrue(c.getCapacidadActual() == 500);
	}

}

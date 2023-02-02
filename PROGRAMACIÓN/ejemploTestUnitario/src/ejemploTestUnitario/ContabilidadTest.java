package ejemploTestUnitario;

import static org.junit.Assert.*;

import org.junit.Test;

public class ContabilidadTest {

	@Test
	public void testIngresar() {
		Contabilidad contabilidad = new Contabilidad();
		assertNotNull(contabilidad.gastos);
		assertNotNull(contabilidad.ingresos);
		assertNotNull(contabilidad.saldo);
		contabilidad.ingresar(30.0);
		assertTrue(contabilidad.saldo == 30.0);
		contabilidad.ingresar(20.0);
		assertFalse(contabilidad.saldo < 50.0);
		Double var2 = 50.0;
		assertEquals(var2, contabilidad.saldo);
	}

	@Test
	public void testExtraer() {
		Contabilidad contabilidad = new Contabilidad();
		contabilidad.ingresar(20.0);
		contabilidad.extraer(50.0);
		assertTrue(contabilidad.saldo >= 0);
	}

}

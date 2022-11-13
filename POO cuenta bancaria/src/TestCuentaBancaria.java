public class TestCuentaBancaria {

	public static void main(String argv[]) {

		CuentaBancaria c1 = new CuentaBancaria(100);
		CuentaBancaria c2 = new CuentaBancaria(1900);
		CuentaBancaria c3 = new CuentaBancaria();

		System.out.println(" N.º de Cuentas=" + CuentaBancaria.totalCuentas());
		c1.abono(20);
		c1.ingreso(10);
		c1.anotarGastos();
		System.out.println(" Cuenta c1 = " + c1.consultarEstado());

		c2.ingreso(100);
		c2.anotarGastos(); // No se aplican pues su saldo es mayor que 1000
		c2.anotarIntereses(5); // 5% de interes
		c2.transferencia(100, c3);
		System.out.println(" Cuenta c2 = " + c2.consultarEstado());

		c3.abono(75);
		c3.abono(75);
		System.out.println(" Cuenta c3 = " + c3.consultarEstado());

	}
}
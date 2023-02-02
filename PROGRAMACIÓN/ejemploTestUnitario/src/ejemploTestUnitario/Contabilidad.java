package ejemploTestUnitario;

public class Contabilidad {
	Double saldo = 0.0;
	Double ingresos = 0.0;
	Double gastos = 0.0;

	public Double ingresar(Double ingresos) {
		this.ingresos = ingresos;
		this.saldo = this.saldo + ingresos;
		return this.saldo;
	}

	public Double extraer(Double gastos) {
		if (gastos <= saldo) {
			this.gastos = gastos;
			this.saldo -= gastos;
		}

		return this.saldo;
	}

}

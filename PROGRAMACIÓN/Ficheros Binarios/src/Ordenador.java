import java.io.Serializable;

public class Ordenador implements Serializable, Comparable<Ordenador> {

	private static final long serialVersionUID = 1234567890L;

	// instance variables
	String marca;
	int a�o;
	int memoriaRam;
	int disco;
	int numserie;

	public Ordenador(int numserie, String marca, int a�o, int memoriaRam, int disco) {
		this.numserie = numserie;
		this.marca = marca;
		this.a�o = a�o;
		this.memoriaRam = memoriaRam;
		this.disco = disco;
	}

	public String toString() {
		return numserie + ":" + marca + ":" + a�o + ":" + memoriaRam + " GB:" + disco + " GB";
	}

	@Override
	public int compareTo(Ordenador o) {
		return this.a�o - o.a�o;
	}
}
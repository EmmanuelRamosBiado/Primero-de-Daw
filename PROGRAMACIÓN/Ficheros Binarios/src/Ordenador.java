import java.io.Serializable;

public class Ordenador implements Serializable, Comparable<Ordenador> {

	private static final long serialVersionUID = 1234567890L;

	// instance variables
	String marca;
	int año;
	int memoriaRam;
	int disco;
	int numserie;

	public Ordenador(int numserie, String marca, int año, int memoriaRam, int disco) {
		this.numserie = numserie;
		this.marca = marca;
		this.año = año;
		this.memoriaRam = memoriaRam;
		this.disco = disco;
	}

	public String toString() {
		return numserie + ":" + marca + ":" + año + ":" + memoriaRam + " GB:" + disco + " GB";
	}

	@Override
	public int compareTo(Ordenador o) {
		return this.año - o.año;
	}
}
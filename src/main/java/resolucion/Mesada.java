package resolucion;

public class Mesada implements Comparable<Mesada> {
	private long alto;
	private long ancho;

	public Mesada(long alto, long ancho) {
		this.alto = alto;
		this.ancho = ancho;
	}

	private Mesada rotar90() {
		return new Mesada(this.ancho, this.alto);
	}

	public long getArea() {
		return this.alto * this.ancho;
	}

	public boolean puedeApilarseEn(Mesada otra) {
		if ((this.alto <= otra.alto) && (this.ancho <= otra.ancho))
			return true;

		Mesada rotada = this.rotar90();

		if ((rotada.alto <= otra.alto) && (rotada.ancho <= otra.ancho))
			return true;

		return false;
	}

	public int compareTo(Mesada o) {
		return -Long.compare(this.getArea(), o.getArea());
	}
}
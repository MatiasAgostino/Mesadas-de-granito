package resolucion;

public class App {
	private AcomodadorDeMesadas acomodador;

	public static void main(String[] args) {
		App app = new App();

		app.ejecutar("mesadas0");
	}

	public int ejecutar(String nombre) {
		int res;
		Archivo archivo = new Archivo();

		this.acomodador = archivo.leerArchivo("src/main/java/in/" + nombre + ".in");

		archivo.escribirArchivo("src/main/java/out/" + nombre + ".out", res = this.acomodador.armarPilas());

		return res;
	}
}

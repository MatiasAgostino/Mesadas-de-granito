package test;

import static org.junit.Assert.*;
import resolucion.*;

public class Test {

	@org.junit.Test
	// Verifica que el programa apile como corresponde, evitando crear una gran pila
	// con todas las mesadas.
	public void evitarGranPila() {
		App app = new App();

		assertEquals(3, app.ejecutar("mesadas0"));
	}

	@org.junit.Test
	// Verifica que las mesadas roten 90 grados cuando sea necesario.
	public void rotar90() {
		App app = new App();

		assertEquals(2, app.ejecutar("mesadas1"));
	}

	@org.junit.Test
	// Verifica que el criterio de apilacion sea por el largo y ancho de las
	// mesadas, no solo por su area.
	public void noSoloPorElArea() {
		App app = new App();

		assertEquals(2, app.ejecutar("mesadas2"));
	}

	// Verfifica que una mesada con dimensiones iguales a la antecesora puedan
	// apilarse.
	@org.junit.Test
	public void mesadasIguales() {
		App app = new App();

		assertEquals(1, app.ejecutar("mesadas3"));
	}

	@org.junit.Test
	// Verifica que no apile solo por el ancho de la mesada.
	public void noSoloPorAncho() {
		App app = new App();

		assertEquals(2, app.ejecutar("mesadas4"));
	}

	@org.junit.Test
	// Verifica que no apile solo por el alto de la mesada.
	public void noSoloPorAlto() {
		App app = new App();

		assertEquals(2, app.ejecutar("mesadas5"));
	}

	@org.junit.Test
	// Verifica el correcto funcionamiento corriendo el caso fatiga.
	// Caso fatiga: Mayor cantidad de mesadas, con la mayor cantidad de dimensiones
	// y todas son apilables en una pila.
	public void fatiga() {
		App app = new App();

		assertEquals(1, app.ejecutar("fatiga"));
	}
}

package resolucion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AcomodadorDeMesadas {
	private List<Mesada> mesadas;
	private List<Mesada> pilas;

	public AcomodadorDeMesadas() {
		this.mesadas = new ArrayList<Mesada>();
		this.pilas = new ArrayList<Mesada>();
	}

	public void agregarMesada(Mesada otra) {
		this.mesadas.add(otra);
	}

	public int armarPilas() {
		Collections.sort(this.mesadas);

		this.pilas.add(this.mesadas.get(0));

		for (int i = 1; i < this.mesadas.size(); i++) {
			boolean apilo = false;

			for (int j = 0; j < this.pilas.size() && !apilo; j++) {
				if (this.mesadas.get(i).puedeApilarseEn(this.pilas.get(j))) {
					this.pilas.set(j, this.mesadas.get(i));
					apilo = true;
				}
			}

			if (apilo == false)
				this.pilas.add(this.mesadas.get(i));
		}

		return this.pilas.size();
	}
}
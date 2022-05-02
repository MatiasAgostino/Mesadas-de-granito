package resolucion;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Archivo {
	private AcomodadorDeMesadas acomodador;

	public Archivo() {
		this.acomodador = new AcomodadorDeMesadas();
	}

	public AcomodadorDeMesadas leerArchivo(String path) {
		File file = null;
		Scanner sc = null;

		try {
			file = new File(path);
			sc = new Scanner(file);

			int cantMesadas = sc.nextInt();

			for (int i = 0; i < cantMesadas; i++) {
				this.acomodador.agregarMesada(new Mesada(sc.nextLong(), sc.nextLong()));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sc.close();
		}

		return this.acomodador;
	}

	public void escribirArchivo(String path, int cantPilas) {
		FileWriter file = null;
		PrintWriter printerWriter = null;

		try {
			file = new FileWriter(path);
			printerWriter = new PrintWriter(file);

			printerWriter.println(cantPilas);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (file != null) {
				try {
					file.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}

	public void escribirArchivoFatiga(String path) {
		FileWriter file = null;
		PrintWriter printerWriter = null;

		try {
			file = new FileWriter(path);
			printerWriter = new PrintWriter(file);

			printerWriter.println(200000);

			for (int i = 0; i < 200000; i++) {
				printerWriter.println((1000000 - i) + " " + (1000000 - i));
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (file != null) {
				try {
					file.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
}
package GraphicsGeometrie.src.at.bfi.oop.konzepten.l_generic.geometrie;

import java.util.Scanner;

public class TestGraphics {

	public static void main(String[] args) {

		RechteckGeneric<Double, Double> rechteck_1 = new RechteckGeneric<Double, Double>();

		// rechteck_2: Hier wird dieses Objekt mit Diamond -Operator <>, ohne Datentyps,
		// erzeugt.
		// => Diese Operator sorgt daf[r dass der Kompiler ein Objekt mit Hilfe von
		// Deklaration (Linke seite)
		// erstellt.
		RechteckGeneric<Double, Double> rechteck_2 = new RechteckGeneric<>();

		try (Scanner scanner = new Scanner(System.in)) {

			System.out.println("Laenge: ");
			rechteck_1.setT(scanner.nextDouble());

			System.out.println("Bereite: ");
			rechteck_1.setV(scanner.nextDouble());

			double umfang = (rechteck_1.getT() + rechteck_1.getV()) * 2;
			double flaeche = (rechteck_1.getT() * rechteck_1.getV());

			System.out.println("Umfang: " + umfang);
			System.out.println("Flaeche: " + flaeche);

			// System.out.println(System.in.available());
		}

	}

}

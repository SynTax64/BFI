package HowToSort.sort_with_Comparable;

import java.util.Arrays;

public class TestGraphicsC {

	public static void main(String[] args) {

		Geometrie[] geometries = new Geometrie[6];
//		geometries[0] = new Rechteck(2, 3);
//		geometries[1] = new Rechteck(1.5, 1.2);
//		geometries[2] = new Rechteck(3.5, 3.2);
//		geometries[3] = new Kreis(3.0);
//		geometries[4] = new Kreis(0.4);
//		geometries[5] = new Rechteck(0.4, 0.5);

		System.out.println("********Vergleich mit compareTo von String***************");
		System.out.println("Safavi".compareTo("Anderson"));
		System.out.println(geometries[1].compareTo(geometries[0]));

		System.out.println("****Berechnung von alle Geometrie -Objekten des Arrays****");
		for (Geometrie geometrie : geometries) {

			System.out.format("Flaeche %.2f\n", geometrie.berechneFlaeche());

		}
		System.out.println("**************Sortierte Liste mit Arrays***************");

		// Sortieren und Anzeigen
		Arrays.sort(geometries);
		// Die Klaase Arrays ist so programmiert dass die Objekte des Arrays mit hilfe
		// von
		// Comprable -Interface vergliechen und danach sortiert werden koennen.
		// (d.h.: compareTo() Methode wird dort verwendet.)

		for (Geometrie geometrie : geometries) {

			System.out.format("Flaeche %.2f\n", geometrie.berechneFlaeche());

		}

		/*
		 * System.out.println("*****Vergleich mit sortierte Strings in Arrays*******");
		 * String[] s= {"vi","Sa","fa"};
		 * 
		 * Arrays.sort(s); for (String text : s) {
		 * 
		 * System.out.println(text); }
		 */

	}

}

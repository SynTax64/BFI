package at.bfi.basics.arrays;

public class TestArrays {
	public static void main(String[] args) {
		int[] myArray; // Deklaration
		myArray = new int[5]; // Definition, Arrays in Java haben Fixe länge
		// und sie sind vom Datentyp, der beim Deklaration festgestellt wurde.

		// Initialisierung
		// mit Hilfe von Indices
		myArray[0] = 100;
		myArray[1] = 101;
		myArray[2] = 102;
		myArray[3] = 103;
		myArray[myArray.length - 1] = 104;

		// Die Länge von myArray
		int size = myArray.length;
		System.out.println("Die Länge vom myArray: " + size);

		System.out.println("Ausgabe von myArray mit normaler for -Schleife");
		for (int i = 0; i < myArray.length; i++) {
			System.out.println("An der Stelle " + i + " hat den Wert: " + myArray[i]);
		}
		System.out.println("Ausgabe von myArray mit foreach -Schleife");
		for (int i : myArray) {
			System.out.println(i);
		}
	}
}

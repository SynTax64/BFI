package InterfaceStaticGenerics_Zusatz.src.at.bfi.oop.zusatz.statictest;

public class StaticTest_1 {

	int a = 0;

	public static void main(String[] args) {

		// Wenn ich ein Objekt von der Klasse StaticUmgebung erzeuge, kann ich
		// auf saemtliche statische und nicht statische Attributen und Methoden dieser
		// Klasse zugreifen
		// Achten Sie darauf dass unsere main() methode selbst static ist.
		StaticUmgebung sum_1 = new StaticUmgebung();
		System.out.println(sum_1.heigherCounter());
		System.out.println(sum_1.counter);

		//////////////////////////////////////
		// Wenn ich aber auf dieser Klasse ohne Objekte zugreifen will, kann ich diese
		////////////////////////////////////// Klassennamen verwenden und
		// wenn dort statische Felder exisieren , auf die zuzugreifen.
		// Ich kann also auf Attributen und Methoden,die static definiert sind,
		////////////////////////////////////// zugreifen.
		System.out.println(StaticUmgebung.counter);
		// System.out.println(StaticUmgebung.heigher()); ist nicht moeglich, da
		// heigherCounter() ist nicht statisch.
		System.out.println(StaticUmgebung.increasCounter());

	}

}

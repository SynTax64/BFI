package InterfaceStaticGenerics_Zusatz.src.at.bfi.oop.zusatz.statictest;

//Thema >   Statische Variablen oder Klassen -Variablen
//Statische Methoden 
//sie werden benutzt wenn man informationen unabhaengig von Instanzen speichern moechte.
//Statische Felder werden nicht zur Laufzeit erzeugt, sondern wenn der Klasse geladen wird.
//Sie existieren bis ende der Programmlaufzeit
//Sie sind unabhaengig von Instanzen
//Sie existieren einmal pro Klasse

public class StaticUmgebung {

	static int counter;
	int zaehler;

	public int heigherCounter() {

		return ++counter;

	}

	public static int increasCounter() {

		return ++counter;
	}

	/*
	 * public static int hoeherZaehler() {
	 * 
	 * return zaehler++; // nicht moeglich weil der Variable "zaehler" nicht als
	 * static gekennzichnet wurde. }
	 */
	public int erhoeheZaehler() {

		return ++zaehler; // moeglich weil der Variable "zaehler" nicht statisch ist .
	}

}

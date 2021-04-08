package generics.Calculation.src.at.oop.innereklasse.calculation;

import generics.Calculation.src.at.oop.innereklasse.calculation.PrivatKonto.HausHaltsplan;
import generics.Calculation.src.at.oop.innereklasse.calculation.PrivatKonto.HausHaltsplan.Ausgaben;
import generics.Calculation.src.at.oop.innereklasse.calculation.PrivatKonto.HausHaltsplan.Eingaben;

public class TestBank {

	public static void main(String[] args) {
		// siehe privatekonto.java

//Innerklasse ist eine Klasse die innerhalb einer andere Klasse deklariert wird.
//innereklasse darf auch public sein
//Wir koennen mehrere innereklasse innerhalb einer Klasse delklarieren
//Innereklasse darf selbt  andere innereklasse beeinhalten

		PrivatKonto privatKonto = new PrivatKonto(123);
		HausHaltsplan haushaltsplan = privatKonto.new HausHaltsplan();

		Ausgaben ausgaben = haushaltsplan.new Ausgaben();
		Eingaben eingaben = haushaltsplan.new Eingaben();
		eingaben.eingabe();
		ausgaben.ausgabe();

	}

}

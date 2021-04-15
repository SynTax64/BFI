package BankCollection.src.at.bfi.standards.B_CollectionMapProperties.test;

import java.util.HashSet;
import java.util.Set;

import BankCollection.src.at.bfi.standards.B_CollectionMapProperties.GeschaeftsKonto;
import BankCollection.src.at.bfi.standards.B_CollectionMapProperties.GeschaeftsKunde;
import BankCollection.src.at.bfi.standards.B_CollectionMapProperties.Kunde;

public class TestBank_B_HashSet {

	public static void main(String[] args) {

		// schritt 4
		// anstatt List eine andere klasse namens Set verwenden
		// bei list : werden die Objekte nach Reihenfolge hinzugefuegt
		// bei Set : die Reihenfolge geht verloren
		// bei list kann ein gleiche Objekt mehrfach vorkommen(nachteil)
		// bei Set : z.B.: in einem Bank kann ein gewisse Kunde nur einmal vorkommen

		Set<Kunde> bank_2 = new HashSet<Kunde>();

		bank_2.add(new GeschaeftsKunde(new GeschaeftsKonto(523)));
		bank_2.add(new GeschaeftsKunde(new GeschaeftsKonto(524)));
		// verwenden von foreach einfacher
		for (Kunde kunde : bank_2) {
			System.out.println("kontos: " + kunde.getKonto().getKonto_nr());

		}
		// bei Set : z.B.: in einem Bank kann ein gewisse Kunde nur einmal vorkommen
		Kunde kunde_525 = new GeschaeftsKunde(new GeschaeftsKonto(525));

		bank_2.add(kunde_525);
		bank_2.add(kunde_525);

		for (Kunde kunde : bank_2) {
			System.out.println("kontos: " + kunde.getKonto().getKonto_nr());

		}

	}

}

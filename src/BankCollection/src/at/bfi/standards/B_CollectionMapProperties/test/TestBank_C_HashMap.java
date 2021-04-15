package BankCollection.src.at.bfi.standards.B_CollectionMapProperties.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import BankCollection.src.at.bfi.standards.B_CollectionMapProperties.Kunde;
import BankCollection.src.at.bfi.standards.B_CollectionMapProperties.GeschaeftsKonto;
import BankCollection.src.at.bfi.standards.B_CollectionMapProperties.GeschaeftsKunde;

public class TestBank_C_HashMap {

	public static void main(String[] args) {

		// Schritt 5
		// Thema Map, HashMap
		// die ghoeren nicht zu Collection -Api
		// die verwenden wir , wenn wir eine Liste mit
		// (schluessel, wert) -Paare brauchen.

		// HashMap implementiert Map

		Map<Integer, Kunde> bank = new HashMap<Integer, Kunde>();

		Integer key_1 = 1;// oder: Integer key_1 =Integer.valueOf(1);
		Kunde value_1 = new GeschaeftsKunde(new GeschaeftsKonto(777));

		Integer key_2 = 2;// oder: Integer key_1 =Integer.valueOf(1);
		Kunde value_2 = new GeschaeftsKunde(new GeschaeftsKonto(778));

		bank.put(key_1, value_1);
		bank.put(key_2, value_2);

		for (Entry<Integer, Kunde> entry : bank.entrySet()) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}

		Integer key;
		Kunde value;

		for (Entry<Integer, Kunde> entry : bank.entrySet()) {

			key = entry.getKey();
			value = entry.getValue();

			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
			System.out.println(value.getKonto().getKonto_nr());

		}
		// Erklaerung:

		// fuer Iterrieren (hier zur Ausgabe) brauchen wir eine Methode namens
		// EntrySet
		// im EntrySet gibt es ein set von entries
		// jedes "entry" enthaelt unseren Kunden mit dem "Key und Value -Paare"
		// man schreibt hinter "bank_3",der eigentlich unsere Kundenliste mit Werten
		// und keys enthaelt, zuerst:
		// bank_3.entrySet() , die restliche macht fuer uns der Kompiler
		// aendern Sie bitte dann "kunde" zu "entry" fuer besseres Verstaendnis

	}
}

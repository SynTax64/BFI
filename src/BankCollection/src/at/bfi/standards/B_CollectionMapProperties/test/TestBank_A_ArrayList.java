package BankCollection.src.at.bfi.standards.B_CollectionMapProperties.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import BankCollection.src.at.bfi.standards.B_CollectionMapProperties.GeschaeftsKonto;
import BankCollection.src.at.bfi.standards.B_CollectionMapProperties.GeschaeftsKunde;
import BankCollection.src.at.bfi.standards.B_CollectionMapProperties.Konto;
import BankCollection.src.at.bfi.standards.B_CollectionMapProperties.Kunde;
import BankCollection.src.at.bfi.standards.B_CollectionMapProperties.PrivatKonto;
import BankCollection.src.at.bfi.standards.B_CollectionMapProperties.PrivatKunde;

//Thema: Collections DatenTypen & Map & Property
//siehe zuerst Bank.java wird geloescht 

public class TestBank_A_ArrayList {

	public static void main(String[] args) {

		// schritt 1
		// Java.util -package : delariert "List"
		// als "Interface"
		// ArrayList ist eine Generische Klasse oder Datentyp
		// ArrayList<T> kann unterschiedliche Datentypen annehmen.

		// ArrayList<Kunde> bank = new ArrayList<Kunde>();

		// ArrayList<Kunde> allgemeineKundenListe = new ArrayList<Kunde>();

		// schritt 2
		// anstatt ArrayList koennen wir das Interface : List verwenden
		// denn: ArrayList implementiert List
		// import : import java.util.List;

		ArrayList<Kunde> allgemeineKundenListe = new ArrayList<Kunde>();

		List<PrivatKunde> privat_kunden_Liste = new ArrayList<PrivatKunde>();
		// bei list : werden die Objekte nach Reihenfolge hinzugefuegt
		privat_kunden_Liste.add(new PrivatKunde(new PrivatKonto(1000)));
		privat_kunden_Liste.add(new PrivatKunde(new PrivatKonto(1001)));

		List<GeschaeftsKunde> geschaefts_kunden_liste = new ArrayList<GeschaeftsKunde>();
		geschaefts_kunden_liste.add(new GeschaeftsKunde(new GeschaeftsKonto(2000)));
		geschaefts_kunden_liste.add(new GeschaeftsKunde(new GeschaeftsKonto(2001)));

		Collection<Kunde> collection = new ArrayList<Kunde>();
		collection.add(new Kunde(new Konto(4000)));

		collection.addAll(privat_kunden_Liste);
		collection.addAll(geschaefts_kunden_liste);

		allgemeineKundenListe.addAll(collection);

		System.out.println("Ausgabe mit for -Iterator");
		// Iteration over Collection
		for (Iterator iterator = collection.iterator(); iterator.hasNext();) {
			Kunde kunde = (Kunde) iterator.next();

			System.out.println(kunde.getKonto().getKonto_nr());
		}

		System.out.println("Ausgabe mit normale foreach");
		for (Kunde kunde : allgemeineKundenListe) {

			System.out.println(kunde.getKonto().getKonto_nr());

		}

		// bei list kann ein gleiche Objekt mehrfach vorkommen(nachteil)
		// hier addiere ich nochmals dasselbe collection
		System.out.println("Beim addieren dieselben collection");
		allgemeineKundenListe.addAll(collection);

		for (Kunde kunde : allgemeineKundenListe) {

			System.out.println(kunde.getKonto().getKonto_nr());

		}

	}

}

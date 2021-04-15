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

public class Test {
	public static void main(String[] args) {
		List<PrivatKunde> privat_kunden_Liste = new ArrayList<PrivatKunde>();
		privat_kunden_Liste.add(new PrivatKunde(new PrivatKonto(1000)));
		privat_kunden_Liste.add(new PrivatKunde(new PrivatKonto(1001)));

//		for (Iterator iterator = privat_kunden_Liste.iterator(); iterator.hasNext();) {
//			PrivatKunde privatKunde = (PrivatKunde) iterator.next();
//			System.out.println(privatKunde.getKonto().getKonto_nr());
//		}
		List<GeschaeftsKunde> geschaefts_kunden_liste = new ArrayList<GeschaeftsKunde>();
		geschaefts_kunden_liste.add(new GeschaeftsKunde(new GeschaeftsKonto(2000)));
		geschaefts_kunden_liste.add(new GeschaeftsKunde(new GeschaeftsKonto(2001)));

//		for (Iterator iterator = geschaefts_kunden_liste.iterator(); iterator.hasNext();) {
//			GeschaeftsKunde geschaeftsKunde = (GeschaeftsKunde) iterator.next();
//			System.out.println(geschaeftsKunde.getKonto().getKonto_nr());
//		}

		Collection<Kunde> collection = new ArrayList<Kunde>();
		collection.add(new Kunde(new Konto(4000)));

		collection.addAll(privat_kunden_Liste);
		collection.addAll(geschaefts_kunden_liste);
		collection.add(new Kunde(new Konto(4000)));

		for (Iterator iterator = collection.iterator(); iterator.hasNext();) {
			Kunde kunde = (Kunde) iterator.next();
			System.out.println(kunde.getKonto().getKonto_nr());
		}
	}
}

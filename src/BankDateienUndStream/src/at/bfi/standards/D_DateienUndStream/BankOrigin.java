package BankDateienUndStream.src.at.bfi.standards.D_DateienUndStream;

//Aenderung von Schritt 1 mit Generics

import java.util.Arrays;

//A) siehe <E extends Kunde>
//B) siehe Kunde[] kunden... deklaration und die Aenderung

//Wir koennn Generics nutzen um bei Objektvariablen (Hier kunden-Array) einer Klasse 
//festzulegen,dass diese Datentyp (hier: Kunde) am Anfang noch nicht feststeht.

//E unten: nennt man eine Generisches Datentyp
//Dann E ersetzt unseren Datentyp : Kunde (Kunde --> E)

//Dann loeschen Sie setters ungetters von Kunde -Attribute
//und ersetzen Sie mit setters und getters von e

//===> wir haben hier eine "Generisches Bank" erzeugt:
//Dh. : Ein Bank ,der generisches elemnten hat ,deren Datentyp noch nicht festgelegt worden.

//dann gehen Sie im TestBank.java und schauen Sie dort
//wie die generische Datentypen verwendet werden.

//Achtung : wenn wir nur "E" schreiben anstaat "E extends Kunde"
//dann E koente jede " B E L I B I E G E S" Datentyp annehmen.
//Einschraekung ==> "E extends Kunde"

//diese Typ kann eine der abgeleiteten klassen von Kunde sein
//z.B) Geschaeftskunde

public final class BankOrigin {

	private Kunde[] kunden;

	public Kunde[] getKunden() {
		return kunden;
	}

	public void setKunden(Kunde[] kunden) {
		this.kunden = kunden;
	}

	@Override
	public String toString() {
		return "Bank [kunden=" + Arrays.toString(kunden) + "]";
	}

}

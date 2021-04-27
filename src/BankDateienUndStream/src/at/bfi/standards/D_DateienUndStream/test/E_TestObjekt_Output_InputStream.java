package BankDateienUndStream.src.at.bfi.standards.D_DateienUndStream.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import BankDateienUndStream.src.at.bfi.standards.D_DateienUndStream.GeschaeftsKonto;
import BankDateienUndStream.src.at.bfi.standards.D_DateienUndStream.GeschaeftsKunde;
import BankDateienUndStream.src.at.bfi.standards.D_DateienUndStream.Kunde;

//Thema: 				Stream und Ein/Ausgabe Dateien
//Teil_5				ObjektOutputStream und ObjektInputStream (Abstrakte Klassen)
//					
//Wichtige Methoden:	ReadObjekt()
//						und WriteObjekt()

//Serialisierung ist ein Mechanismus, bei dem Objekte 
//in eine Folge von Bytes verwandelt 
//und umgekehrt daraus wieder Objekte erzeugt werden.

public class E_TestObjekt_Output_InputStream {

	public static void main(String[] args) throws Exception {
		// Schritt 6:
		///////////////////////////////////////////////////////////////////////////
		// Bis jetzt haben wir gelernt wie man "Bytes" und "Zeichenkette"
		// einliest und speichert.
		// Nun jetzt will ich euch zeigen , wie das Speichern von
		// "Objekten" auf die festplatte
		// funktioniert:
		// Objekten werden auch in form von Bytes auf die Festplatte gespeichert
		// Spaeter wenn wir unseren Objekt brauchen oder verwenden wollen,
		// kann man aus "Bytes" unseren Objekt neu zu bilden.
		// So bleibt die urspruengliche Zustand des Objekts beibehalten
		//
		//
		// Package java.io deklariert: ObjektOutputStream -Klasse
		// Die Methode: WriteObjekt()
		// Somit kann ein Objekt auf eine Ausgabe Strom
		// (z.B. in einem file auf die Festplatte) geschrieben werden.
		// Es kann aber auch,anstatt Festplatte, eine Entfernte Rechner
		// als Ausgabe Strom betrachtet werden.
		//
		//
		// Package java.io deklariert: ObjektInputStream -Klasse
		// Die Methode: readObjekt()
		// Somit wird ein Objekt eingelesen werdem.
		//
		//
		// Die Automatische Umwandlung der Java Objekte in einem "Byte Strom"
		// bezeichnet man als: ****Serialisierung*****
		// umgekert heisst es: *****DeSerialisieren***********
		//
		//
		// Laufzeit -Umgebung JRE verlangt:
		// Die klasse die serialisert werden moechte muss das interface
		// ***Serializable*** implementieren
		// Auch Objekte der Objekte mussen dieses Interface implemntieren
		// z.b ) Kunden und konten der Kunden
		// Es gibt in Java 2 Art von Klassen:
		//
		//
		// Die Serialisierbare Klassen wie : Strings und Wraper -Klassen
		// Die nicht Serialisierbare Klassen wie FileInputStream
		//
		//
		// Also wenn (z.B) die Klasse Kunde Serialisiert ist dann kann man sie
		// auf die Festplatte zu speichern.
		//
		//
		// wenn man spaeter die klasse Kunde erweitern moechte , gibt es noch ein
		// problem> "Versionierung"
		//
		//
		// Die Klassen die serializable interface implementieren wollen,
		// muessen diese Objekt -Variablen deklarieren:
		// "serialVersionUID"
		// private static final long serialVersionUID = 288282828282882L;
		//
		//
		// Durch diese nummer akzeptiert die java Laufzeit Umgebung, JRE, die
		// Aenderungen oder
		// Erweiterungen durchzufuehren.JRE merkt diese nummer und immer wenn jre
		// bemerkt dass eine Klasse "serialVersionUID" besitzt, er vergleicht diese
		// beide nummer.
		//////////////////////////////////////////////////////////////////
		// Im diesen Beispiel werden Kunde und Konto Objekten serialisiert und bekommen
		// deswegen serialVersionUID. Somit JRE ist zufrieden und wir duerfen die
		// Objekte auf der Festplatte oder auf einer anderen Ausgabe Stream zu
		// speichern.
		////////////////////////////////////////////////////////////////////

		String dateiNameInput = "C:" + File.separator + "TEMPOR" + File.separator + "kunde.ser";

		Kunde kunde_1 = new GeschaeftsKunde(new GeschaeftsKonto(323));

		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(dateiNameInput));

		out.writeObject(kunde_1);// ===> Objekt wird auf Festplatte geschrieben

		out.close();

		ObjectInputStream in = new ObjectInputStream(new FileInputStream(dateiNameInput));

		Object object = in.readObject();

		if (object instanceof Kunde) {
			Kunde kunde_2 = (Kunde) object;

			System.out.println(kunde_2.getKonto().getKonto_nr());

		}

		in.close();
		// wenn man das programm an dieser Stelle kompliert, bekommt man Fehler:
		// "Die Serialisierung + Serialisierungs nummer " fehlen:
		// das heisst kunde und sein klassenObjetk(konto) muessen damit eingeruestet
		// werden.
		// sehen sie Kunde und konto -Klassen
	}

}

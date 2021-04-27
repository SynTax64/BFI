package BankDateienUndStream.src.at.bfi.standards.D_DateienUndStream.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

//Thema: 			Stream und Ein/Ausgabe Dateien
//Teil_2			Reader und Writer (Abstrakte Klassen)
//					FileReader und FileWriter
//Wichtige Methoden:	read() und write()

public class B_TestReaderForCharStreamText {

	public static void main(String[] args) throws Exception {

		// Schritt 2:
		////////////////////////////////////////////////////////////////////////////
		// java.io deklariert Zwei Abstrkte Klassen
		// "Reader" und "Writer"
		// java.io deklariert: "FileReader" und "FileWriter" -Klassen
		// Diese Klassen werden fuer Ein- und Ausgabe von Textdateien verwendet
		// Also zur Behandlung von "CharcterStream"s!
		// Funktioniert wie die klassen von schritt 1 aber intern werden ByteCode in
		// Unicode
		// umgewandelt, da in java ein Zeichen: 2 Byte reserviert.
		// Auch diese klassen verwenden read() und write()-Mehoden zum Einlesen und
		// Ausgabe!
		// z.B.) dasselbe vorgang wie schritt 1 , aber fuer Zeichenketten in
		// "jdbc.properties"
		/////////////////////////////////////////////////////////////////////////////////////
		FileReader in = null;
		FileWriter out = null;

		String dateiNameInput = "." + File.separator + "jdbc.properties";
		String dateiNameOutput = "." + File.separator + "kopie_1.txt";

		try {
			in = new FileReader(dateiNameInput);
			out = new FileWriter(dateiNameOutput);

			int c;
			while ((c = in.read()) != -1) {
				out.write(c);
			}
		} finally {
			if (in != null) {
				in.close();
			}
			if (out != null) {
				out.close();
			}
		}

	}

}

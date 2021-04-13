package AWT_SWING_NIO.BankDateienUndStream.Test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

//Thema: 				Stream und Ein/Ausgabe Dateien
//Teil_4				BufferedReader und BufferedWriter (Abstrakte Klassen)
//						FileReader und FileWriter
//Wichtige Methoden:	readLine() ==> Zeilenweise lesen
//						und write()

public class D_TestBufferedReader_ZeilenStringStreamText {

	public static void main(String[] args) throws Exception {

		// Schritt 4:
		///////////////////////////////////////////////////////////////////////////
		// BufferedReader und BufferedWriter , methode readline()
		// Verwendung der Mothode: (siehe readLine() ==> Zeilenweise lesen)
		// dann muessen wir "String str;" definieren
		BufferedReader in = null;
		BufferedWriter out = null;

		String dateiNameInput = "." + File.separator + "jdbc.properties";
		String dateiNameOutput = "." + File.separator + "kopie_3.txt";

		try {
			in = new BufferedReader(new FileReader(dateiNameInput));
			out = new BufferedWriter(new FileWriter(dateiNameOutput));

			String str;
			while ((str = in.readLine()) != null) {
				out.write(str + "\n");
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

package BankDateienUndStream.Test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

//Thema: 			Stream und Ein/Ausgabe Dateien
//Teil_3			BufferedReader und BufferedWriter (Abstrakte Klassen)
//					FileReader und FileWriter
//Wichtige Methoden:	read() und write()

public class C_TestBufferedReader_CharStreamText {

	public static void main(String[] args) throws Exception {

		// Schritt 3:
		//////////////////////////////////////////////////////////////////////
		// Hier zeige ich die effizientere weg dasselbe zu geschtalten wie in Schritt 2
		// mit der Hilfe von Klassen:
		// " BufferedReader und BufferedWrite"
		// funktioniert genau so wie schritt 2 aber wesentlich schneller
		//////////////////////////////////////////////////////////////////////////////
		BufferedReader in = null;
		BufferedWriter out = null;

		String dateiNameInput = "." + File.separator + "jdbc.properties";
		String dateiNameOutput = "." + File.separator + "kopie_2.txt";

		try {
			in = new BufferedReader(new FileReader(dateiNameInput));
			out = new BufferedWriter(new FileWriter(dateiNameOutput));

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

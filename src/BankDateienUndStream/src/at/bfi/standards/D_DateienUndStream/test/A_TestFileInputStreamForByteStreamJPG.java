package BankDateienUndStream.src.at.bfi.standards.D_DateienUndStream.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

//Thema: 			Stream und Ein/Ausgabe Dateien
//Teil_1			InputStream und OutputStream (Abstrakte Klassen)
//					FileInputStream und FileOutputStream (Implementation)
//Wichtige Methoden:	read() und write()

public abstract class A_TestFileInputStreamForByteStreamJPG {

	public static void main(String[] args) throws Exception {

		///////////////////////////////////////////////////////////////
		// schritt 1
		///////////////////////////////////////////////////////////////////
		// Java.io -package : delariert "InputStream und OutputStream"
		// als "Abstrakte Klassen"
		// "FileInputStream und FileOutputStream" sind zwei Unterklassen
		// , die die nicht instanzierbare "InputStream und OutputStream"
		// implementieren und spezialisieren!
		// Verwendung von FileInputStream:
		// Damit erhalten wir oder lesen wir ein Dateistrom oder Dateistream
		// aus einem Datei.
		// eine Methode in dieser klasse heisst "read()" zum lesen aus einer Datei
		// die Abdrakte InputStream -Klasse betrachtet jede Datei als eine
		// folge von Bytes
		// Verwendung von FileOutputStream:
		// Diese klasse ist zum hinaussendung des Streams zustaendig.
		// wobei die einzelnen Bytes werden in einer Datei geschrieben
		// das geschieht mit hilfe der methode : "write()"
		// Beispiel: copy von einer .png (oder jpg)- Datei in anderen Datei:
		//////////////////////////////////////////////////////////////////
		FileInputStream in = null;
		FileOutputStream out = null;

		String dateiNameInput = "." + File.separator + "ic_launcher.png";
		String dateiNameOutput = "." + File.separator + "ic_launcher_kopie.png";

		try {
			in = new FileInputStream(dateiNameInput);
			out = new FileOutputStream(dateiNameOutput);

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

package BankCollection.src.at.bfi.standards.B_CollectionMapProperties.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

//properties.load(new FileInputStream("C:\\Eclipse_Workspace\\B_StandardLibraries"
//	+ "\\src\\com\\standards\\B_CollectionMapProperties\\jdbc.properties"));

public class TestBank_D_Properties {

	public static void main(String[] args) {

		Properties properties = new Properties();

		// File.separator : Das ist eine Konstante , die in der Klasse File deklariert
		// ist
		// Vorteil : separator ist plattformunabhaengig, funktioniert mit alle
		// Betreibsystemen
		// Oben: Hier arbeiten wir mit "absolut path"
		// Unten: Hier arbeiten wir mit "Relative Path"
		// Vorteil Relative Path gegenueber Absolute:
		// Speicherort unabhaengig vom absoluten Pfad des Projekts
		// identisch mit dem Speicherort des Projekts ist.
		String dateiname = "." + File.separator + "jdbc.properties";
		// dabei unsere properties file liegt im gleichen Ordner , in dem auch
		// unser Projekt gespeichert ist.

		try {
			properties.load(new FileInputStream(dateiname));
		} catch (FileNotFoundException e) {

			System.out.println(e.getMessage());
		} catch (IOException i) {

			System.out.println(i.getMessage());

		}

		System.out.println("Username: " + properties.getProperty("username"));
		System.out.println("Password: " + properties.getProperty("password"));
	}
}

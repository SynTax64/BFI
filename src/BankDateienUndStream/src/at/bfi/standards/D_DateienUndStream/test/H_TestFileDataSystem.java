package BankDateienUndStream.src.at.bfi.standards.D_DateienUndStream.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class H_TestFileDataSystem {

	// Package Java.nio.file
	// Thema Files und Datensystemen
	// Files -Klasse

	public static void main(String[] args) throws IOException {

		Path source = Paths.get("C:", "Phad", "zur", "quelldatei", "jdbc.properties");
		Path out = Paths.get("C:", "Phad", "zur", "zieldatei", "jdbc.properties");

		// Datei kopieren
		// Files.copy(source, out); //and then add throws IOException

		// Datei kopieren, Ziel ueberschreiben
		// Files.copy(source, out, StandardCopyOption.REPLACE_EXISTING);

		// Datei verschieben
		// Files.move(source,out);//error file allready exist

		// Verzeichnis und unterverzeichnisse erstellen
		Files.createDirectories(Paths.get("C:", "verzeichnis", "und", "unterverzeichnis"));

		// Eine Text Datei oefnnen und lesen
		Path textDatei = Paths.get("C:", "Phad", "zur", "quelldatei", "jdbc.properties");
		// charset fuer Zeichensatz -art
		BufferedReader reader = Files.newBufferedReader(textDatei, Charset.forName("UTF-8"));
		String zeile = reader.readLine();// eine Zeile lesen

		System.out.println(zeile);

		reader.close();

		// Eine Text Datei oefnnen und schreiben
		Path textDatei_neu = Paths.get("C:", "Phad", "zur", "zieldatei", "jdbc.properties");
		BufferedWriter writer = Files.newBufferedWriter(textDatei_neu, Charset.forName("UTF-8"));
		writer.newLine();
		writer.write("neu_user:Helmut");
		writer.close();

		// Siehe und probiere mit die methoden:

		// Files.readAllLines(path, cs); --> man bekommt daraus eine Liste von String

	}

}

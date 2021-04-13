package BankDateienUndStream.Test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class F_TestObjektPathCreate {

	// Package Java.nio.file
	// Thema Path und Paths -Interface
	// Paths ist als Final deklariert, besitzt nur Statische Methoden
	// Wandelt ein String oder URI in "Path"
	// Path representiert nur einen Verzeichnis.
	// Path ist ein Interface

	public static void main(String[] args) {

		// Navigiere innerhalb ein vorhandenes Verzeichnis
		String userHome = System.getProperty("user.home");

		System.out.println("userHome -Attr von System: " + userHome);

		System.out.println("HomeDirectory: " + Paths.get(userHome));

		Path homeDirectory = Paths.get(userHome);

		Path abc = homeDirectory.resolve("Abc");
		System.out.println("abc: " + abc.toString());

		Path def = homeDirectory.resolve(Paths.get("Abc", "Def"));
		System.out.println("def: " + def.toString());

		Path jkl = homeDirectory.resolve(Paths.get("Abc", "Def", "Ghi", "Jkl"));

		System.out.println("jkl: " + jkl.toString());

		Path jdbc = homeDirectory.resolve(Paths.get("Abc", "Def", "Ghi", "Jkl", "jdbc.properties"));

		System.out.println("jdbc Path: " + jdbc.toString());

	}

}

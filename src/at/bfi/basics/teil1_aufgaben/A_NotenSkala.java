package at.bfi.basics.teil1_aufgaben;

import java.util.Scanner;

public class A_NotenSkala {

	/**
	 * <b>A_NotenSkala</b>
	 * 
	 * Erstelle eine Klasse Notenskala die von 0-100 Prozent reicht und in 5
	 * Abstufungen, folgende Ausgabe ausgibt: Nicht Genügend, Genügend, Gut, Sehr
	 * Gut, Ausgezeichnet, soll in 5 Stufen Benotungen ausgegeben werden. Die Klasse
	 * muss wieder im Package com.bfi.basics liegen. IF -Anweisung verwenden
	 * 
	 */

	public static int zahlLesen() {
		Scanner eingabe = new Scanner(System.in);
		boolean isZahl = false;
		String strNote = null;
		int note = 0;
		while (!isZahl) {
			try {
				System.out.print("Bitte geben Sie eine Zahl während 0 - 100 ein: ");
				strNote = eingabe.nextLine();
				note = Integer.parseInt(strNote);
				if (note >= 0 && note <= 100) {
					isZahl = true;
				} else {
					System.out.println("Sie müssen einen Wert von 0 bis 100 eingeben");
				}
			} catch (Exception e) {
				System.out.println("Der eingegebene Wert ist nicht Zahl");

			}
		}
		return note;
	}

	private static void noteBewerten(int note) {
		String bewertung = null;

		if (note >= 0 && note <= 50) {
			bewertung = "Nicht Genügend";
		} else if (note > 50 && note <= 60) {
			bewertung = "Genügend";
		} else if (note > 60 && note <= 70) {
			bewertung = "Gut";
		} else if (note > 70 && note <= 90) {
			bewertung = "Sehr Gut";
		} else if (note > 90 && note <= 100) {
			bewertung = "Ausgezeichnet";
		}

		System.out.println(bewertung);
	}

	public static void main(String[] args) {
		int note = zahlLesen();
		noteBewerten(note);
	}

}

package at.bfi.basics.teil1_aufgaben;

import java.util.Scanner;

public class D_AnzahlTagenImMonat {

	/**
	 * 
	 * <b>AnzahlTageInMonat</b> Erstelle ein Programm, das die Anzahl der Tage eines
	 * Monats ausgibt. Beispiel: Eingabe = “November” Ausgabe : November hat 30
	 * Tage! Switch Case verwenden.
	 * 
	 */

	public static boolean isLeapYear(int year) {
		int jahr = year;

		return ((jahr % 4 == 0) && (jahr % 100 != 0)) || (jahr % 400 == 0);
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Geben Sie bitte einen Monat ein: ");
		String monat = input.nextLine();
		System.out.print("Geben Sie bitte eine Jahreszahl ein: ");
		int jahresZahl = input.nextInt();

		int tage = 0;
		String output = "%s hat %d Tage!";

		switch (monat) {
		case "Januar":
		case "März":
		case "Mai":
		case "Juli":
		case "August":
		case "Oktober":
		case "Dezember":
			tage = 31;
			break;
		case "Februar":
			if (isLeapYear(jahresZahl)) {
				tage = 29;
			} else {
				tage = 28;
			}
			break;
		case "April":
		case "Juni":
		case "September":
		case "November":
			tage = 30;
			break;
		default:
			output = "Ein unbekannter Monat wurde eingegeben ";
		}

		System.out.printf(output, monat, tage);
	}
}

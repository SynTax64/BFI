package at.bfi.basics.teil1_aufgaben;

import java.util.Scanner;

public class E_SterneNachZeilenAnzahl {

	/**
	 * <b>SterneNachZeilenAnzahl</b>
	 * 
	 * Die Darstellung der Sterne soll so aussehen: (für 1.Zeile ein Stern *
	 * ausgeben!) (fuer zweite zeile 2 Sterne. usw.)
	 */////////////////////////////////////////
	/*
	 * * ** *** **** *****
	 */
	///////////////////////////////////////////
	/*
	 * ..maximal 10 Sterne ....(also in 10.Zeile ... 10 Sterne ausgeben!)
	 * Darstellung von * -Zeichen nach Zeilenanzahl For -Schleife verwenden
	 * 
	 */
	public static void outputSterne(int zahl) {
		for (int i = 1; i <= zahl; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.print(" ");
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Geben Sie bitte eine Zahl der Sternen: ");
		int zahl = input.nextInt();
		outputSterne(zahl);
	}
}
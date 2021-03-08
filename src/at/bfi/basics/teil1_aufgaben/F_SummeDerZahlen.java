package at.bfi.basics.teil1_aufgaben;

import java.util.Scanner;

public class F_SummeDerZahlen {

	/**
	 * 
	 * <b>SummeDerZahlen</b>
	 * 
	 * Die Summe der Zahlen von 1 bis n soll berechnet werden.
	 *
	 * For oder While -Anweisung verwenden.
	 */
	public static int summe(int limit) {
		int summe = 0;
		for (int i = 1; i <= limit; i++) {
			summe += i;

			System.out.print(i + ((i != limit) ? " + " : " = "));
		}
		return summe;
	}

	public static void main(String[] args) {
		Scanner eingabe = new Scanner(System.in);
		System.out.print("Geben Sie bitte ein, wie viele Zahlen miteinander addieren möchten: ");
		int num = eingabe.nextInt();
		System.out.println(summe(num));
	}
}
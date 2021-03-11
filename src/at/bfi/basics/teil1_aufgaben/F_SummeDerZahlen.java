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
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = ZahlenAddition(scanner);
		System.out.println(summe(num));
	}

	public static int ZahlenAddition(Scanner scanner) {
		System.out.print("Geben Sie bitte ein, wie viele Zahlen miteinander addieren möchten: ");
		int num = Integer.parseInt(scanner.nextLine());
		return num;
	}

	public static int summe(int limit) {
		int summe = 0;
		for (int i = 1; i <= limit; i++) {
			summe += i;

			System.out.print(i + ((i != limit) ? " + " : " = "));
		}
		return summe;
	}

}
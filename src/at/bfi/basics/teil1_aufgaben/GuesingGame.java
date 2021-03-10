package at.bfi.basics.teil1_aufgaben;

import java.util.Random;
import java.util.Scanner;

public class GuesingGame {

	public static void main(String[] args) {
		boolean beenden = false;
		Random random = new Random();
		Scanner input = new Scanner(System.in);
		int counter;
		while (!beenden) {
			int zufallsZahl = random.nextInt(100) + 1;

			counter = 0;
			System.out.print("Verraten Sie bitte eine Zahl: ");

			while (true) {

				int verrateteZahl = Integer.parseInt(input.nextLine());
				counter++;
				if (verrateteZahl > zufallsZahl) {
					System.out.printf("Die Zahl %d ist zu groß\n", verrateteZahl);
				} else if (verrateteZahl < zufallsZahl) {
					System.out.printf("Die Zahl %d ist zu klein\n", verrateteZahl);
				} else if (verrateteZahl == zufallsZahl) {
					System.out.printf("Die Zahl %d ist richtig\n", verrateteZahl);
					System.out.printf("Sie haben eine Zahl %d Mal verratet\n", counter);
					break;
				}
				System.out.print("Verraten Sie eine Zahl nochmal: ");
			}
			System.out.print("Wollen Sie nochmal spielen (ja/nein) :");
			String nochmal = input.nextLine();
			if (nochmal.equals("ja")) {
				beenden = false;
			} else if (nochmal.equals("nein")) {
				beenden = true;
			}
		}
	}

}

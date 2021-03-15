package at.bfi.basics.teil1_aufgaben;

import java.util.Random;
import java.util.Scanner;

public class GuesingGame {

	public static void guessingNumber(Scanner input, Random rnd) {
		int counter;
		boolean beenden = false;
		while (!beenden) {

			int zufallsZahl = rnd.nextInt(100) + 1;
			counter = 0;
			System.out.print("Verraten Sie bitte eine Zahl: ");
			while (true) {
				try {
					int verrateteZahl = Integer.parseInt(input.nextLine());
					counter++;
					if (verrateteZahl > zufallsZahl) {
						System.out.printf("Die Zahl %d ist zu groß\n", verrateteZahl);
					} else if (verrateteZahl < zufallsZahl) {
						System.out.printf("Die Zahl %d ist zu klein\n", verrateteZahl);
					} else if (verrateteZahl == zufallsZahl) {
						System.out.printf("Die Zahl %d ist richtig\n", verrateteZahl);
						System.out.printf("Sie haben die Zahl %d Mal geraten\n", counter);
						break;
					}
				} catch (NumberFormatException e) {
					System.out.println("Sie müssen einen alphanumerischen Wert eingeben!");
				}
				System.out.print("Verraten Sie eine Zahl nochmal: ");
			}
			do {
				System.out.print("Wollen Sie nochmal spielen (ja/nein) :");
				String nochmal = input.nextLine();
				if (nochmal.equals("ja")) {
					break;
				} else if (nochmal.equals("nein")) {
					beenden = true;
				} else {
					System.out.println("Sie müssen \"ja\" oder \"nein\" eingeben!");
					beenden = false;
				}
			} while (!beenden);
		}
		input.close();
	}

	public static void main(String[] args) {
		Random random = new Random();
		Scanner input = new Scanner(System.in);
		guessingNumber(input, random);
	}

}

package at.bfi.basics.teil1_aufgaben;

import java.util.Random;

public class randomNumber {
	public static void main(String[] args) {
		Random rnd = new Random();
		for (int i = 1; i < 1000; i++) {
			int zufallsZahl = (rnd.nextInt(100) + 1);
			System.out.printf("%3d ", zufallsZahl);
			if (i % 10 == 0) {
				System.out.println();
				if (i % 100 == 0) {
					System.out.println();
				}
			}
		}
	}
}

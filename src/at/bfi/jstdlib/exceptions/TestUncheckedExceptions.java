package at.bfi.jstdlib.exceptions;

import java.util.Scanner;

public class TestUncheckedExceptions {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// Schritt 1: Exception erkennen
		System.out.print("Bitte geben Sie eine erste Zahl ein: ");
		int a = scanner.nextInt();
		System.out.print("Bitte geben Sie eine zweite Zahl ein: ");
		int b = scanner.nextInt();
		int ergebniss = 0;
		try {
			// Schritt 2: Exception auffangen
			ergebniss = a / b;
		} catch (ArithmeticException e) {
			System.err.println(e.getMessage());
//			System.out.println("Etwas wurde schief gegangen");
		}
		System.out.println("Ergebniss ist: " + ergebniss);
	}
}

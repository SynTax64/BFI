package at.bfi.jstdlib.exceptions;

import java.util.Scanner;

public class TestEingabe {
	public static void main(String[] args) {
//		eingabeScanner_Problem_1();
		eingabeScanner_Problem_2();
//		eingabeScanner_Problem_3();
//		eingabeScanner_Problem_4();
	}

	private static void eingabeScanner_Problem_4() {
		// TODO Auto-generated method stub

	}

	private static void eingabeScanner_Problem_3() {
		// TODO Auto-generated method stub

	}

	private static void eingabeScanner_Problem_2() {
		Scanner scanner = new Scanner(System.in);
		String eingabe = null;

		double zahl_1 = 0;
		double zahl_2 = 0;

		try {
			System.out.print("Bitte geben Sie Zahl_1 ein: ");
			eingabe = scanner.nextLine();
			zahl_1 = Double.parseDouble(eingabe);

			System.out.print("Bitte geben Sie Zahl_2 ein: ");
			eingabe = scanner.nextLine();
			zahl_2 = Double.parseDouble(eingabe);
		} catch (NumberFormatException e) {
			System.out.println("NumberFormatException wurde ausgelöst");
		}

		System.out.println("zahl_1: " + zahl_1);
		System.out.println("zahl_1: " + zahl_2);
		System.out.println("Summe: " + (zahl_1 + zahl_2));

		scanner.close();

	}

	private static void eingabeScanner_Problem_1() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Bitte geben Sie Zahl_1 ein: ");

		double d = scanner.nextDouble();
		System.out.println("d: " + d);
		scanner.close();
	}

}

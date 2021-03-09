package at.bfi.basics.teil1_aufgaben;

import java.util.Random;
import java.util.Scanner;

public class searching {

	public static boolean isNumberIn(int[] array, int searchNumber) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == searchNumber) {
				return true;
			}
		}
		return false;
	}

	public static int searchingNumber(int[] array, int searchNumber) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == searchNumber) {
				return i;
			}
		}
		return -1;
	}

	public static int searchingName(String[] stringArray, String searchName) {
		for (int i = 0; i < stringArray.length; i++) {
			if (stringArray[i].equals(searchName)) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		Random rnd = new Random();
		Scanner input = new Scanner(System.in);

		int[] intArray = new int[rnd.nextInt(100)];

		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = rnd.nextInt(1000);
		}

		System.out.println("Bitte geben sie eine Zahl ein: ");
		int zahl = Integer.parseInt(input.nextLine());

		for (int i = 0; i < intArray.length; i++) {
			System.out.print(intArray[i] + " ");
		}
	}
}

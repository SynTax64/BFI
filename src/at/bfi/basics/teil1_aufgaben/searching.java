package at.bfi.basics.teil1_aufgaben;

import java.util.Arrays;
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

	public static int[] tauscheElemente(int[] array) {
//		int[] neuArray = new int[array.length];
		for (int i = 0; i < array.length / 2; i++) {
			int tmp = array[array.length - 1 - i];
			array[array.length - 1 - i] = array[i];
			array[i] = tmp;
		}

		return array;
	}

	public static int[] cloneMe(int[] array) {
		int[] cloneArray = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			cloneArray[i] = array[i];
		}
		return cloneArray;
	}

	public static void main(String[] args) {
		Random rnd = new Random();
		Scanner input = new Scanner(System.in);

		int[] intArray = new int[10];
//		int[] cloneArray = intArray.clone();
		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = rnd.nextInt(10);
		}

		for (int i = 0; i < intArray.length; i++) {
			System.out.print(intArray[i] + " ");
		}
		System.out.println();
		System.out.println(Arrays.toString(intArray));
		tauscheElemente(intArray);

		for (int i = 0; i < intArray.length; i++) {
			System.out.print(intArray[i] + " ");
		}

		System.out.println();

		System.out.println(Arrays.toString(intArray));
	}
}

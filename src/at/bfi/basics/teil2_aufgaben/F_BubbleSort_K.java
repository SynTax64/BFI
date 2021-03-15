package at.bfi.basics.teil2_aufgaben;

import java.util.Random;

public class F_BubbleSort_K {

	public static void main(String[] args) {
		int[] array = fillArray(10);
		printArray("Unsorted array: ", array);

		bubbleSort(array);
		printArray("Sorted array: ", array);
	}

	public static int[] fillArray(int sizeOfArray) {
		int[] newArray = new int[sizeOfArray];
		Random rnd = new Random();

		for (int i = 0; i < newArray.length; i++) {
			newArray[i] = rnd.nextInt(100);
		}
		return newArray;
	}

	public static void printArray(String leadingText, int[] array) {

		System.out.print(leadingText + " [");
		for (int i = 0; i < array.length; i++) {
			System.out.print((i == array.length - 1) ? array[i] : array[i] + ", ");
		}
		System.out.print("]\n");
	}

	public static int[] bubbleSort(int[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length - 1; j++) {
				if (array[j] > array[j + 1]) {
					int tmp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = tmp;
				}
			}
		}
		return array;
	}
}

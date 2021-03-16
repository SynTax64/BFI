package at.bfi.basics.multidimensionalArray;

import java.util.Scanner;

public class ZweiDimensionalArray {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Bitte geben Sie die Zahl der Zeilen (statische Array): ");
		int rows = Integer.parseInt(input.nextLine());
		System.out.print("Bitte geben Sie die Zahl der Spalten (statische Array): ");
		int cells = Integer.parseInt(input.nextLine());

		int[][] mdArray = new int[rows][cells];

		System.out.println("i j array");
		for (int i = 0; i < mdArray.length; i++) {
			for (int j = 0; j < mdArray[i].length; j++) {
				mdArray[i][j] = i + j;
				System.out.print(i + " " + j + " " + (i + j) + "\n");
			}
		}
		System.out.println();
		for (int[] intArray : mdArray) {
			for (int element : intArray) {
				System.out.print(element + " ");
			}
			System.out.print("\n");
		}

		System.out.print("Bitte geben Sie die Zahl der Zeilen(dinamische Array): ");
		rows = Integer.parseInt(input.next());
		int[][] dinamische2dArray = new int[rows][];
		int elementenSubArray;
		for (int i = 0; i < dinamische2dArray.length; i++) {
			System.out.printf("Bitte geben Sie die Zahl der Elementen in subArray [%d] (dinamische Array): ", i);
			elementenSubArray = Integer.parseInt(input.nextLine());
			dinamische2dArray[i] = new int[elementenSubArray];
			for (int k = 0; k < dinamische2dArray[i].length; k++) {
				dinamische2dArray[i][k] = i + k;
			}
		}
	}
}

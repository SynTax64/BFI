package at.bfi.basics.teil2_aufgaben;

import java.util.Random;

public class C_ArrayFuellenGeradenZahlen {

	public static void main(String[] args) {
		int[] array = fillArray(30);
		ausgabeArray(array);

	}

	public static int[] fillArray(int sizeOfArray) {
		int[] intArray = new int[sizeOfArray];
		Random rnd = new Random();
		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = rnd.nextInt(100);
		}
		return intArray;
	}

	public static void ausgabeArray(int[] array) {
		System.out.print("[");
		int cnt = 0;
		for (int i : array) {
			cnt++;
			if (cnt == array.length) {
				System.out.print(i);
			} else {
				System.out.print(i + ", ");
			}
		}
		System.out.print("]");
	}
}

package at.bfi.basics.teil2_aufgaben;

public class D_ArrayKopieren_M {
	public static void main(String[] args) {

		int[] myIntArray = { 13, 9, 6, 23, 28, 2, 21, 1, 16, 5 };
		int[] myNewArray = copyMe(myIntArray);

		System.out.println("inhalt von origial -Array");
		System.out.println("**************************");

		printArray(myIntArray);

		System.out.println("\ninhalt von kopierte -Array");
		System.out.println("**************************");

		printArray(myNewArray);

	}

	private static void printArray(int[] array) {

		System.out.print("[");
		for (int i = 0; i < array.length; i++) {
			if (i == array.length - 1) {
				System.out.print(array[i]);
			} else {
				System.out.print(array[i] + ", ");
			}
		}
		System.out.print("]");
	}

	public static int[] copyMe(int[] originalArray) {

		int[] newArray = new int[originalArray.length];
		for (int i = 0; i < originalArray.length; i++) {
			newArray[i] = originalArray[i];
		}
		return newArray;
	}
}

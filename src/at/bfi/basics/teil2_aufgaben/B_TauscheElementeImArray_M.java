package at.bfi.basics.teil2_aufgaben;

public class B_TauscheElementeImArray_M {
	public static void main(String[] args) {

		int[] myIntArray = { 13, 9, 6, 23, 28, 2, 21, 1, 16, 5 };
		printMyIntArray("Original", myIntArray);

		replaceUsImIntArray(1, myIntArray.length - 2, myIntArray);
		printMyIntArray("Getauscht", myIntArray);

		String[] myStringArray = { "Mrio", "Edi", "Maria", "Leon", "Sabine", "Irena", "Anton", "Michaela", "Leila" };
		printMyStringArray("Original", myStringArray);

		replaceUsImStringArray(1, myStringArray.length - 2, myStringArray);
		printMyStringArray("Getauscht", myStringArray);

	}

	public static void replaceUsImIntArray(int ind_1, int ind_2, int[] myIntArray) {
		int tmp = myIntArray[ind_1];
		myIntArray[ind_1] = myIntArray[ind_2];
		myIntArray[ind_2] = tmp;
	}

	public static void replaceUsImStringArray(int ind_1, int ind_2, String[] myStringArray) {
		String tmp = myStringArray[ind_1];
		myStringArray[ind_1] = myStringArray[ind_2];
		myStringArray[ind_2] = tmp;
	}

	public static void printMyIntArray(String leadingText, int[] myIntArray) {
		System.out.print(leadingText + " [");
		for (int i = 0; i < myIntArray.length; i++) {
			if (i == myIntArray.length - 1) {
				System.out.print(myIntArray[i] + "");
			} else {
				System.out.print(myIntArray[i] + ", ");
			}
		}
		System.out.print("]\n");
	}

	public static void printMyStringArray(String leadingText, String[] myStringArray) {
		System.out.print(leadingText + " [");
		for (int i = 0; i < myStringArray.length; i++) {
			if (i == myStringArray.length - 1) {
				System.out.print(myStringArray[i] + "");
			} else {
				System.out.print(myStringArray[i] + ", ");
			}
		}
		System.out.print("]\n");
	}
}

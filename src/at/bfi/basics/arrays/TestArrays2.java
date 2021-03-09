package at.bfi.basics.arrays;

public class TestArrays2 {
	public static void main(String[] args) {

		float[] floatArray = new float[] { 2.3f, 3.4f, 6.7f, 7.8f, 10.7f };
		double[] doubleArray = { 3.4, 3.2, 5.9, 9.5, 8.6 };

		// TODO Ausgabe von doubleArray mit for -Schleife
		for (int i = 0; i < doubleArray.length; i++) {
			System.out.println(doubleArray[i]);
		}
		System.out.println();
		// TODO Ausgabe von floatArray mit foreach
		for (float element : floatArray) {
			System.out.println(element);
		}
		System.out.println();

		// Das ist der Array vom String
		String[] stringArray1 = new String[] { "Hello", "aus", "Java", "Programmierung", "Sprache" };
		for (String element : stringArray1) {
			System.out.println(element);
		}
		System.out.println();

		String[] stringArray2 = new String[5];
		stringArray2[0] = "Hello";
		stringArray2[1] = "aus";
		stringArray2[2] = "Java";
		stringArray2[3] = "Programmierung";
		stringArray2[4] = "Sprache";

		for (String element : stringArray2) {
			System.out.println(element);
		}
	}
}

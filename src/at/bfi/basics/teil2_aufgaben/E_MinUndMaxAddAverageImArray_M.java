package at.bfi.basics.teil2_aufgaben;

public class E_MinUndMaxAddAverageImArray_M {

	public static void main(String[] args) {
		int[] myArray = { 4, 7, 4, 6, 9, 12, 43, 76, 98, 23, 65, 34, 65, 34, 65, 87, 34, 65 };
		ausgabe(add(myArray));
		ausgabe(min(myArray));
		ausgabe(max(myArray));
		ausgabe(average(myArray));
	}

	public static void ausgabe(double ergebniss) {
		System.out.printf("%.2f\n", ergebniss);
	}

	public static double add(int[] array) {
		double summe = 0.;
		for (int i = 0; i < array.length; i++) {
			summe += array[i];
		}
		return summe;
	}

	public static double min(int[] array) {
		int min = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
			}
		}
		return min;
	}

	public static double max(int[] array) {
		int max = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		return max;
	}

	public static double average(int[] array) {
		int numberOfElements = array.length;
		double summe = 0;
		for (int i = 0; i < array.length; i++) {
			summe += array[i];
		}
		return summe / numberOfElements;
	}
}

package at.bfi.oop.standardklasse;

import java.text.Collator;
import java.util.Arrays;
import java.util.Locale;

public class Test_Arrays {
	public static void main(String[] args) {
		String[] strArray = { "Stefan", "David", "Über", "Nika", "Hermut", "nika", "david", "stefan" };

		int j = Arrays.binarySearch(strArray, "Nika");
		System.out.println(j);

		Arrays.sort(strArray);
		System.out.println(Arrays.toString(strArray));

		Arrays.sort(strArray, Collator.getInstance(new Locale("de", "DE")));
		System.out.println(Arrays.toString(strArray));
	}
}

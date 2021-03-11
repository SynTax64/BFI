package at.bfi.jstdlib.exceptions;

import java.util.Arrays;
import java.util.Random;

public class TestCheckedExceptions {
	public static void main(String[] args) {
		Random rnd = new Random();
//		Scanner scanner = new Scanner(System.in);
		double[] doubleArray = new double[5];

		for (int i = 0; i < doubleArray.length; i++) {
//			doubleArray[i] = Double.parseDouble(scanner.nextLine());
			doubleArray[i] = (i + 1) * rnd.nextInt(10);
//			System.out.print(doubleArray[i] + " ");
		}

		System.out.println(Arrays.toString(doubleArray));

		try {
			doubleArray[doubleArray.length] = 150;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
			e.getStackTrace();
		}
	}
}

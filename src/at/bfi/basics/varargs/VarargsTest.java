package at.bfi.basics.varargs;

import java.util.Arrays;

public class VarargsTest {

	public static int add(int... numbers) {
		System.out.print("Number of Arrays " + numbers.length + " sum of arguments: ");
		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}
		return sum;
	}

	public static void main(String[] args) {
		System.out.println(add(100));
		System.out.println(add(1, 2, 3, 4));
		System.out.println(add(4, 6, 3, 7, 3, 6, 4, 6, 9));
		System.out.println(add());

		func_2("Servus", 100, 200);
		func_2("Hi", 2, 3, 4, 5, 6, 7);
		func_2("Hallo");

		String someString = "puki+M4uki,Lu6ki,Vuk8i";
		String[] getrenntString = someString.split("[,+0-9]");
		System.out.println(Arrays.toString(getrenntString));
	}

	private static void func_2(String string, int... numbers) {
		System.out.print(string + " ");
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
		System.out.println();
	}
}

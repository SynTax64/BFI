package at.bfi.basics.teil1_aufgaben;

import java.util.Scanner;

public class C_FibonacciWhile {
	/**
	 * 
	 * <b>Fibonacci</b>
	 * 
	 * -Folge mit einer While-Schleife. Erstelle eine Fibonacci-Folge mittels einer
	 * While-Schleife. Der Durchlauf der While-Schleife sollte frei wählbar sein.
	 * Die Klasse muss wieder im Package com.bfi.basics liegen.
	 * https://de.wikipedia.org/wiki/Fibonacci-Folge For -Anweisung verwenden.
	 *
	 * 
	 */

	public static void fibonnaci(int limit) {
		int num1 = 0;
		int num2 = 1;
		int ergebniss = 0;
		int counter = 0;

		while (counter < limit) {
			System.out.print(num1 + " ");
			ergebniss = num2 + num1;
			num1 = num2;
			num2 = ergebniss;
			counter++;
		}

	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Geben Sie bitte ein, wie viele Fibonnaci Zahlen ausgeben werden: ");
		int counter = input.nextInt();
		fibonnaci(counter);
	}

}

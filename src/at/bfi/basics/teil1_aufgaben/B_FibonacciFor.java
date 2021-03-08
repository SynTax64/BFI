package at.bfi.basics.teil1_aufgaben;

import java.util.Scanner;

public class B_FibonacciFor {

	/**
	 * 
	 * <b>Fibonacci</b>
	 * 
	 * -Folge mit einer For-Schleife. Erstelle eine Fibonacci-Folge mittels einer
	 * For-Schleife. Der Durchlauf der For-Schleife sollte frei wählbar sein. Die
	 * Klasse muss wieder im Package com.bfi.basics liegen.
	 * https://de.wikipedia.org/wiki/Fibonacci-Folge For -Anweisung verwenden.
	 *
	 * 
	 */
	public static void fibonnaci(int limit) {
		int num1 = 0;
		int num2 = 1;
		int ergebniss = 0;

		for (int i = 0; i < limit; i++) {
			System.out.print(num1 + " ");
			ergebniss = num2 + num1;
			num1 = num2;
			num2 = ergebniss;
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Geben Sie bitte ein, wie viele Fibonnaci Zahlen ausgeben werden: ");
		int counter = input.nextInt();
		fibonnaci(counter);
	}
}

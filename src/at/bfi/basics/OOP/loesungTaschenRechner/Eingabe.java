package at.bfi.basics.OOP.loesungTaschenRechner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Eingabe {

	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		double firstNumber = 0.0;
		double secoundNumber = 0.0;
		Operation operator = null;
		double result = 0.0;
		do {
			firstNumber = getNumberForCalc(reader);
			secoundNumber = getNumberForCalc(reader);
			operator = getOperatorForCalc(reader);
			result = resultBerechnen(firstNumber, secoundNumber, operator);

			if ((operator == Operation.DIVIDE) & (secoundNumber == 0))
				System.out.println("Division durch 0 ist nicht deffiniert!");
			else
				System.out.println(firstNumber + "  " + operator.name() + "  " + secoundNumber + " = " + result);

			if (isTryingNextCalc(reader) == false) {
				break;
			}

		} while (true);

		if (reader != null) {
			try {
				System.out.println("Reader is closed!");
				reader.close();
			} catch (IOException e) {

				e.printStackTrace();
				System.out.println("IOException aufgetaucht! ...reader nicht geschlossen");
			}
		}
	}

	private static boolean isTryingNextCalc(BufferedReader reader) {

		boolean repeated = false;
		System.out.println("Do you want to do another calculation? (Y)es/(N)o");

		String userInput = "";

		try {
			userInput = reader.readLine();
		}

		catch (IOException e) {

			e.printStackTrace();
		}

		if (userInput.equalsIgnoreCase("y")) {
			repeated = true;
		}

		return repeated;

	}

	private static double resultBerechnen(double firstNumber, double secoundNumber, Operation operator) {
		double result = 0.;

		try {
			result = operator.calculate(firstNumber, secoundNumber);
		} catch (Exception e) {

			e.printStackTrace();
		}

		return result;
	}

	private static Operation getOperatorForCalc(BufferedReader reader) {
		boolean isValidEntry = true;
		Operation operator = null;
		String input = null;
		do {
			System.out.println("Please Enter an Operator: \t");
			try {
				input = reader.readLine();
			} catch (IOException e) {

				isValidEntry = false;
				// e.printStackTrace();
				System.out.println("IOException aufgetaucht!");
			}

			try {

				operator = checkOperator(input);
				isValidEntry = true;

			} catch (IllegalArgumentException e) {

				isValidEntry = false;
				System.out.println("IllegalArgumentException: \n " + "Operation ungueltig"
						+ "\n Richtige Operatoren sind: +, -, *, / ");

			}

		} while (isValidEntry == false);

		return operator;
	}

	private static Operation checkOperator(String input) throws IllegalArgumentException {

		Operation op;

		if (input.equalsIgnoreCase("+")) {

			op = Operation.ADD;
		} else if (input.equalsIgnoreCase("-")) {

			op = Operation.SUBSTRACT;
		} else if (input.equalsIgnoreCase("*")) {

			op = Operation.MULTIPLY;
		} else if (input.equalsIgnoreCase("/")) {

			op = Operation.DIVIDE;
		} else {

			throw new IllegalArgumentException("IllegalOperator");
		}

		return op;
	}

	private static double getNumberForCalc(BufferedReader reader) {

		double theNumber = 0.0;
		boolean isValidEntry = true;
		String input = null;

		do {
			System.out.println("Please enter a number:\t");

			try {
				input = reader.readLine();
				isValidEntry = true;

			} catch (IOException e) {

				isValidEntry = false;
				// e.printStackTrace();
				System.out.println("IOException aufgetaucht! ");
			}

			try {
				theNumber = Double.parseDouble(input);

			} catch (NumberFormatException e) {

				isValidEntry = false;
				// e.printStackTrace();

				System.out.println("NumberFormatException aufgetaucht! ");
			}

		} while (isValidEntry == false);

		return theNumber;
	}

}

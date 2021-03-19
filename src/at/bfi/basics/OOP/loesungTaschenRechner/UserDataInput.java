package at.bfi.basics.OOP.loesungTaschenRechner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserDataInput {

	private BufferedReader reader;

	public UserDataInput() {
		if (reader == null) {
			this.reader = new BufferedReader(new InputStreamReader(System.in));
		}
	}

	public void closeResources() {

		if (reader != null) {
			try {
				System.out.println("Reader is closed!");
				reader.close();
			} catch (IOException e) {

				// e.printStackTrace();
				System.out.println("IOException aufgetaucht! ...reader nicht geschlossen");
			}
		}

	}

	public boolean isTryingNextCalc() {

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

	public double resultBerechnen(double firstNumber, double secoundNumber, Operation operator) {
		double result = 0.;

		try {
			result = operator.calculate(firstNumber, secoundNumber);
		} catch (Exception e) {

			if (e instanceof ArithmeticException)
				System.out.println("ArithmeticException wurde Aufgetaucht");

			// e.printStackTrace();
		}

		return result;
	}

	public Operation getOperatorForCalc() {
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

	public Operation checkOperator(String input) throws IllegalArgumentException {

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

	public double getNumberForCalc() {

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
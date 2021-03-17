package at.bfi.basics.OOP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TaschenRechner {

	InputStreamReader in = new InputStreamReader(System.in);
	BufferedReader reader = new BufferedReader(in);

	private double operand1;
	private double operand2;
	private char operator;
	private final char[] gueltigeOperationen = { '+', '-', '*', '/', 'q' };

	public TaschenRechner() {
	}

	public TaschenRechner(double operand1, double operand2, char operator) {
		this.operand1 = operand1;
		this.operand2 = operand2;
		this.operator = operator;
	}

	public double getOperand1() {
		return operand1;
	}

	private void setOperand1(double operand1) {
		this.operand1 = operand1;
	}

	public double getOperand2() {
		return operand2;
	}

	private void setOperand2(double operand2) {
		this.operand2 = operand2;
	}

	public char getOperator() {
		return operator;
	}

	private void setOperator(char operator) {
		this.operator = operator;
	}

	public void ersteZahlEinlesen(BufferedReader input) {
		System.out.print("Geben Sie bitte die erste Zahl ein: ");
		while (true) {
			try {
				operand1 = Double.parseDouble(input.readLine());
				break;
			} catch (IOException e) {
				System.out.println("Sie müssen eine numerische Zahl eingeben!");
			}
			System.out.print("Geben Sie bitte die erste Zahl noch einmal ein: ");
		}
	}

	public void zweiteZahlEinlesen(BufferedReader input) {
		System.out.print("Geben Sie bitte die zweite Zahl ein: ");
		while (true) {
			try {
				operand2 = Double.parseDouble(input.readLine());
				break;
			} catch (IOException e) {
				System.out.println("Sie müssen eine numerische Zahl eingeben!");
			}
			System.out.print("Geben Sie bitte die zweite Zahl noch einmal ein: ");
		}
	}

	public void operatorEinlesen(BufferedReader input) {
		System.out.print("Geben Sie bitte eine gültige Operation ein:");
		try {
			operator = input.readLine().charAt(0);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public boolean operationUeberpruefen(char operation) {
		for (int i = 0; i < gueltigeOperationen.length; i++) {
			if (Character.toLowerCase(operation) == gueltigeOperationen[i]) {
				return true;
			}
		}
		return false;
	}

	public boolean berechnen() {
		if (operationUeberpruefen(operator)) {
			switch (operator) {
			case '+':
				System.out.printf("%2.f + %2.f = %2.f", operand1, operand2, addition(operand1, operand2));
				break;
			case '-':
				System.out.printf("%2.f - %2.f = %2.f", operand1, operand2, subtraktion(operand1, operand2));
				break;

			case '*':
				System.out.printf("%2.f * %2.f = %2.f", operand1, operand2, multiplikation(operand1, operand2));
				break;

			case '/':
				System.out.printf("%2.f / %2.f = %2.f", operand1, operand2, division(operand1, operand2));
				break;

			}
			return true;
		}
		System.out.println("Sie müssen einen gültigen Operator eingeben(+, -, *, /)!");
		return false;
	}

	public double addition(double o1, double o2) {
		return o1 + o2;
	}

	public double subtraktion(double o1, double o2) {
		return o1 - o2;
	}

	public double multiplikation(double o1, double o2) {
		return o1 * o2;
	}

	public double division(double o1, double o2) throws ArithmeticException {
		return o1 / o2;
	}
}

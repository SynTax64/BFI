package at.bfi.basics.OOP;

import java.util.Scanner;

public class TaschenRechner {

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

	public void ersteZahlEinlesen(Scanner input) {
		System.out.print("Geben Sie bitte die erste Zahl ein: ");
		operand1 = Double.parseDouble(input.nextLine());
	}

	public void zweiteZahlEinlesen(Scanner input) {
		System.out.print("Geben Sie bitte die zweite Zahl ein: ");
		operand2 = Double.parseDouble(input.nextLine());
	}

	public void operatorEinlesen(Scanner input) {
		System.out.print("Geben Sie bitte eine Operation ein:");
		operator = input.nextLine().charAt(0);
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

	public void menuAusgeben() {
		System.out.println("*****************************");
		System.out.println("1. Die erste Zahl einstellen");
		System.out.println("2. Die zweite Zahl einstellen");
		System.out.println("3. Der Operator einstellen");
		System.out.println("4. Berechnen");
		System.out.println("*****************************");
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

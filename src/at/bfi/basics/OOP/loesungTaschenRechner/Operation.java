package at.bfi.basics.OOP.loesungTaschenRechner;

public enum Operation {
	ADD, SUBSTRACT, MULTIPLY, DIVIDE;

	public double calculate(double z1, double z2) throws Exception {

		switch (this) {

		case ADD:
			return z1 + z2;

		case SUBSTRACT:
			return z1 - z2;

		case MULTIPLY:
			return z1 * z2;
		case DIVIDE:
			if (z2 == 0) {
				throw new ArithmeticException("unzulaessige Argument beim Zaehler, Divisor = 0");
			}

			return z1 / z2;

		default:
			throw new AssertionError("nicht gueltige Operation");

		}
	}

}

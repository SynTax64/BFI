package at.bfi.basics.OOP;

public enum Operation {

	ADDITION, SUBTRACT, MULTIPLY, DIVIDE;

	public double calculate(double z1, double z2) throws Exception {
		switch (this) {
		case ADDITION: {
			return z1 + z2;
		}
		case SUBTRACT: {
			return z1 - z2;
		}
		case MULTIPLY: {
			return z1 * z2;
		}
		case DIVIDE: {
			if (z2 == 0) {
				throw new ArithmeticException("Unzulässige Argument beim Divisor 0");
			}
			return z1 / z2;
		}
		default:
			throw new AssertionError("Unexcepted value: " + this);
		}
	}
}

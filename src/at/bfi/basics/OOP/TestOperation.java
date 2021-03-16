package at.bfi.basics.OOP;

public class TestOperation {
	public static void main(String[] args) {
		Operation operation = Operation.ADDITION;
		double result;
		try {
			result = operation.calculate(14, 4);
			System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}

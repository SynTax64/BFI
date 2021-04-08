package interfaces.lambda;

public class TestBerechenbar {

	public static void main(String[] args) {

		Berechenbar calculable = (a, b, c) -> {
			int summe = a + b + c;
			System.out.println(summe);
		};

		calculable.add(3, 5, 7);
	}
}
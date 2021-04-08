package interfaces.calculation;

public class Calculation {

	public static void main(String[] args) {
		Berechenbar calculable = new Berechenbar() {

			@Override
			public int add(int a, int b) {

				return a + b;
			}
		};

		System.out.println(calculable.add(3, 5));
	}

}

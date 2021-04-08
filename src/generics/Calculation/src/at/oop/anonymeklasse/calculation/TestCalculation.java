package generics.Calculation.src.at.oop.anonymeklasse.calculation;

//siehe CalculatorInterface

//Anonyme Klasse
//Sie haben keine echte Klassen -Definition.
//Um eine Anonyme Klasse zu programmieren benoetigen wir entweder:
//ein Interface
//oder eine Klasse von der eine Anonyme Klasse abgeleitet ist.

public class TestCalculation {

	public static void main(String[] args) {

		CalculatorInterface calc = new CalculatorInterface() {

			@Override
			public int add(int a, int b) {

				return a + b;
			}
		};
		int c = calc.add(10, 5);
		System.out.println(c);
	}

}

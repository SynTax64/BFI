package at.bfi.basics.OOP.loesungTaschenRechner;

public class TaschenRechner {

	public static void main(String[] args) {

		System.out.println("Programm Start");

		// alle User -Interaktionen wie "Zahlen od. Operationen
		// vom Tastatur einlesen" und fuer die Konvertierung der Eingaben!
		// Ein UserDataInput -Objekt ist gleichzeitig unsere
		// DatenModel (dort wird richtige Eingaben von Zahlen und die Operationen
		// gespeichert!
		UserDataInput input = new UserDataInput();

		double firstNumber = 0.0;
		double secondNumber = 0.0;
		Operation operator = null;

		do {
			double result = 0;

			// Aufruf von getNumberForCalc() -Methode => es soll ein gueltiger Zahl
			// eingelesen werden.
			firstNumber = input.getNumberForCalc();

			// Aufruf von getOperatorForCalc() -Methode => es soll ein gueltige Operation
			// eingelesen werden.
			operator = input.getOperatorForCalc();

			secondNumber = input.getNumberForCalc();

			// getResult() liefert das Ergebnis abhaengig von Operation
			result = input.resultBerechnen(firstNumber, secondNumber, operator);

			// app() -Methode zeigt hier das Resultat am Display oder Console
			if ((operator == Operation.DIVIDE) & (secondNumber == 0))
				System.out.println("Division durch 0 ist nicht deffiniert!");
			else
				System.out.println(firstNumber + "  " + operator.name() + "  " + secondNumber + " = " + result);

			// isTryingNextCalc() fragt ob weiter Berechnung durchgefuehrt werden soll oder
			// nicht
			// wenn nicht dann liefert false und das Programm wird beendet.
			if (input.isTryingNextCalc() == false)
				break;

		} while (true);

		// Am Ende schliessen wir alle Resourcesn
		input.closeResources();

		System.out.println("Programm Ende");

	}

}

package InterfaceStaticGenerics_Zusatz.src.at.bfi.oop.zusatz.statictest.singleton;

public class StaticTest_5 {

	public static void main(String[] args) {

		// Da kein public konstruktor vorhanden, compiler -error>
		// Constructor not visible
		// SingleTon singleTon = new SingleTon();
		// Aus dieser Klasse nur ein instanz moeglich
		// aber nur in "static way"

		SingleTon singleTon = SingleTon.getInstance();

		singleTon.ausgabe();

	}

}

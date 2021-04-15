package InterfaceStaticGenerics_Zusatz.src.at.bfi.oop.zusatz.a_interfaces;

public interface MyInterface {

	int add(int a, int b);

	default void textOutput() {

		System.out.println("Default implementation im Interface fuer die Methode textOutput()");
	}

	static void staticTextOutput() {

		System.out.println("Static Text Output im Interface!");

	}

}

package InterfaceStaticGenerics_Zusatz.src.at.bfi.oop.zusatz.a_interfaces;

public class MyInterfaceImpl implements MyInterface {

	@Override
	public int add(int a, int b) {

		return (a + b);
	}

	@Override
	public void textOutput() {

		MyInterface.super.textOutput();
		System.out.println("Die Methode textOutput() wurde erweitert und ueberschrieben! ");

		this.staticTextOutput();

		MyInterface.staticTextOutput();
	}

	static void staticTextOutput() {

		System.out.println("Static Text Output im MyInterfaceImpl!");

	}

}

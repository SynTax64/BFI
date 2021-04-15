package InterfaceStaticGenerics_Zusatz.src.at.bfi.oop.zusatz.a_interfaces;

public class TestInterface {

	public static void main(String[] args) {

		MyInterface interf = new MyInterfaceImpl();
		System.out.println("Test add(12,13) im Interface: " + interf.add(12, 13));
		////////////

		interf.textOutput();

		MyInterface.staticTextOutput();
	}
}

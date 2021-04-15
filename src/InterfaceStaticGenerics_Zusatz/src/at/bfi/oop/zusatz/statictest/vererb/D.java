package InterfaceStaticGenerics_Zusatz.src.at.bfi.oop.zusatz.statictest.vererb;

public class D {

	static int d = 0;

	static {

		System.out.println("Init D, d= " + d);
	}

	public D() {

		d = d + 2000;

		System.out.println("Konstruktor D, d= " + d);
	}

}

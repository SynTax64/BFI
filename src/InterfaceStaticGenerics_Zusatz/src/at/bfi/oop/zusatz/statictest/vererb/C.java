package InterfaceStaticGenerics_Zusatz.src.at.bfi.oop.zusatz.statictest.vererb;

public class C extends B {

	{
		a = 21;
		System.out.println("Init C, a= " + a);
	}

	public C() {
		a = 22;
		System.out.println("Konstrukt C, a= " + a);
	}

}

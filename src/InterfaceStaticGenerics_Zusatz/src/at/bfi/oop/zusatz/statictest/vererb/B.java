package InterfaceStaticGenerics_Zusatz.src.at.bfi.oop.zusatz.statictest.vererb;

public class B extends A {

	{
		a = 10 + a;
		System.out.println("Init B, a= " + a);
	}

	public B() {

		a = 12 + a;
		System.out.println("Konstrukt B, a= " + a);
	}

}

package InterfaceStaticGenerics_Zusatz.src.at.bfi.oop.zusatz.statictest.vererb;

public class A {

	int a;
	{

		a = 1;
		System.out.println("Init A, a= " + a);
	}

	public A() {
		++a;

		System.out.println("Konstrukt A, a= " + a);
	}
}
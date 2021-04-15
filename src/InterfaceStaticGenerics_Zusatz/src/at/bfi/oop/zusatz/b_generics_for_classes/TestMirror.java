package InterfaceStaticGenerics_Zusatz.src.at.bfi.oop.zusatz.b_generics_for_classes;

public class TestMirror {

	public static void main(String[] args) {

		Mirror mirror = new Mirror();

		mirror.input("wert");

		System.out.println(mirror.output());

		mirror.input(3);
		System.out.println(mirror.output());

		mirror.input(3f);
		System.out.println(mirror.output());

		Mitarbeiter m = new Mitarbeiter(1, "Safavi");

		mirror.input(m);

		System.out.println(mirror.output());
	}
}
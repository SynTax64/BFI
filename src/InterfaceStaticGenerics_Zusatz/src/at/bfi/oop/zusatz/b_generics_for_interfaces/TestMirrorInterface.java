package InterfaceStaticGenerics_Zusatz.src.at.bfi.oop.zusatz.b_generics_for_interfaces;

public class TestMirrorInterface {

	public static void main(String[] args) {

		MirrorInterface<String> mirrorInterface = new MirrorInterfaceImpl<>();

		mirrorInterface.input("Safavi");
		System.out.println(mirrorInterface.output());

		MirrorInterface<Integer> mirror = new MirrorInterfaceImpl<>();
		mirror.input(34);
		System.out.println(mirror.output());

		MirrorInterface<Mitarbeiter> mirror2 = new MirrorInterfaceImpl<>();
		mirror2.input(new Mitarbeiter(2, "Safavi"));

		System.out.println(mirror2.output());

	}

}

package ProjektAuto;

public class TestAuto {

	public static void main(String[] args) {
		Auto auto1 = new Auto("Skoda");
		System.out.println(auto1);

		System.out.println(auto1.getStatus());

		auto1.setGeschwindigkeit(50);
		auto1.beschleunigen();
		auto1.beschleunigen();
		auto1.beschleunigen();
		System.out.println(auto1.getStatus());

		auto1.bremsen();
		auto1.bremsen();
		System.out.println(auto1.getStatus());

		auto1.anhalten();
		System.out.println(auto1.getStatus());

		System.out.println(auto1);
//
//		Auto auto2 = new Auto("BMW");
//		System.out.println(auto2);
//
//		Auto auto3 = new Auto("Audi", 240);
//		System.out.println(auto3);
//
//		Auto[] autos = new Auto[3];
//		autos[0] = new Auto(auto1);
//		autos[1] = new Auto(auto2);
//		autos[2] = new Auto(auto3);

//		System.out.println("**************");
//
//		for (Auto auto : autos) {
//			System.out.println(auto);
//		}
//		System.out.println("**************");
//		List<Auto> autosListe = new ArrayList<>();
//		autosListe.add(auto1);
//		autosListe.add(auto2);
//		autosListe.add(auto3);
//
//		for (Auto auto : autosListe) {
//			System.out.println(auto);
//		}
//		System.out.println();

	}

}

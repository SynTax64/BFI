package InterfaceStaticGenerics_Zusatz.src.at.bfi.oop.zusatz.statictest;

public class StaticTest_2 {

	public static void main(String[] args) {

		StaticUmgebung[] staticUmgebungen = new StaticUmgebung[10];

		System.out.println("static int Counter \t" + "int zaehler");
		for (StaticUmgebung st : staticUmgebungen) {

			st = new StaticUmgebung();

			System.out.println(StaticUmgebung.increasCounter() + "\t\t\t\t" + st.erhoeheZaehler());
			System.out.println();
		}

		System.out.println("counter am ende: " + StaticUmgebung.counter);
		System.out.println("counter fuer 9.element: " + staticUmgebungen[9].counter);
		System.out.println("counter fuer 5.element: " + staticUmgebungen[5].counter);
		System.out.println("counter fuer 0.element: " + staticUmgebungen[0].counter);
		System.out.println("===> counter (heisst Klssenvariable) fuer alle Elementen hat dieselbe Wert");
		System.out.println("===> fuer Instanzvariablen> jedes Objekt oder Instanz verwaltet "
				+ "selbstaendig seine eigene Instanzvariablen  ");
	}

}

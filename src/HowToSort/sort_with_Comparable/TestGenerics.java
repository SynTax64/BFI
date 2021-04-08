package HowToSort.sort_with_Comparable;

public class TestGenerics {

	public static void main(String[] args) {
		// Consumer erstellen
		Rechteck<Double, Double> rechteck = new Rechteck<>(4., 5.);
		rechteck.setBreite(5.);
		rechteck.setLaenge(3.);
		System.out.println(rechteck);

		Rechteck<Integer, Integer> rechteck2 = new Rechteck<>(7, 15);
		System.out.println(rechteck2);
	}
}
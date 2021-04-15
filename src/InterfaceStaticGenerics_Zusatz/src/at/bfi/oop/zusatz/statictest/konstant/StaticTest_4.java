package InterfaceStaticGenerics_Zusatz.src.at.bfi.oop.zusatz.statictest.konstant;

public class StaticTest_4 {

	private final static int SIZE = 10;

	public static void main(String[] args) {

		int[] myArray = new int[SIZE];

		System.out.println("myArray.length: " + myArray.length);

		// Aenderung von Size nicht mehr moeglich

	}

}

package GraphicsGeometrie.src.at.bfi.oop.konzepten.i_abstract.graphic;

import java.util.Arrays;

public class TestGraphics {

	public static void main(String[] args) {

		GrafikElement[] elements = new GrafikElement[5];

		elements[0] = new Rechteck(10, 5);
		elements[1] = new Rechteck(10, 2);
		elements[2] = new Kreis(3);
		elements[3] = new Kreis(2);
		elements[4] = new Rechteck(10, 5);

		Arrays.sort(elements);

		for (GrafikElement grafikElement : elements) {

			System.out.println(grafikElement.berechneFlaechenInhalt() + "\t" + grafikElement.getClass().toString());

		}

	}

}

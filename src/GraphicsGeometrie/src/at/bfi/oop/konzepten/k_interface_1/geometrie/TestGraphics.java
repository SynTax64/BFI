package GraphicsGeometrie.src.at.bfi.oop.konzepten.k_interface_1.geometrie;

public class TestGraphics {

	public static void main(String[] args) {

		GrafikElementContainer container = new GrafikElementContainer(5);

		container.add(new Rechteck(10, 5));
		container.add(new Rechteck(10, 2));
		container.add(new Kreis(3));
		container.add(new Kreis(2));
		container.add(new Rechteck(10, 5));

		for (int i = 0; i < container.counter; i++) {

			System.out.println(
					container.get(i).berechneFlaechenInhalt() + "\t" + container.get(i).getClass().toGenericString());
		}

		container.remove(1);

		for (int i = 0; i < container.counter; i++) {

			System.out.println(
					container.get(i).berechneFlaechenInhalt() + "\t" + container.get(i).getClass().toGenericString());
		}

		System.out.println(container.size());

	}

}

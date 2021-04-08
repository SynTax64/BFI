package GraphicsGeometrie.src.at.bfi.oop.konzepten.j_abstract.graphic.container;

class Kreis extends GrafikElement {

	protected int radius;

	Kreis() {

	}

	Kreis(int radius) {

		this.radius = radius;

	}

	@Override
	public double berechneFlaechenInhalt() {

		return (radius * radius * 3.14);
	}

	@Override
	public double berechneUmfang() {

		return (2 * 3.14 * radius);
	}

}
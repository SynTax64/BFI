package GraphicsGeometrie.src.at.bfi.oop.konzepten.k_interface_3.geometrie;

class Kreis implements GrafikElement {

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
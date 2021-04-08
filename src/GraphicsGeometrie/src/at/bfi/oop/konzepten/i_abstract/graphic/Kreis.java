package GraphicsGeometrie.src.at.bfi.oop.konzepten.i_abstract.graphic;

class Kreis extends GrafikElement {

	protected int radius;

	Kreis() {

	}

	Kreis(int radius) {

		this.radius = radius;

	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public double berechneFlaechenInhalt() {

		return (radius * radius * Math.PI);
	}

	@Override
	public double berechneUmfang() {

		return (2 * Math.PI * radius);
	}

}
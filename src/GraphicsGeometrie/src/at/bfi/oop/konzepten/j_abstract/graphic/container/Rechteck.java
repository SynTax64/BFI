package GraphicsGeometrie.src.at.bfi.oop.konzepten.j_abstract.graphic.container;

class Rechteck extends GrafikElement {

	double bereite;
	double hoehe;

	public Rechteck(double bereite, double hoehe) {

		setBereite(bereite);
		setHoehe(hoehe);
	}

	public double getBereite() {
		return bereite;
	}

	public void setBereite(double bereite) {
		if (bereite <= 0)
			throw new IllegalArgumentException("bereite darf nicht 0 oder < 0 sein");
		else
			this.bereite = bereite;
	}

	public double getHoehe() {
		return hoehe;
	}

	public void setHoehe(double hoehe) {

		if (hoehe <= 0)
			throw new IllegalArgumentException("hoehe darf nicht 0 oder <0 sein");
		else
			this.hoehe = hoehe;
	}

	@Override
	public double berechneFlaechenInhalt() {

		return (bereite * hoehe);
	}

	@Override
	public double berechneUmfang() {

		return 2 * (hoehe + bereite);
	}

}

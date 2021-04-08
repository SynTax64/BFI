package GraphicsGeometrie.src.at.bfi.oop.konzepten.i_abstract.graphic;

class Rechteck extends GrafikElement {

	double bereite;
	double hoehe;

	Rechteck(double bereite, double hoehe) {

		setBereite(bereite);
		setHoehe(hoehe);

	}

	public double getBereite() {
		return bereite;
	}

	public void setBereite(double bereite) {

		if (bereite <= 0)
			throw new IllegalArgumentException("Die Bereite muss groesser als 0 sein!!!");
		else
			this.bereite = bereite;
	}

	public double getHoehe() {
		return hoehe;
	}

	public void setHoehe(double hoehe) {

		if (hoehe <= 0)
			throw new IllegalArgumentException("Hoehe darf nicht kleiner oder gleich 0 sein");
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

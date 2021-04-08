package GraphicsGeometrie.src.at.bfi.oop.konzepten.l_generic.geometrie;

class Rechteck_1 {

	private double laenge;
	private double breite;

	Rechteck_1(double laenge, double breite) {

		setLaenge(laenge);
		setBreite(breite);
	}

	public double getLaenge() {
		return laenge;
	}

	public void setLaenge(double laenge) {
		if (laenge <= 0)
			throw new IllegalArgumentException("Die Laenge muss groesser als 0 sein! ");

		this.laenge = laenge;
	}

	public double getBreite() {
		return breite;
	}

	public void setBreite(double breite) {
		if (breite <= 0)
			throw new IllegalArgumentException("Die Breite muss groesser als 0 sein! ");

		this.breite = breite;
	}

}

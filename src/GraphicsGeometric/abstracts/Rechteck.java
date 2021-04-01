package GraphicsGeometric.abstracts;

public class Rechteck extends GraphicElement {

	double laenge;
	double breite;

	public Rechteck() {
	}

	public Rechteck(double laenge, double breite) {
		this.laenge = laenge;
		this.breite = breite;
	}

	public double getLaenge() {
		return laenge;
	}

	public void setLaenge(double laenge) {
		this.laenge = laenge;
	}

	public double getBreite() {
		return breite;
	}

	public void setBreite(double breite) {
		this.breite = breite;
	}

	@Override
	public double berechneFlechenInhalt() {

		return laenge * breite;
	}

	@Override
	public double berechneUmfang() {
		return 2 * (laenge + breite);
	}

	@Override
	public String toString() {
		return "Rechteck [laenge=" + laenge + ", breite=" + breite + ", getLaenge()=" + getLaenge() + ", getBreite()="
				+ getBreite() + "]";
	}

}

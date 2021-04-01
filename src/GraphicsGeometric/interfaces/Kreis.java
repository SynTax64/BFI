package GraphicsGeometric.interfaces;

public class Kreis implements GraphicElement {
	private double radius;

	public Kreis(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "Kreis [radius=" + radius + ", getRadius()=" + getRadius() + ", berechneFlechenInhalt()="
				+ berechneFlechenInhalt() + ", berechneUmfang()=" + berechneUmfang() + "]";
	}

	@Override
	public double berechneFlechenInhalt() {
		return (Math.PI * radius * radius);
	}

	@Override
	public double berechneUmfang() {
		return (2 * Math.PI) * radius;
	}

}

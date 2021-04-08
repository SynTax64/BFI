package HowToSort.sort_with_Comparable;

class Kreis implements Geometrie {

	protected double radius;

	Kreis(double radius) {

		this.radius = radius;

	}

	@Override
	public double berechneUmfang() {

		return 2 * radius * Math.PI;
	}

	@Override
	public double berechneFlaeche() {

		return radius * radius * Math.PI;
	}

	@Override
	public int compareTo(Geometrie other) {

		double thisObjektFlaeche = this.berechneFlaeche();
		double otherObjektFlaeche = other.berechneFlaeche();

		if (thisObjektFlaeche == otherObjektFlaeche)
			return 0;
		else if (thisObjektFlaeche > otherObjektFlaeche)
			return 1;
		else
			return -1;
	}
}
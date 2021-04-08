package HowToSort.sort_with_Comparable;

// Generic -> Producer erstellen
class Rechteck<T, V> {

	T laenge;
	V breite;

	public Rechteck(T laenge, V breite) {
		this.laenge = laenge;
		this.breite = breite;
	}

	public T getLaenge() {
		return laenge;
	}

	public void setLaenge(T laenge) {
		this.laenge = laenge;
	}

	public V getBreite() {
		return breite;
	}

	public void setBreite(V breite) {
		this.breite = breite;
	}

	@Override
	public String toString() {
		return "Rechteck [laenge=" + laenge + ", breite=" + breite + "]";
	}
}

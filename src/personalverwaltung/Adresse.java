package personalverwaltung;

public class Adresse {
	private String strasse;
	private String ort;
	private int plz;

	public Adresse(String strasse, String ort, int plz) {
		this.strasse = strasse;
		this.ort = ort;
		this.plz = plz;
	}

	public Adresse() {
		this.strasse = "unbekannt";
		this.ort = "unbekannt";
		this.plz = 0;
	}

	public String getStrasse() {
		return strasse;
	}

	public void setStrasse(String strasse) {
		this.strasse = strasse;
	}

	public String getOrt() {
		return ort;
	}

	public void setOrt(String ort) {
		this.ort = ort;
	}

	public int getPlz() {
		return plz;
	}

	public void setPlz(int plz) {
		this.plz = plz;
	}

	@Override
	public String toString() {
		return String.format("\n\tAdressen\n\t\tStraﬂe: %s\n\t\tOrt: %s\n\t\tPLZ: %s\n", getStrasse(), getOrt(),
				getPlz());
	}
}

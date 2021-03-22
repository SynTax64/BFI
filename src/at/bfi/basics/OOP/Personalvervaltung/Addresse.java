package at.bfi.basics.OOP.Personalvervaltung;

public class Addresse {

	private String strasse;
	private int plz;
	private String ort;

	public Addresse(String strasse, int plz, String ort) {
		this.strasse = strasse;
		this.plz = plz;
		this.ort = ort;
	}

	public String getStrasse() {
		return strasse;
	}

	public void setStrasse(String strasse) {
		this.strasse = strasse;
	}

	public int getPlz() {
		return plz;
	}

	public void setPlz(int plz) {
		this.plz = plz;
	}

	public String getOrt() {
		return ort;
	}

	public void setOrt(String ort) {
		this.ort = ort;
	}

}

package personalverwaltung;

public class Person {
	private String vorname;
	private String nachname;
	private int alter;
	private Adresse adresse;

	public Person(String vorname, String nachname, int alter, Adresse adresse) {
		this.vorname = vorname;
		this.nachname = nachname;
		this.alter = alter;
		this.adresse = adresse;

		System.out.printf("Person %s %s(%d) wurde gerade hinzugefügt!\n", vorname, nachname, alter);
	}

	public Person() {
		this.vorname = "unbekannt";
		this.nachname = "unbekannt";
		this.alter = 0;
		this.adresse = new Adresse();
		System.out.println("Die leere Klasse wurde erstellt!");
	}

	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public String getNachname() {
		return nachname;
	}

	public void setNachname(String nachname) {
		this.nachname = nachname;
	}

	public int getAlter() {
		return alter;
	}

	public void setAlter(int alter) {
		this.alter = alter;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	public void setAdresse(String adresse, String ort, int plz) {
		this.adresse = new Adresse(adresse, ort, plz);
	}

	@Override
	public String toString() {
		return String.format("\tVorname: %s\n\tNachname: %s\n\tAlter: %s%s", getVorname(), getNachname(), getAlter(),
				getAdresse());
	}

}

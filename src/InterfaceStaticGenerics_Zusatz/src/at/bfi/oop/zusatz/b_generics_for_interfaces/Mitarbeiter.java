package InterfaceStaticGenerics_Zusatz.src.at.bfi.oop.zusatz.b_generics_for_interfaces;

public class Mitarbeiter {

	protected double id;
	protected String name;
	protected int i;

	// Defaultkonstruktor
	public Mitarbeiter() {

	}

	// Parameterisierter Konstruktor(1)
	public Mitarbeiter(double id) {
		this.id = id;
	}

	public double getId() {
		return id;
	}

	public void setId(double id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// Parameterisierter Konstruktor(2)
	public Mitarbeiter(double id, String name) {
		this.id = id;
		this.name = name;
	}

	// Methode zur Ausgabe von Mitarbeiter Objekten
	public String ausgabe() {
		return new String("Mitarbeiter ID: " + getId() + "\t" + " Mitarbeitername: " + getName());
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Mitarbeiter ID: " + getId() + "\t" + " Mitarbeitername: " + getName();
	}

}

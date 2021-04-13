package AWT_SWING_NIO.BankCollection;

public class Konto {

	private int konto_nr;

	public Konto(int konto_nr) {
		System.out.println("Ein Konto wird erzeugt");
		this.konto_nr = konto_nr;
	}

	// getters, setters

	public int getKonto_nr() {
		return konto_nr;
	}

	public void setKonto_nr(int konto_nr) {
		this.konto_nr = konto_nr;
	}

	@Override
	public String toString() {
		return "Konto [konto_nr=" + konto_nr + "]";
	}

}

package BankCollection;

public class Kunde {

	private Konto konto;

	public Kunde(Konto konto) {

		this.konto = konto;
	}

	public Konto getKonto() {
		return konto;
	}

	public void setKonto(Konto konto) {
		this.konto = konto;
	}

	@Override
	public String toString() {
		return "Kunde [konto=" + konto + "]";
	}

}

package BankCollection;

public class GeschaeftsKunde extends Kunde {

	public GeschaeftsKunde(Konto konto) {

		super(konto);

		System.out.println("ich bin ein Geschaeftskunde");

	}

	@Override
	public String toString() {
		return "GeschaeftsKunde [toString()=" + super.toString() + "]";
	}

}

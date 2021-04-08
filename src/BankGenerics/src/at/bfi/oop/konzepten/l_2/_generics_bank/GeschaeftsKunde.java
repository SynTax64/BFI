package BankGenerics.src.at.bfi.oop.konzepten.l_2._generics_bank;

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

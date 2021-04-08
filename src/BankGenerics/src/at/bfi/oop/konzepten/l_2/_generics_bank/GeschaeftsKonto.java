package BankGenerics.src.at.bfi.oop.konzepten.l_2._generics_bank;

public class GeschaeftsKonto extends Konto {

	GeschaeftsKonto(int konto_nummer) {
		super(konto_nummer);
	}

	@Override
	public String toString() {
		return "GeschaeftsKonto []";
	}

}

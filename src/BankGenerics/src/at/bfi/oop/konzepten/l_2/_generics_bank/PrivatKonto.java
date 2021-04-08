package BankGenerics.src.at.bfi.oop.konzepten.l_2._generics_bank;

public class PrivatKonto extends Konto {

	public PrivatKonto(int konto_nummer) {

		super(konto_nummer);
	}

	@Override
	public String toString() {
		return "PrivatKonto []";
	}

}

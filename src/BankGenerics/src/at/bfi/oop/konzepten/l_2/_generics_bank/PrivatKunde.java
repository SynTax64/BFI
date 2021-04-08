package BankGenerics.src.at.bfi.oop.konzepten.l_2._generics_bank;

public class PrivatKunde extends Kunde {

	public PrivatKunde(Konto konto) {

		super(konto);
		System.out.println("ich bin ein privatkunde");
	}

	@Override
	public String toString() {
		return "PrivatKunde []";
	}

}

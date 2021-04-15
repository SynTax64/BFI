package BankCollection.src.at.bfi.standards.B_CollectionMapProperties;

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

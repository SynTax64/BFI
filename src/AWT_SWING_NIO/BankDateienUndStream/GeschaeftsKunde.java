package AWT_SWING_NIO.BankDateienUndStream;

import java.io.Serializable;

public class GeschaeftsKunde extends Kunde implements Serializable {

	private static final long serialVersionUID = -8959989913384471689L;

	public GeschaeftsKunde(Konto konto) {

		super(konto);

		System.out.println("ich bin ein Geschaeftskunde");

	}

	@Override
	public String toString() {
		return "GeschaeftsKunde [toString()=" + super.toString() + "]";
	}

}

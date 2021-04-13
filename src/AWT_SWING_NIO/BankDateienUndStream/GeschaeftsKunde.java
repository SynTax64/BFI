package BankDateienUndStream;

import java.io.Serializable;

public class GeschaeftsKunde extends Kunde implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -269000061266459492L;

	public GeschaeftsKunde(Konto konto) {

		super(konto);

		System.out.println("ich bin ein Geschaeftskunde");

	}

	@Override
	public String toString() {
		return "GeschaeftsKunde [toString()=" + super.toString() + "]";
	}

}

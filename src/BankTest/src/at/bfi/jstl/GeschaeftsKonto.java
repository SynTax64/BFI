package BankTest.src.at.bfi.jstl;

import java.io.Serializable;

public class GeschaeftsKonto extends Konto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1950016064995726605L;

	public GeschaeftsKonto(int konto_nummer) {
		super(konto_nummer);
	}

	@Override
	public String toString() {
		return "GeschaeftsKonto []";
	}

}

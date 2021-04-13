package AWT_SWING_NIO.BankDateienUndStream;

import java.io.Serializable;

public class PrivatKonto extends Konto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4469989902988548323L;

	public PrivatKonto(int konto_nummer) {

		super(konto_nummer);
	}

	@Override
	public String toString() {
		return "PrivatKonto []";
	}

}

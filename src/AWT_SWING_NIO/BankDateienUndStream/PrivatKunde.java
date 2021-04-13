package AWT_SWING_NIO.BankDateienUndStream;

import java.io.Serializable;

public class PrivatKunde extends Kunde implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 353683607594275542L;

	public PrivatKunde(Konto konto) {

		super(konto);
		System.out.println("ich bin ein privatkunde");
	}

	@Override
	public String toString() {
		return "PrivatKunde []";
	}

}

package AWT_SWING_NIO.BankDateienUndStream;

import java.io.Serializable;

public class Kunde implements Serializable {

	private static final long serialVersionUID = 4585061654440050992L;

	private Konto konto;

	public Kunde(Konto konto) {

		this.konto = konto;
	}

	public Konto getKonto() {
		return konto;
	}

	public void setKonto(Konto konto) {
		this.konto = konto;
	}

	@Override
	public String toString() {
		return "Kunde [konto=" + konto + "]";
	}

}

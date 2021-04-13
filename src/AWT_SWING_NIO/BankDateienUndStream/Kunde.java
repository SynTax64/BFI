package BankDateienUndStream;

import java.io.Serializable;

public class Kunde implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -9210121294364869640L;

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

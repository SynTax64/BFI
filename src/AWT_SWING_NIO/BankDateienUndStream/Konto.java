package BankDateienUndStream;

import java.io.Serializable;

public class Konto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 341742060917437708L;

	private int konto_nr;

	public Konto(int konto_nr) {
		System.out.println("Ein Konto wird erzeugt");
		this.konto_nr = konto_nr;
	}

	// getters, setters

	public int getKonto_nr() {
		return konto_nr;
	}

	public void setKonto_nr(int konto_nr) {
		this.konto_nr = konto_nr;
	}

	@Override
	public String toString() {
		return "Konto [konto_nr=" + konto_nr + "]";
	}

}

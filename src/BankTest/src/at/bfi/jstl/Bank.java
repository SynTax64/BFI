package BankTest.src.at.bfi.jstl;

//Aenderung von Schritt 1 mit Generics

import java.util.Arrays;

public final class Bank {

	private Kunde[] kunden;

	public Kunde[] getKunden() {
		return kunden;
	}

	public void setKunden(Kunde[] kunden) {
		this.kunden = kunden;
	}

	@Override
	public String toString() {
		return "Bank [kunden=" + Arrays.toString(kunden) + "]";
	}

}
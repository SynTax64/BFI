package at.bfi.basics.OOP.grundlagen;

import java.util.Scanner;

public class Recheck {
	// Atrbuten
	// Instanzvariablen, wenn ein Objekt erstellt wird

//	public double laenge;
//	public double breite;

	Scanner scanner = new Scanner(System.in);

	private double laenge;
	private double breite;
	private double hoehe;

	// Kontruktoren
	public Recheck() {
	}

	public Recheck(double laenge, double breite) {
		this.laenge = laenge;
		this.breite = breite;
	}

	public Recheck(double laenge, double breite, double hoehe) {
		this.laenge = laenge;
		this.breite = breite;
		this.hoehe = hoehe;
	}

	// Methoden
	public double getLaenge() {
		return laenge;
	}

	public void setLaenge(double laenge) {
		this.laenge = laenge;
	}

	public double getBreite() {
		return breite;
	}

	public void setBreite(double breite) {
		this.breite = breite;
	}

	public double getHoehe() {
		return hoehe;
	}

	public void setHoehe(double hoehe) {
		this.hoehe = hoehe;
	}

	public double flaecheBerechnen(double laenge, double breite) {
		return laenge * breite;
	}

	public double umfangBerechnen(double laenge, double breite, double hoehe) {
		return laenge * breite * hoehe;
	}

	@Override
	public String toString() {
		return "Recheck [laenge=" + laenge + ", breite=" + breite + ", hoehe=" + hoehe + "]" + "\n\tFlaeche= "
				+ flaecheBerechnen(laenge, breite) + "" + "\n\tUmfang= " + umfangBerechnen(laenge, breite, hoehe);
	}
}

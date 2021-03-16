package at.bfi.basics.OOP.grundlagen;

public class TestRecheck {
	public static void main(String[] args) {
		// Referenztyp, r ist referenzvariable auf ein Objekt der Klasse Recheck
		Recheck r = new Recheck();

//		r.breite =5;
//		r.laenge = 10;

		r.setBreite(5);
		r.setLaenge(10);

//		System.out.println("Rechteck r: Breite " + r.breite + " Laenge: " + r.laenge);
		System.out.println("Rechteck r: Breite " + r.getBreite() + " Laenge: " + r.getLaenge());
		System.out.println(r);

		Recheck r1 = new Recheck(10, 5);
		Recheck r2 = new Recheck(4, 8, 2.5);

		System.out.println("r1 Flaeche ist: " + r1.flaecheBerechnen(r1.getLaenge(), r1.getBreite()));
		System.out.println("r1 Umfang ist: " + r1.umfangBerechnen(r1.getLaenge(), r1.getBreite(), r1.getHoehe()));

		System.out.println("r2 Flaeche ist: " + r2.flaecheBerechnen(r2.getLaenge(), r2.getBreite()));
		System.out.println("r2 Umfang ist: " + r2.umfangBerechnen(r2.getLaenge(), r2.getBreite(), r2.getHoehe()));

		System.out.println(r1);
		System.out.println(r2);

		String string = "HelloWorld";
	}
}

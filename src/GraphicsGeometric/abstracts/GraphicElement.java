package GraphicsGeometric.abstracts;

public abstract class GraphicElement {

	public abstract double berechneFlechenInhalt();

	public abstract double berechneUmfang();

//	public void ausgabe() {
//		System.out.println("Ausgabe von Berechnung");
//	}
}

/*
 * 1) Was ist eine abstracte Methode Abstract bedeutet
 * "die Methode ist nicht Konkret" Konkret bedeutet: die Metode hat eine
 * Implementation
 * 
 * Die Metode hat ein Body(eine Definition), das fehlt bei abstracten Methoden
 * Abstracte Methoden haben nur ein Methodenkopf(Method Signature) ---> sie
 * haben nur eine Deklarationsteil, abgeschlossen mit semicolon ;
 * 
 * 2) Wenn eine Klasse aus nur einer oder mehrer abstracte Methoden besteht, so
 * ist die Klasse betreffende Klasse auch abstrakt
 * 
 * 3) Eine abstrakte Klasee kann auch Konkrete Metode besitzen
 * 
 * 4) Abstrakte Klassen sind nicht instanzierbar! Man kann von Abstrakte Klassen
 * kein Objekt erzeugen
 * 
 * 5) Eine abstrakte Klasse wird Konkret(Konkret bedeutet hier: es ist
 * instansierbar), wenn aus dieser abstrakten Klasse eine Sub-Klasse geerbt
 * wird. Wenn diese Sub-Klasse alle abstrakten Methoden der Superklassse
 * 
 */

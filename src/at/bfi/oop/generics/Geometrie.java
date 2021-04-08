package at.bfi.oop.generics;

/*
 * Comparble ist ein Interface und wurde so deklariert:
 *
 public interface Comparable<T>{
 	public int compareTo(T obj);
 }
 *
 Ziel: Wir wollen alle Objjekte der Geometrie Interface vergliechen oder sortiert werden koennen.
 *
  Die Java Standard Libraries sieht dazu interface "C o m a r a b l e" vor! (siehe Oben)
  *
  Als erste Schritt erweitern wir Geometrie Interface um "extends Comparable<Geometrie>.
  Damit muss jede Klasse, die Geometrie implementiert , auch Comparable<Geometrie> implementieren. 
 */

interface Geometrie extends Comparable<Geometrie> {

	double berechneUmfang();

	double berechneFlaeche();
}

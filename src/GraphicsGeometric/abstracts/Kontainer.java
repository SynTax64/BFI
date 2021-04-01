package GraphicsGeometric.abstracts;

public abstract class Kontainer {
	// ein Element hinzufügen
	public abstract void add(GraphicElement graphicElement);

	// Nach best. Index soll ein Element gelöscht wird
	public abstract void remove(int index);

	// die Länge von Liste zurückliefern
	public abstract int size();

	// Nach best. Index ein element aus der Liste holen
	public abstract GraphicElement get(int i);

	public abstract String toString();
}

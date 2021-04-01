package GraphicsGeometric.abstracts;

public abstract class Kontainer {
	// ein Element hinzuf�gen
	public abstract void add(GraphicElement graphicElement);

	// Nach best. Index soll ein Element gel�scht wird
	public abstract void remove(int index);

	// die L�nge von Liste zur�ckliefern
	public abstract int size();

	// Nach best. Index ein element aus der Liste holen
	public abstract GraphicElement get(int i);

	public abstract String toString();
}

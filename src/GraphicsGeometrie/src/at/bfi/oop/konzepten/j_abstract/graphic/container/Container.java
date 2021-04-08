package GraphicsGeometrie.src.at.bfi.oop.konzepten.j_abstract.graphic.container;

public abstract class Container {

	abstract public void add(GrafikElement x); /// Element hinzuf�gen

	abstract public int size(); /// Anzahl der Elemente

	abstract public GrafikElement get(int i); /// i-tes Element zur�uckgeben

	abstract public String toString(); /// Liefert eine textuelle Darstellung

	abstract public void remove(int i);

}

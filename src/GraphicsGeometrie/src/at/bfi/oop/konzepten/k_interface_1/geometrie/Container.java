package GraphicsGeometrie.src.at.bfi.oop.konzepten.k_interface_1.geometrie;

public abstract class Container {

	abstract public void add(GrafikElement x); /// Element hinzufügen

	abstract public int size(); /// Anzahl der Elemente

	abstract public GrafikElement get(int i); /// i-tes Element zur¨uckgeben

	abstract public String toString(); /// Liefert eine textuelle Darstellung

	abstract public void remove(int i);

}

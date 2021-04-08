package GraphicsGeometrie.src.at.bfi.oop.konzepten.l_generic.geometrie;

//Erstellung eines Generische Generics, auch Producer genannt!
//Das ist die Aufgabe von "Consumer" die in "Producer" erstellten generischen Typs zu bestimmen! 

class RechteckGeneric<T, V> {

	private T t;
	private V v;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}

	public V getV() {
		return v;
	}

	public void setV(V v) {
		this.v = v;
	}

}

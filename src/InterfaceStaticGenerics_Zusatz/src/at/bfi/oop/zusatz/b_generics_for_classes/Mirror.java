package InterfaceStaticGenerics_Zusatz.src.at.bfi.oop.zusatz.b_generics_for_classes;

public class Mirror<T> {

	private T wert;

	public void input(T wert) {

		this.wert = wert;
	}

	public T output() {

		return wert;
	}

}

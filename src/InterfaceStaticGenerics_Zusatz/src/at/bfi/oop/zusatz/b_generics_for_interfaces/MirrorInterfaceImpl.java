package InterfaceStaticGenerics_Zusatz.src.at.bfi.oop.zusatz.b_generics_for_interfaces;

public class MirrorInterfaceImpl<T> implements MirrorInterface<T> {

	T wert;

	@Override
	public void input(T wert) {

		this.wert = wert;
	}

	@Override
	public T output() {

		return wert;
	}

}

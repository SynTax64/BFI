package GraphicsGeometrie.src.at.bfi.oop.konzepten.k_interface_1.geometrie;

public class GrafikElementContainer extends Container {

	protected GrafikElement[] elemente;
	protected int counter;

	public GrafikElementContainer(int n) {

		elemente = new GrafikElement[n];
		counter = 0;
	}

	@Override
	public void add(GrafikElement x) {
		elemente[counter++] = x;

	}

	@Override
	public int size() {

		return counter;
	}

	@Override
	public GrafikElement get(int i) {

		return elemente[i];
	}

	@Override
	public String toString() {

		return null;
	}

	@Override
	public void remove(int i) {

		elemente[i] = elemente[counter - 1];
		counter--;

	}

}

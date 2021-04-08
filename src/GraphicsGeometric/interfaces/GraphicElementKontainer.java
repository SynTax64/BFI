package GraphicsGeometric.interfaces;

public class GraphicElementKontainer implements Kontainer {

	protected GraphicElement[] graphicElemente;
	protected int counter;

	public GraphicElementKontainer(int n) {
		graphicElemente = new GraphicElement[n];
		counter = 0;
	}

	@Override
	public void add(GraphicElement graphicElement) {
		graphicElemente[counter++] = graphicElement;
//		counter++;
	}

	@Override
	public void remove(int i) {
		GraphicElement[] tmpGE = new GraphicElement[graphicElemente.length - 1];

		ausereSchleife: for (int j = 0; j <= i; j++) {
			tmpGE[j] = graphicElemente[j];
			if (j == i) {
				for (int sJ = j; sJ < graphicElemente.length - 1; sJ++) {
					tmpGE[sJ] = graphicElemente[sJ + 1];
				}
				break ausereSchleife;
			}
		}

		graphicElemente = tmpGE;
	}

	@Override
	public int size() {
		return counter;
	}

	@Override
	public GraphicElement get(int i) {
		return graphicElemente[i];
	}

	@Override
	public String toString() {
		return null;
	}

}

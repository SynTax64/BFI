package GraphicsGeometric.interfaces;

public class TestGraphics {
	public static void main(String[] args) {
		// GraphicElement ge = new GraphicElement();
//		GraphicElement ge1 = new Rechteck(12, 4);
//		System.out.println(ge1);
//
//		GraphicElement ge2 = new Rechteck(8, 4);
//		System.out.println(ge2);

//		Rechteck re = new Rechteck(13, 4);
//		System.out.println(re);
//
//		GraphicElement kr1 = new Kreis(5);
//		System.out.println(kr1);
//
//		GraphicElement kr2 = new Kreis(6);
//		System.out.println(kr2);
//
//		System.out.println("***********************");
//		GraphicElement[] graphicElemete = new GraphicElement[4];
//		graphicElemete[0] = ge1;
//		graphicElemete[1] = kr1;
//		graphicElemete[2] = ge2;
//		graphicElemete[3] = kr2;
//
//		for (GraphicElement graphicElement : graphicElemete) {
//			System.out.println(graphicElement);
//		}
//		System.out.println("***********************");
//		List<GraphicElement> elemente = new ArrayList<>();
//		elemente.add(ge1);
//		elemente.add(ge2);
//		elemente.add(kr1);
//		elemente.add(kr2);
//
//		for (int i = 0; i < graphicElemete.length; i++) {
//			System.out.println(elemente.get(i));
//		}

		Kontainer kontainer = new GraphicElementKontainer(5);
		kontainer.add(new Kreis(3));
		kontainer.add(new Kreis(5));
		kontainer.add(new Kreis(6));
		kontainer.add(new Kreis(7));
		kontainer.add(new Kreis(8));

		System.out.println(kontainer.get(2));
		for (int i = 0; i < kontainer.size(); i++) {
			System.out.println(kontainer.get(i));
		}

		kontainer.remove(2);

		for (int i = 0; i < kontainer.size(); i++) {
			System.out.println(kontainer.get(i));
		}
	}
}

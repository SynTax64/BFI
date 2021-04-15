package InterfaceStaticGenerics_Zusatz.src.at.bfi.oop.zusatz.statictest.singleton;

public class SingleTon {

	private final static SingleTon instanz = new SingleTon();

	private SingleTon() {

		System.out.println("ein eeinziges Instanz wurde gerade erstellt. ");
	}

	public static SingleTon getInstance() {

		return instanz;
	}

	public void ausgabe() {
		System.out.println("Text wird ausgegeben");
	}

}

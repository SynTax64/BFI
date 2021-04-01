package ProjektAuto;

public class Cabrio extends Auto {
	private boolean dachOffen;

	public Cabrio() {
		super();
//		System.out.println("Ich bin in Cabrio -Default Kontruktor gelandet");
	}

	public Cabrio(String name, int geschwindigkeit, boolean isDachOffen) {
		super(name, geschwindigkeit);
		this.dachOffen = isDachOffen;
	}

	public Cabrio(String name, boolean isDachOffen) {
		super(name);
		this.dachOffen = dachOffen;
	}

	public Cabrio(boolean dachOffen) {
		super();
		this.dachOffen = dachOffen;
	}

	@Override
	public String getStatus() {
		return super.getStatus() + "\tDach is offen: " + this.dachOffen;
	}

	@Override
	public String toString() {
		return "Cabrio [dachOffen=" + dachOffen + ", toString()=" + super.toString() + "]";
	}

}
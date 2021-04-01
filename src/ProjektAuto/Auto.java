package ProjektAuto;

public class Auto {

	private String name;
	private int geschwindigkeit;

	public Auto() {
		this("default");
//		System.out.println("Ich bin in Auto -Default Kontruktor gelandet");
	}

	public Auto(String name) {
		this(name, 0);
	}

	public Auto(Auto other) {
		this.name = other.name;
		this.geschwindigkeit = other.geschwindigkeit;
	}

	public Auto(String name, int geschwindigkeit) {
		this.name = name;
		this.geschwindigkeit = geschwindigkeit;
	}

	public void bremsen() {
		this.geschwindigkeit = geschwindigkeit - 10;

		if (this.geschwindigkeit < 0) {
			this.geschwindigkeit = 0;
		}
	}

	public void anhalten() {
		this.geschwindigkeit = 0;
	}

	public String getStatus() {
		return getName() + " " + getGeschwindigkeit();
	}

	public void beschleunigen() {
		this.geschwindigkeit = geschwindigkeit + 10;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGeschwindigkeit() {
		return geschwindigkeit;
	}

	public void setGeschwindigkeit(int geschwindigkeit) {
		this.geschwindigkeit = geschwindigkeit;
	}

	@Override
	public String toString() {
		return "Auto [name=" + name + ", geschwindigkeit=" + geschwindigkeit + "]";
	}
}

package ProjektAuto;

public class Mechaniker {
	public void repariere(Auto auto) {
		if (auto instanceof Cabrio) {
			System.out.println(auto.getName() + " wird gerade repariert");
		}
	}
}

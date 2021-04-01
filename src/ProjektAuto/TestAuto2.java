package ProjektAuto;

public class TestAuto2 {
	public static void main(String[] args) {
		Auto auto1 = new Auto("BMW");

		Auto auto2 = new Cabrio("BMW_Cabrio", true); // upcasting

		Auto auto3 = new Auto("Mercedes");

		Auto auto4 = new Cabrio("Mercedes_Cabrio", false);

		Auto[] autos = new Auto[4];
		autos[0] = auto1;
		autos[1] = auto2;
		autos[2] = auto3;
		autos[3] = auto4;

		Mechaniker mechaniker = new Mechaniker();

		for (Auto auto : autos) {
			if (auto instanceof Cabrio) {
				System.out.println(auto.getName() + " kann nicht repaieren");
			} else {
				mechaniker.repariere(auto);
			}
		}

	}
}

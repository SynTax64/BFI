package ProjektAuto;

public class TestCabrio {
	public static void main(String[] args) {
		Cabrio cabrio1 = new Cabrio();
		Cabrio cabrio2 = new Cabrio(true);
		System.out.println(cabrio2);

		Cabrio cabrio3 = new Cabrio("BMW Cabrio", 0, true);
		System.out.println(cabrio3.getStatus());

		Auto auto1 = new Cabrio();
		System.out.println(auto1.getStatus());
		Auto auto2 = new Auto();
		System.out.println(auto2.getStatus());
	}
}
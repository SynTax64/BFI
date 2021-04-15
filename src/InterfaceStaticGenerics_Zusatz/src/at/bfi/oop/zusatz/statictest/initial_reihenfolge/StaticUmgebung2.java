package InterfaceStaticGenerics_Zusatz.src.at.bfi.oop.zusatz.statictest.initial_reihenfolge;

//Thema >   Reihenfolge von initialisierungen

//1) Statische Variablen und Statische Initialisierer in Reihenfolge
//2) Instanzvariablen und instanzinitialisierer in Reihenfolge
//3) Konstruktoren 

public class StaticUmgebung2 {

	static int counter;
	// int index=2000;

	static {

		counter = 10;
		System.out.println("Statische initialisierer> counter hat den Wert>  " + counter);
	}

	int zaehler;

	{
		// index++;
		zaehler = 1;
		System.out.println("Instanzinitialisierer> zaehler hat den Wert:  " + zaehler);
		counter++;
		System.out.println("Instanzinitialisierer> counter hat den Wert:  " + counter);

	}

	public StaticUmgebung2() {

		++counter;
		++zaehler;
		System.out.println("Konstruktor> counter hat den Wert:  " + counter);
		System.out.println("Konstruktor> zaehler hat den Wert:  " + zaehler);
		System.out.println("*************************************************");

	}

}

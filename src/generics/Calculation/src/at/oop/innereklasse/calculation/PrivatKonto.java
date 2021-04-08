package generics.Calculation.src.at.oop.innereklasse.calculation;

public class PrivatKonto {
	int konto_nummer;

	public PrivatKonto(int konto_nummer) {
		this.konto_nummer = konto_nummer;
	}

	public class HausHaltsplan {

		public class Ausgaben {

			public void ausgabe() {

				System.out.println("Ausgaben");

			}
		}

		public class Eingaben {

			public void eingabe() {
				System.out.println("Eingaben");
			}

		}

	}

}

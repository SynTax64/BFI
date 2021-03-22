package personalverwaltung;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Personalverwaltung {

	ArrayList<Person> personen;
	BufferedReader reader;

	public Personalverwaltung() {
		this.personen = new ArrayList<>();
		this.reader = new BufferedReader(new InputStreamReader(System.in));
	}

	public ArrayList<Person> getPersonen() {
		return personen;
	}

	public void printMenu() {
		System.out.println("****** Personalvervaltung Manager *******");
		System.out.println("1. Alle Personen ausgeben");
		System.out.println("2. Eine Person hinzufügen");
		System.out.println("3. Eine Person bearbeiten");
		System.out.println("4. Eine Person löschen");
		System.out.println("5. Beenden");
		System.out.println("*****************************************");
	}

	public void addPerson() {

		String vorname = "";
		String nachname = "";
		int alter = 0;
		String strasse = "";
		String ort = "";
		int plz = 0;

		boolean pFehler = false;
		do {
			try {
				System.out.print("Geben Sie Vorname ein: ");
				vorname = reader.readLine();
				System.out.print("Geben Sie Nachname ein: ");
				nachname = reader.readLine();
				System.out.print("Geben Sie Alter ein: ");
				alter = Integer.parseInt(reader.readLine());
				System.out.println("-----------------------------");
				pFehler = false;
			} catch (Exception e) {
				System.out.println("Die Daten wurden falsch eingegeben!");
				System.out.println("Geben Sie bitte Daten für Person noch einmal!");
				pFehler = true;
			}
		} while (pFehler);

		boolean addresseHinzu = false;
		do {
			System.out.printf("Wollen Sie auch eine Adresse für Person %s(%d) hinzufügen: (J)a / (N)ein: ",
					(vorname + " " + nachname), alter);
			String antwort = "";
			try {
				antwort = reader.readLine();
			} catch (IOException e1) {
				System.out.println("Antwort (J)a / (N)ein, wurde falsch eingegeben!");
				e1.printStackTrace();
			}

			if (antwort.equalsIgnoreCase("J") || antwort.equalsIgnoreCase("Ja")) {
				boolean aFehler = true;
				while (aFehler) {
					try {
						System.out.print("Geben Sie Straße ein: ");
						strasse = reader.readLine();
						System.out.print("Geben Sie Ort ein: ");
						ort = reader.readLine();
						System.out.print("Geben Sie PLZ ein: ");
						plz = Integer.parseInt(reader.readLine());
						aFehler = false;
					} catch (Exception e) {
						System.out.println("Die Daten wurden falsch eingegeben!");
						System.out.println("Geben Sie die Daten für Adresse noch einmal!");
						aFehler = true;
					}
				}

				this.personen.add(new Person(vorname, nachname, alter, new Adresse(strasse, ort, plz)));
				addresseHinzu = true;
			} else if (antwort.equalsIgnoreCase("N") || antwort.equalsIgnoreCase("Nein")) {
				this.personen.add(new Person(vorname, nachname, alter, new Adresse()));
				break;
			} else {
				System.out.println("Sie müssen mit j/n oder ja/nein antworten!");
			}
		} while (addresseHinzu != true);
	}

	public boolean bearbeitenPerson(String name) {
		int personIndex = isPersonIn(name);

		if (personIndex != -1) {
			String vorname = personen.get(personIndex).getVorname();
			String nachname = personen.get(personIndex).getNachname();
			int alter = personen.get(personIndex).getAlter();

			boolean fehler = false;
			do {
				try {
					System.out.print("Bearbeiten Sie Vorname: ");
					vorname = reader.readLine();

					System.out.print("Bearbeiten Sie Nachname: ");
					nachname = reader.readLine();

					System.out.print("Bearbeiten Sie Alter: ");
					alter = Integer.parseInt(reader.readLine());

					personen.get(personIndex).setVorname(vorname);
					personen.get(personIndex).setNachname(nachname);
					personen.get(personIndex).setAlter(alter);
				} catch (Exception e) {
					fehler = true;
					System.out.println("Etwas ist schief gegangen. Bitte geben Sie Daten nochmal");
				}
			} while (fehler);
			return true;
		} else {
			System.out.printf("Die Person mit dem Name \"%s\" nicht existiert.\n", name);
		}
		return false;
	}

	public boolean personLoeschen(String name) {
		int personIndex = isPersonIn(name);
		if (getPersonen().isEmpty()) {
			System.out.println("Die Liste ist leer!");
		} else {
			if (personIndex != -1) {
				Person rPerson = personen.remove(personIndex);
				System.out.printf("Person %s $s ist erfolreich gelöscht\n", rPerson.getVorname(),
						rPerson.getNachname());
				return true;
			}
		}
		System.out.printf("Die Person mit dem Name \"%s\" nicht existiert.\n", name);
		return false;

	}

	public int isPersonIn(String name) {
		for (int i = 0; i < personen.size(); i++) {
			if (name.equals(personen.get(i).getVorname())) {
				return i;
			}
		}
		return -1;
	}

	public void printPersonenKompakt() {
		System.out.print("[");
		for (int i = 0; i < getPersonen().size(); i++) {
			String p = getPersonen().get(i).getVorname();
			System.out.print((i == (getPersonen().size() - 1)) ? p : p + ", ");
		}
		System.out.print("]\n");
	}

	public void printPersonen() {
		if (personen.size() == 0) {
			System.out.println("Der List der Personen ist leer");
		} else {
			int cPersonen = 0;
			for (Person el : personen) {
				System.out.printf("Person #%d:\n%s\n", (cPersonen + 1), el);
				cPersonen++;
			}
		}
	}

	public static void main(String[] args) {
		Personalverwaltung personalvervaltung = new Personalverwaltung();
		boolean beenden = false;
		while (!beenden) {
			personalvervaltung.printMenu();
			System.out.print("Geben Sie bitte Ihre Auswahl ein (1 - 5): ");
			int auswahl = 0;
			try {
				auswahl = Integer.parseInt(personalvervaltung.reader.readLine());
			} catch (NumberFormatException | IOException e) {
				System.out.println("Ein falscher Wert wurde eingegeben");
				continue;
			}

			switch (auswahl) {
			case 1:
				personalvervaltung.printPersonen();
				break;
			case 2:
				personalvervaltung.addPerson();
				break;
			case 3:
				System.out.println("Welche Person wollen Sie bearbeiten: ");
				personalvervaltung.printPersonenKompakt();
				System.out.print("Geben Sie Vorname ein: ");
				String cVorname = "";
				try {
					cVorname = personalvervaltung.reader.readLine();
				} catch (IOException e) {
					System.out.println("Etwas ist schief gegangen!");
					e.printStackTrace();
				}
				personalvervaltung.bearbeitenPerson(cVorname);
				break;
			case 4:
				System.out.println("Welche Person wollen Sie löschen: ");
				personalvervaltung.printPersonenKompakt();
				System.out.print("Geben Sie Vorname ein: ");
				String rVorname = "";
				try {
					rVorname = personalvervaltung.reader.readLine();
				} catch (Exception e) {
					System.out.println("Etwas ist schief gegangen!");
					e.printStackTrace();
				}
				personalvervaltung.personLoeschen(rVorname);
				break;
			case 5:
				beenden = true;
				break;
			}
		}
		try {
			personalvervaltung.reader.close();
		} catch (IOException e) {
			System.out.println("Reader wurde nicht geschlossen");
			e.printStackTrace();
		}
	}
}
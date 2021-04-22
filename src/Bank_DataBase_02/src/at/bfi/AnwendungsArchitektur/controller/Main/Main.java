package Bank_DataBase_02.src.at.bfi.AnwendungsArchitektur.controller.Main;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Bank_DataBase_02.src.at.bfi.AnwendungsArchitektur.dao.DataAccess;
import Bank_DataBase_02.src.at.bfi.AnwendungsArchitektur.dao.KundeDAOImpl;
import Bank_DataBase_02.src.at.bfi.AnwendungsArchitektur.model.Kunde;
import Bank_DataBase_02.src.at.bfi.AnwendungsArchitektur.service.KundeService;
import Bank_DataBase_02.src.at.bfi.AnwendungsArchitektur.service.KundeServiceImpl;

public class Main {
	/////////////////////////////////////////////////////////////////////////////////
	// Hier verlagere ich die Connection Setups von Datenbanken in der Klasse>
	///////////////////////////////////////////////////////////////////////////////// DataAccess
	// Ich erstelle eine Textdatei namens> jdbc.properties > sie beeinhaltet unsere
	///////////////////////////////////////////////////////////////////////////////// DB-Einstellungen
	// Ich erstelle eine Klasse namens Kunde, um daten aus DB zu speichern.
	///////////////////////////////////////////////////////////////////////////////////

	public static void main(String[] args)
			throws ClassNotFoundException, FileNotFoundException, SQLException, IOException {
		// Kunden Daten anzeigen
		usecase_01();
		usecase02();
	}

	private static void usecase02() throws ClassNotFoundException, FileNotFoundException, SQLException, IOException {
		String email = "testEmail@gmail.com";
		String password = "testpassw";

		insertKunde(email, password);
	}

	// TODO View - schicht wird später behandelt, im Moment auf Konsole als View
	// anzeigen
	private static void usecase_01() {

		List<Kunde> kundenListe = null;
		try {
			kundenListe = getKunden();
		} catch (Exception e) {

			e.printStackTrace();
		}

		for (Kunde kunde : kundenListe) {

			kunde.getKunde();
			System.out.println(kunde.getKunde());
//			System.out.println(kunde);
		}
	}

	public static List<Kunde> getKunden() throws Exception {

		KundeService service = new KundeServiceImpl();
		return service.getKunden();

	}

	public static void insertKunde(String password, String email)
			throws ClassNotFoundException, FileNotFoundException, SQLException, IOException {
		KundeService service = new KundeServiceImpl();
		service.insertKunde(password, email);
	}
}

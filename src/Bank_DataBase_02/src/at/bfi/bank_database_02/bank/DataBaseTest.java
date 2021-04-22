package Bank_DataBase_02.src.at.bfi.bank_database_02.bank;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DataBaseTest {
	/////////////////////////////////////////////////////////////////////////////////
	// Hier verlagere ich die Connection Setups von Datenbanken in der Klasse>
	///////////////////////////////////////////////////////////////////////////////// DataAccess
	// Ich erstelle eine Textdatei namens> jdbc.properties > sie beeinhaltet unsere
	///////////////////////////////////////////////////////////////////////////////// DB-Einstellungen
	// Ich erstelle eine Klasse namens Kunde, um daten aus DB zu speichern.
	///////////////////////////////////////////////////////////////////////////////////

	public static void main(String[] args) {

		List<Kunde> kundenListe = null;
		try {
			kundenListe = getKunden();
		} catch (Exception e) {

			e.printStackTrace();
		}

		for (Kunde kunde : kundenListe) {

			kunde.getKunde();
			System.out.println(kunde.getKunde());
			// System.out.println(kunde);
		}
	}

	public static List<Kunde> getKunden() throws Exception {

		Connection con = DataAccess.getConnection();
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("select id, email, password " + "from Kunde");

		List<Kunde> list = new ArrayList<Kunde>();
		while (rs.next()) {
			Kunde kunde = new Kunde();
			kunde.setId(rs.getLong("id"));
			kunde.setEmail(rs.getString("email"));
			kunde.setPassword(rs.getString("password"));
			list.add(kunde);
		}
		return list;
	}
}

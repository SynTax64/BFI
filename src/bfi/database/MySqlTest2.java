package bfi.database;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MySqlTest2 {

	public static void main(String[] args) throws Exception {
		List<Kunde> kundenListe = getKunden();
		for (Iterator iterator = kundenListe.iterator(); iterator.hasNext();) {
			Kunde kunde = (Kunde) iterator.next();
			System.out.println(kunde);
		}

	}

	public static List<Kunde> getKunden() throws Exception {
		Connection connection = DataAccess.getConnection();
		Statement statement = connection.createStatement();
		ResultSet results = statement.executeQuery("select id, email, password from Kunde");

		List<Kunde> list = new ArrayList<Kunde>();
		while (results.next()) {
			Kunde kunde = new Kunde();
			kunde.setId(results.getLong("id"));
			kunde.setEmail(results.getString("email"));
			kunde.setPassword(results.getString("password"));
			list.add(kunde);
		}
		return list;
	}

}

package bfi.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySqlTest {
	public static void main(String[] args) {
		Connection connection = null;
		Statement statement = null;
		ResultSet results = null;

		try {
			connection = DriverManager.getConnection(
					"jdbc:mysql://train01.bfi.wien:3306/jdb12?serverTimeZone=Europe/Vienna", "jdb12", "AxU777pR12");
			statement = connection.createStatement();
			results = statement.executeQuery("select * from Kunde");

			while (results.next()) {

				System.out.println(results.getString("id") + ", " + results.getString("email") + ", "
						+ results.getString("password"));
			}

			statement.close();
			results.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
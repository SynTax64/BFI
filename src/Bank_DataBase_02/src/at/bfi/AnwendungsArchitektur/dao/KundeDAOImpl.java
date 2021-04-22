package Bank_DataBase_02.src.at.bfi.AnwendungsArchitektur.dao;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.xdevapi.PreparableStatement;

import Bank_DataBase_02.src.at.bfi.AnwendungsArchitektur.model.Kunde;

public class KundeDAOImpl implements KundeDAO {

	@Override
	public List<Kunde> getKunden() throws ClassNotFoundException, FileNotFoundException, SQLException, IOException {
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

	@Override
	public void insertKunde(String email, String password)
			throws ClassNotFoundException, FileNotFoundException, SQLException, IOException {
		Connection con = DataAccess.getConnection();
		PreparedStatement stmt = con.prepareStatement("INSERT INTO Kunde(email, password) values (?, ?)");
		stmt.setString(1, email);
		stmt.setString(2, password);

		stmt.execute();

	}
}

package Bank_DataBase_02.src.at.bfi.AnwendungsArchitektur.dao.test;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import org.junit.jupiter.api.Test;

import Bank_DataBase_02.src.at.bfi.AnwendungsArchitektur.dao.KundeDAO;
import Bank_DataBase_02.src.at.bfi.AnwendungsArchitektur.dao.KundeDAOImpl;
import Bank_DataBase_02.src.at.bfi.AnwendungsArchitektur.model.Kunde;

class TestKundenDAOImpl {

	@Test
	void testGetKunde() throws ClassNotFoundException, FileNotFoundException, SQLException, IOException {
		KundeDAO kundeDAO = new KundeDAOImpl();
		List<Kunde> kunden = kundeDAO.getKunden();
		String input = kunden.get(0).getEmail();
		String expected = "davidaster@gmail.com";

		assertEquals(input, expected);
		assertNotNull(input);
	}
}
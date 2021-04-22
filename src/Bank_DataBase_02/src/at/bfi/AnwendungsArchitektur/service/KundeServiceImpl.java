package Bank_DataBase_02.src.at.bfi.AnwendungsArchitektur.service;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import Bank_DataBase_02.src.at.bfi.AnwendungsArchitektur.dao.KundeDAO;
import Bank_DataBase_02.src.at.bfi.AnwendungsArchitektur.dao.KundeDAOImpl;
import Bank_DataBase_02.src.at.bfi.AnwendungsArchitektur.model.Kunde;

public class KundeServiceImpl implements KundeService {

	@Override
	public List<Kunde> getKunden() throws ClassNotFoundException, FileNotFoundException, SQLException, IOException {
		KundeDAO kundeDAO = new KundeDAOImpl();

		return kundeDAO.getKunden();
	}

	@Override
	public void insertKunde(String email, String password)
			throws ClassNotFoundException, FileNotFoundException, SQLException, IOException {
		KundeDAO kundeDAO = new KundeDAOImpl();
		kundeDAO.insertKunde(email, password);
	}
}

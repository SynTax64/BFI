package Bank_DataBase_02.src.at.bfi.AnwendungsArchitektur.service;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import Bank_DataBase_02.src.at.bfi.AnwendungsArchitektur.model.Kunde;

public interface KundeService {
	public abstract List<Kunde> getKunden()
			throws ClassNotFoundException, FileNotFoundException, SQLException, IOException;

	public abstract void insertKunde(String email, String password)
			throws ClassNotFoundException, FileNotFoundException, SQLException, IOException;

}

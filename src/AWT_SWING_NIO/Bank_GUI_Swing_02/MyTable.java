package Bank_GUI_Swing_02;

import java.awt.Dimension;

import javax.swing.JScrollPane;
import javax.swing.JTable;

public class MyTable extends JScrollPane {

	public MyTable() throws Exception {

		Kunde kunde_0 = new Kunde(1L, "berater_1@bfi.at", "passw1");
		Kunde kunde_1 = new Kunde(1L, "berater_2@bfi.at", "passw2");
		Kunde kunde_2 = new Kunde(1L, "berater_3@bfi.at", "passw3");
		Kunde kunde_3 = new Kunde(1L, "berater_4@bfi.at", "passw4");

		Kunde[] kunden = new Kunde[4];
		kunden[0] = kunde_0;
		kunden[1] = kunde_1;
		kunden[2] = kunde_2;
		kunden[3] = kunde_3;

		// fuer table
		String[] columnNames = { "E-Mail", "Password" };
		String[][] rowData = new String[kunden.length][2];
		//
		// JTable, im Konstruktor, braucht aber keine Liste sondern
		// laut deffinition eine StringArray

		// da ich spaeter nur 2 Spalte brauche: fuer email und password

		for (int i = 0; i < kunden.length; i++) {
			rowData[i][0] = kunden[i].getEmail();
			rowData[i][1] = kunden[i].getPassword();
		}

		JTable jTabel = new JTable(rowData, columnNames);

		// Scrollbar definieren
		setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

		// Positionieren
		setPreferredSize(new Dimension(400, 100));

		// Die Tabelle den Scrollpane zuweisen:
		setViewportView(jTabel);

	}

}

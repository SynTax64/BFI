package AWT_SWING_NIO.Bank_GUI_Swing_01;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Bank {

	// for button
	public final static String ok = "OK_BUTTON";
	public final static String cancle = "CANCLE_BUTTON";

	// Thema:
	// Java AWT

	public static void main(String[] args) throws Exception {

		BankView view = new BankView();

		view.getB_ok().setActionCommand(ok);
		view.getB_cancle().setActionCommand(cancle);
		//
		// Auf Buttons Ereignisse reagieren
		// mit Anonyme Klassen

		view.getB_ok().addActionListener(l -> System.out.println("OK Button pressed!"));

		view.getB_cancle().addActionListener(l -> System.out.println("Cancle Button pressed"));

		//
		// WindowAdapter zum Schliessen des Fensters
		// in swing koennen wir folgende Methode verwenden
		// view.setDefaultCloseOperation(DISPOSE_ON_CLOSE); verwenden , siehe BankView
		// Am besten aber>
		view.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent arg0) {

				view.setVisible(false);
			}

			@Override
			public void windowClosed(WindowEvent arg0) {

				System.exit(0);
			}

		});

	}

}

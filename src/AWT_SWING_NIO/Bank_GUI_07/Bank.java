package AWT_SWING_NIO.Bank_GUI_07;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Bank {

	// for button
	public final static String ok = "OK_BUTTON";
	public final static String cancel = "cancel_BUTTON";

	// Thema:
	// Java AWT

	public static void main(String[] args) throws Exception {

		BankView view = new BankView();

		view.getB_ok().setActionCommand(ok);
		view.getB_cancel().setActionCommand(cancel);
		//
		// Auf Buttons Ereignisse reagieren
		// mit Anonyme Klassen

		view.getB_ok().addActionListener(l -> System.out.println("OK Button pressed!"));

		view.getB_cancel().addActionListener(l -> System.out.println("cancel Button pressed"));

		//

		// WindowAdapter zum Schliessen des Fensters
		view.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {

				view.dispose();
			}
		});

	}
}
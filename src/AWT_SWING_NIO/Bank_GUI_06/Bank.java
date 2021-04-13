package Bank_GUI_06;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
		view.getB_ok().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				System.out.println("Ok Button wurde gedruckt!");

			}
		});

		view.getB_cancle().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				System.out.println("Cancle Button wurde gedruckt!");

			}
		});
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

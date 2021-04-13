package AWT_SWING_NIO.Bank_GUI_03;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class BankView extends Frame {

	public BankView() {

		setLocation(10, 10);
		setSize(600, 600);
		//////////////////
		setBackground(Color.GRAY);
		setForeground(Color.black);
		setFont(new Font(Font.SANS_SERIF, Font.BOLD, 40));

		setTitle("Bank Service");
		Image image = Toolkit.getDefaultToolkit().getImage("ic_launcher.png");
		setIconImage(image);

		// WindowAdapter anstatt Listener verwenden
		// Anonyme Klasse verwenden
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {

				dispose();
			}
		});

		setVisible(true);

	}

}

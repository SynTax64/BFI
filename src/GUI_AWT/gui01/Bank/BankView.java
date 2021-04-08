package GUI_AWT.gui01.Bank;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class BankView extends Frame {

	public BankView() {
		setLocation(10, 20);
		setSize(new Dimension(600, 400));

		setBackground(Color.cyan);
		setForeground(Color.green);
		setVisible(true);

		// die Eregnisse an unseren Frame bekannt machen
		this.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
			}

			@Override
			public void windowClosed(WindowEvent e) {
				System.exit(0);
			}

		});
	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		g.draw3DRect(80, 100, 200, 200, true);
		g.drawString("Hello Java Kurs", 70, 70);
		g.setPaintMode();

	}
}

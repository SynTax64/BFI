package AWT_SWING_NIO.Bank_GUI_01;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

class BankView extends Frame {

	public BankView() {

		setLocation(10, 10);
		setSize(600, 600);
		//////////////////
		setBackground(Color.cyan);
		setForeground(Color.black);
		setFont(new Font(Font.SANS_SERIF, Font.BOLD, 40));

		setTitle("Bank Service");
		Image image = Toolkit.getDefaultToolkit().getImage("ic_launcher.png");
		setIconImage(image);

		setVisible(true);

		try {
			Thread.sleep(5000);
		}

		catch (InterruptedException e) {

			e.printStackTrace();

		}

		dispose();

	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		g.drawString("Projekt Start", 75, 125);
		g.draw3DRect(40, 40, 300, 180, true);
	}

}

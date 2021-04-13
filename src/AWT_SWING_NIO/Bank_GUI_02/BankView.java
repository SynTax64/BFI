package Bank_GUI_02;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

class BankView extends Frame implements WindowListener {

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

		setVisible(true);

		/************************************************/
		// add Window Listener
		// siehe auch WindowClosing -> Aufruf von dispose() methode
		this.addWindowListener(this);

		/************************************************/

	}

	@Override
	public void windowActivated(WindowEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowClosed(WindowEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowClosing(WindowEvent arg0) {
		dispose();

	}

	@Override
	public void windowDeactivated(WindowEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowDeiconified(WindowEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowIconified(WindowEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowOpened(WindowEvent arg0) {
		// TODO Auto-generated method stub

	}

}

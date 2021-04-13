package AWT_SWING_NIO.Bank_GUI_Swing_01;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

//swing aenderungen

class BankView extends JFrame {
	private JPanel p_login;
	private JLabel l_HeadLine;
	private JLabel l_status;
	private JLabel l_username;
	private JLabel l_password;
	private JTextField tf_username;
	private JTextField tf_password;
	private JButton b_ok;
	private JButton b_cancle;

	public BankView() {
		// Apps Spezifische Daten initialisieren
		initApp();
		///////////////////////////////////
	}

	private void initApp() {
		// View JFrame initialisieren
		// setSize(400,300);
		setPreferredSize(new Dimension(400, 300));
		setLocation(200, 200);
		//////////////////
		// setBackground(Color.red);
		setForeground(Color.black);
		setFont(new Font(Font.SANS_SERIF, Font.BOLD, 20));
		setTitle("Bank Service");
		getContentPane().setBackground(Color.red);
		// siehe auch> initialLoginPanelWithElements ->
		// p_login.setBackground(Color.BLUE);
		//////////////////
		//// image
		Image image = Toolkit.getDefaultToolkit().getImage("ic_launcher.png");
		setIconImage(image);
		////////////////////////////////////////////////////////
		// Ein Layout (Hier> BorderLayout) fuers View JFrame definieren.
		setLayout(new BorderLayout(30, 30));
		///////////////////////////////////////////////////////
		// LoginPanel und alle ihre Elemente erzeugen und initialisieren
		initialLoginPanelWithElements();
		// LoginPanel auf BorderLayout ansetzen.
		add(p_login, BorderLayout.CENTER);
		///////////////////////////////////////////////////////

		setVisible(true);

		// setDefaultCloseOperation(DISPOSE_ON_CLOSE);

	}

	private void initialLoginPanelWithElements() {
		p_login = new JPanel();
		//
		l_HeadLine = new JLabel("HeadLine");
		l_status = new JLabel("Status");
		//
		l_username = new JLabel("Username:");
		l_password = new JLabel("Password:");
		//
		tf_username = new JTextField(15);
		tf_password = new JTextField(15);
		//
		b_ok = new JButton("OK");
		b_cancle = new JButton("Cancle");
		// wenn LayoutManager eingesetzt ist, dann setPreferedsize anstatt setsize
		// b_ok.setSize(150, 25);
		b_ok.setPreferredSize(new Dimension(100, 25));
		// b_cancle.setSize(150, 25);
		b_cancle.setPreferredSize(new Dimension(100, 25));

		//
		p_login.setLayout(new GridLayout(3, 2, 30, 30));
		add(l_HeadLine, BorderLayout.NORTH);
		add(l_status, BorderLayout.SOUTH);

		//
		p_login.add(l_username);
		p_login.add(tf_username);
		p_login.add(l_password);
		p_login.add(tf_password);
		p_login.add(b_ok);
		p_login.add(b_cancle);
		//

		p_login.setBackground(Color.BLUE);
		//
		pack();
	}

	public JPanel getP_login() {
		return p_login;
	}

	public void setP_login(JPanel p_login) {
		this.p_login = p_login;
	}

	public JLabel getL_HeadLine() {
		return l_HeadLine;
	}

	public void setL_HeadLine(JLabel l_HeadLine) {
		this.l_HeadLine = l_HeadLine;
	}

	public JLabel getL_status() {
		return l_status;
	}

	public void setL_status(JLabel l_status) {
		this.l_status = l_status;
	}

	public JLabel getL_username() {
		return l_username;
	}

	public void setL_username(JLabel l_username) {
		this.l_username = l_username;
	}

	public JLabel getL_password() {
		return l_password;
	}

	public void setL_password(JLabel l_password) {
		this.l_password = l_password;
	}

	public JTextField getTf_username() {
		return tf_username;
	}

	public void setTf_username(JTextField tf_username) {
		this.tf_username = tf_username;
	}

	public JTextField getTf_password() {
		return tf_password;
	}

	public void setTf_password(JTextField tf_password) {
		this.tf_password = tf_password;
	}

	public JButton getB_ok() {
		return b_ok;
	}

	public void setB_ok(JButton b_ok) {
		this.b_ok = b_ok;
	}

	public JButton getB_cancle() {
		return b_cancle;
	}

	public void setB_cancle(JButton b_cancle) {
		this.b_cancle = b_cancle;
	}

}

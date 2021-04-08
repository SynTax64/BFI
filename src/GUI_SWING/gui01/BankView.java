package GUI_SWING.gui01;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BankView extends JFrame {

	private JPanel p_login;
	private JLabel l_username;
	private JLabel l_password;

	private JTextField tf_username;
	private JTextField tf_password;

	private JButton b_ok;
	private JButton b_close;
	private JButton b_save;
	private JButton b_reset;

	private JPanel p_headLine;
	private JPanel p_status;

	private JLabel l_headLine;
	private JLabel l_status;

	public BankView() {

		setLocation(200, 200);
		setPreferredSize(new Dimension(600, 400));

		getContentPane().setBackground(Color.cyan);

		setLayout(new BorderLayout(30, 30));

		p_login = new JPanel();
		l_username = new JLabel("Username");
		l_password = new JLabel("Password");

		tf_username = new JTextField(15);
		tf_password = new JTextField(15);

		b_ok = new JButton("OK");
		b_close = new JButton("Close");

//		b_ok.addActionListener(new ActionListener() {
//
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				String str = "Error Meldung: ";
//				l_status.setText(str + "Button Ok ist gerade gedrukt");
//				l_status.setVisible(true);
//			}
//		});

		b_close.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String str = "Error Meldung: ";

				l_status.setText(str + "Button Ok ist gerade gedrukt");
				l_status.setVisible(true);
			}
		});

		b_ok.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String username = tf_username.getText();
				String password = tf_password.getText();

				l_status.setVisible(true);
				l_status.setText("Username: " + username + ", Password: " + password);
			}
		});

		p_login.setLayout(new GridLayout(3, 2, 30, 30));
		p_login.add(l_username);
		p_login.add(tf_username);

		p_login.add(l_password);
		p_login.add(tf_password);

		p_login.add(b_ok);
		p_login.add(b_close);

		p_login.setBackground(Color.lightGray);
		add(p_login, BorderLayout.CENTER);

		p_headLine = new JPanel();
		l_headLine = new JLabel("Bank APP, Herzlich Willkommen ");

		p_headLine.add(l_headLine);
		p_headLine.setBackground(Color.YELLOW);

		add(p_headLine, BorderLayout.NORTH);

		l_status = new JLabel("Error Meldung: -----");
		add(l_status, BorderLayout.SOUTH);
		l_status.setVisible(false);

		b_save = new JButton("SAVE");
		add(b_save, BorderLayout.WEST);

		b_reset = new JButton("RESET");
		add(b_reset, BorderLayout.EAST);

		pack();
		setVisible(true);

		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});
	}
}

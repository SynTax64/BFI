package Bank_GUI_04;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Image;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class BankView extends Frame {

	private Panel p_login;
	private Label l_username;
	private Label l_password;
	private TextField tf_username;
	private TextField tf_password;
	private Button b_ok;
	private Button b_cancle;

	public BankView() {

		// Apps Spezifische Daten initialisieren
		initApp();
		///////////////////////////////////
		//
		// WindowAdapter zum Schliessen des Fensters
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {

				dispose();
			}
		});

	}

	private void initApp() {

		setSize(350, 200);
		setLocation(200, 200);
		//////////////////
		setBackground(Color.GRAY);
		setForeground(Color.black);
		setFont(new Font(Font.SANS_SERIF, Font.BOLD, 20));
		setTitle("Bank Service");

		/////////////
		// neue Elemente erzeugen und initialisieren
		p_login = new Panel();
		l_username = new Label("Username:");
		l_password = new Label("Password:");
		//
		tf_username = new TextField(15);
		tf_password = new TextField(15);
		//
		b_ok = new Button();
		b_cancle = new Button();
		//
		b_ok.setLabel("OK");
		b_cancle.setLabel("Cancle");
		//
		b_ok.setSize(150, 25);
		b_cancle.setSize(150, 25);
		//
		p_login.add(l_username);
		p_login.add(tf_username);
		p_login.add(l_password);
		p_login.add(tf_password);
		p_login.add(b_ok);
		p_login.add(b_cancle);
		//
		add(p_login);

		//// image
		Image image = Toolkit.getDefaultToolkit().getImage("ic_launcher.png");
		setIconImage(image);
		setVisible(true);

	}

	// Setters and Getters
	public Panel getP_login() {
		return p_login;
	}

	public void setP_login(Panel p_login) {
		this.p_login = p_login;
	}

	public Label getL_username() {
		return l_username;
	}

	public void setL_username(Label l_username) {
		this.l_username = l_username;
	}

	public Label getL_password() {
		return l_password;
	}

	public void setL_password(Label l_password) {
		this.l_password = l_password;
	}

	public TextField getTf_username() {
		return tf_username;
	}

	public void setTf_username(TextField tf_username) {
		this.tf_username = tf_username;
	}

	public TextField getTf_password() {
		return tf_password;
	}

	public void setTf_password(TextField tf_password) {
		this.tf_password = tf_password;
	}

	public Button getB_ok() {
		return b_ok;
	}

	public void setB_ok(Button b_ok) {
		this.b_ok = b_ok;
	}

	public Button getB_cancle() {
		return b_cancle;
	}

	public void setB_cancle(Button b_cancle) {
		this.b_cancle = b_cancle;
	}

}

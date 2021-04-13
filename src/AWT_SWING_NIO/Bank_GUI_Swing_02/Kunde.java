package AWT_SWING_NIO.Bank_GUI_Swing_02;

public class Kunde {

	private Long id;
	private String email;
	private String password;

	public Kunde(Long id, String email, String password) {
		super();
		this.id = id;
		this.email = email;
		this.password = password;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Kunde [id=" + id + ", email=" + email + ", password=" + password + "]";
	}

}

package Bank_DataBase_02.src.at.bfi.AnwendungsArchitektur.model;

public class Kunde {

	private Long id;
	private String email;
	private String password;

	///////////
	// getKunde()
	public String getKunde() {
		StringBuilder sb = new StringBuilder();
		sb.append("ID: " + id + "\t").append("eMail: " + email + "\t").append("Password: " + password);

		return sb.toString();
	}
	///////

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


public class Account {

	private String username;
	private String password;
	
	public Account(String username, String password) throws AccountException {
		this.password = password;
		if(username != null && !username.isEmpty()) {
			this.username = username;
		}
		else {
			throw new AccountException("username non valido");
		}
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}
	
	

}

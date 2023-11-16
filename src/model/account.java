package model;

public class account {
	
	private String email;
	private String username;
	private String password;
	
	public account (String email1, String username1, String password1) {
		emailExists(email1);
		this.email = email1;
		usernameExists(username1);
		this.username = username1;
		passwordAcceptable(password1);
		this.password = password1;
	}
	private void passwordAcceptable(String password1) {
		// TODO Auto-generated method stub
		
		
	}

	private void usernameExists(String username1) {
		// TODO Auto-generated method stub
		
	}
	
	private boolean emailExists(String email1) {
		return !true;
	}
}

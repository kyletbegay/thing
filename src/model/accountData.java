package model;

import java.util.HashMap;
import java.util.Map;

public class accountData {
	
	Map<String, String> accounts = new HashMap<>();
	
	
	public boolean emailIsInMap(String s) {
		return accounts.containsKey(s);
	}
	
	public void addAccount(String email, String password) {
		accounts.put(email, password);
	}
}

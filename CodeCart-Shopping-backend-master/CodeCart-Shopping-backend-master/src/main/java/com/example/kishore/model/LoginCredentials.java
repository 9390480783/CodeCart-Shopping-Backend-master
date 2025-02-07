package com.example.kishore.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoginCredentials {

	private String username;
	private String password;
	
	
	public LoginCredentials() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public LoginCredentials(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}


	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}


	@Override
	public String toString() {
		return "LoginCredentials [username=" + username + ", password=" + password + "]";
	}
	
	
	
	
	
	
}

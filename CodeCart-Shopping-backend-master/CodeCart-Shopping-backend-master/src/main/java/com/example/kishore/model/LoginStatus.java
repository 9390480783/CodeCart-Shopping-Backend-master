package com.example.kishore.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class LoginStatus {

	private String messege;
	
	private String status;
	
	
	

	public LoginStatus() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public LoginStatus(String messege, String status) {
		super();
		this.messege = messege;
		this.status = status;
	}



	public String getMessege() {
		return messege;
	}

	public void setMessege(String messege) {
		this.messege = messege;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}



	@Override
	public String toString() {
		return "LoginStatus [messege=" + messege + ", status=" + status + "]";
	}
	
	
	
	
}

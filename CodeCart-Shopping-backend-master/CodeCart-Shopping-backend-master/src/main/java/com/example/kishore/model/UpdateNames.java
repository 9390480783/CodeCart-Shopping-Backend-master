package com.example.kishore.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UpdateNames {

	private String firstname;
	
	private String lastname;
	
	

	public UpdateNames() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public UpdateNames(String firstname, String lastname) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
	}



	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}



	@Override
	public String toString() {
		return "UpdateNames [firstname=" + firstname + ", lastname=" + lastname + "]";
	}
	
	
	
	
}

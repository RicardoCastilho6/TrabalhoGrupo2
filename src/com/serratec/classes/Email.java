package com.serratec.classes;

public class Email {
	
	private long idEmail;
	private String email;
	
	public Email(long idEmail, String email) {
		this.idEmail = idEmail;
		this.email = email;
	}

	
public long getIdEmail() {
		return idEmail;
	}

		
public void setIdEmail(long idEmail) {
		this.idEmail = idEmail;
	}

	
public String getEmail() {
		return email;
	}

	
public void setEmail(String email) {
		this.email = email;
	}
	
}

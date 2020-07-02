package com.baluybs.lms.dto;
import java.io.Serializable;

public class LibLoginDTO implements Serializable{
	private String email;
	private String password;
	public LibLoginDTO() {
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
		return "LibLoginDTO [email=" + email + ", password=" + password + "]";
	}
	
}

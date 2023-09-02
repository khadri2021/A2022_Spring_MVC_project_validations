package com.khadri.spring.mvc.form;

import javax.validation.constraints.NotEmpty;

public class LoginForm {

	@NotEmpty(message = "User Name is Empty")
	private String user;
	
	@NotEmpty(message = "Password is Empty")
	private String pass;

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}
	
	
	
}

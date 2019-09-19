package com.jsftutorial.test;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class LoginBean {

	private String username;
	private String password;
	
	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public String validate() {
		String result = "";		
		if (username.equals("admin") && password.equals("root")) {
			result = "success";
		} else {
			result = "failure";
		}
		return result;
	}
	
}

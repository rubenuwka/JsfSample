package com.jsftutorial.test;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class HelloBean {
	
	private String message;

	public HelloBean() {
		 System.out.println("HelloWorld started!");
	}
	
	public String getMessage() {
		return "hola!";
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
}

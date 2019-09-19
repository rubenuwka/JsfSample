package com.jsttutorial.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Table(name ="users")
@Entity(name="user")
public class User {
	
	@Id
	private int id;
	
	@Size(min = 2, max = 50)
	private String username;

	@Size(min = 2, max = 50)
	private String password;

	@Pattern(regexp = "\\p{L}+([ \\.-]\\p{L}+)?", message = "Nombres: Wrong pattern.")
	private String names;

	@Pattern(regexp = "\\p{L}+([ \\.-]\\p{L}+)?", message = "Apellidos: Wrong pattern.")
	private String surnames;

	@Size(min = 2, max = 50)
	private String address;

	@Size(min = 15, max = 15)
	private String phoneNumber;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getNames() {
		return names;
	}

	public void setNames(String names) {
		this.names = names;
	}

	public String getSurnames() {
		return surnames;
	}

	public void setSurnames(String surnames) {
		this.surnames = surnames;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
}

package com.jsftutorial.test;

import java.io.Serializable;


import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;

import javax.inject.Inject;
import javax.inject.Named;

import com.jsftutorial.domain.User;
import com.jsftutorial.service.UserService;

@RequestScoped
@Named
public class AccountBean implements Serializable {

	private static final long serialVersionUID = 1L;
 
	@Inject
	private User user;

	@Inject
	private UserService userService;
	
	@PostConstruct
	public void init() {
		System.out.println("init account bean");
		user = new User();
		user.setNames("scot");
		user.setSurnames("tiger");
		user.setAddress("av. benavides");
		user.setPhoneNumber("9834567891");
		user.setUsername("scott");
		
		System.out.println(getUserService());
	}	
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String create() {
		for(User user : userService.getAll()) {
			System.out.println(user.getNames());
		}

		return "success";
	}
	
	public String edit() {
		int id = user.getId();
		user = userService.getById(id);
		
		return "account";
	}
	
	public String delete() {
		int id = user.getId(); 
		userService.delete(id);
		
		return "success";
	}

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

}

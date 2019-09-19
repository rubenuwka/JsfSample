package com.jsftutorial.test;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;

import com.jsttutorial.domain.User;
import com.jsttutorial.service.UserService;

@ManagedBean
@SessionScoped
@RequestScoped
public class AccountBean implements Serializable {

	private User user;

	//@ManagedProperty(value="#{userService}")
	@Inject
	private UserService userService;

	public User getUser() {
		return user;
	}
	
	@PostConstruct
	public void init() {
		System.out.println("init accountbean");
		user = new User();
		System.out.println(getUserService());
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String create() {
		/*
		for(User user : userRepository.findAll()) {
			System.out.println(user.getNames());
		}*/

		
		for(User user : userService.getAll()) {
			System.out.println(user.getNames());
		}

		return "success";
	}

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

}
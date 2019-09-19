package com.jsttutorial.service;

import java.util.List;

import javax.ejb.Stateless;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.jsttutorial.domain.User;
import com.jsttutorial.domain.UserRepository;

@Named
//@Stateless
@RequestScoped
public class UserService {
	
	public UserService() {
		
	}

	//@ManagedProperty(value="#{userRepository}")
	@Inject
	private UserRepository userRepository;

	public List<User> getAll() {
		System.out.println("service");
		return userRepository.findAll();
	}
	
	public User getById(int id) {
		return userRepository.find(id);
	}
	
	public void delete(int id) {
		userRepository.delete(id);
	}

	public UserRepository getUserRepository() {
		return userRepository;
	}

	public void setUserRepository(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
}

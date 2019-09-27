package com.jsftutorial.service;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.jsftutorial.domain.User;
import com.jsftutorial.domain.UserRepository;

@Named
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

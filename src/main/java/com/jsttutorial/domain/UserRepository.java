package com.jsttutorial.domain;

import java.util.List;

import javax.ejb.Stateless;

@Stateless
public interface UserRepository {

	public void save(User user);

	public List<User> findAll();
	
	public User find(int id);
}

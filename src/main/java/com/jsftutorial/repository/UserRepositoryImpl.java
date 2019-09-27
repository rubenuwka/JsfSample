package com.jsftutorial.repository;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.jsftutorial.domain.User;
import com.jsftutorial.domain.UserRepository;

@Named
@RequestScoped
public class UserRepositoryImpl implements UserRepository , Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName="ShoppingCart")
	private EntityManager entityManager;

	@Override
	public List<User> findAll() {
		System.out.println("repository");
		Query query = entityManager.createNamedQuery("findAll");
		List<User> list = new ArrayList<User>();

		for (Object user : query.getResultList()) {
			list.add((User)user);
		}

		return list;
	}
	

	@Override
	public User find(int id) {
		Query query = entityManager.createQuery("select from users", User.class);		
		
		return (User)query.getSingleResult();
	}
	

	@Override
	public void save(User user) {
		// TODO Auto-generated method stub

	}
	
	public void delete(int id) {
		Query query = entityManager.createQuery("delete from users where id = :id");
		query.setParameter("id", id);
		
		query.executeUpdate();
	}

	public EntityManager getEntityManager() {
		return entityManager;
	}

	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}


}

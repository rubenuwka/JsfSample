package com.jsttutorial.repository;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.jsttutorial.domain.User;
import com.jsttutorial.domain.UserRepository;

@ManagedBean
@Remote (com.jsttutorial.domain.UserRepository.class)
@Stateless
@RequestScoped
public class UserRepositoryImpl implements UserRepository , Serializable {

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
	public void save(User user) {
		// TODO Auto-generated method stub

	}

	public EntityManager getEntityManager() {
		return entityManager;
	}

	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

}

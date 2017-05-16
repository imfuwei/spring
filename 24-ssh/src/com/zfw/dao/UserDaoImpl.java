package com.zfw.dao;

import org.hibernate.SessionFactory;

import com.zfw.beans.User;

public class UserDaoImpl implements IUserDao{
	

	private SessionFactory sessionFactory;
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	@Override
	public void insertUser(User user) {
		sessionFactory.getCurrentSession().save(user);
	}

	@Override
	public void removeUser(User user) {
		sessionFactory.getCurrentSession().delete(user);
	}

	@Override
	public void updateUser(User user) {
		sessionFactory.getCurrentSession().update(user);
	}

	@Override
	public User selectUser(int id) {
		User user = sessionFactory.getCurrentSession().load(User.class, id);
		return user;
	}

}

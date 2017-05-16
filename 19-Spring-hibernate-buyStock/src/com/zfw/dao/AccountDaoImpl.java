package com.zfw.dao;

import org.hibernate.SessionFactory;

import com.zfw.beans.Account;

public class AccountDaoImpl implements IAccountDao{
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	private SessionFactory sessionFactory;
	@Override
	public void insertAccount(String aname, double money) {
		sessionFactory.getCurrentSession().save(new Account(aname, money));
	}

	@Override
	public void updateAccount(String aname, double money, boolean isBuy) {
		Account account = new Account(aname, money);
		account.setAid(1);
		sessionFactory.getCurrentSession().update(account);
	}
}

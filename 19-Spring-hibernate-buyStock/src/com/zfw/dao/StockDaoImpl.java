package com.zfw.dao;

import org.hibernate.SessionFactory;

import com.zfw.beans.Stock;

public class StockDaoImpl implements IStockDao {
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	private SessionFactory sessionFactory;

	@Override
	public void insertStock(String sname, int amount) {
		Stock stock=new Stock(sname, amount);
		sessionFactory.getCurrentSession().save(stock);
	}

	@Override
	public void updateStock(String sname, int amount, boolean isBuy) {
		Stock stock = new Stock(sname, amount);
		stock.setSid(1);
		sessionFactory.getCurrentSession().update(stock);
	}

}

package com.zfw.service;

import com.zfw.dao.IAccountDao;
import com.zfw.dao.IStockDao;

public class StockProcessServiceImpl implements IStockProcessService {

	private IAccountDao accountDao;
	private IStockDao stockDao;

	public void setAccountDao(IAccountDao accountDao) {
		this.accountDao = accountDao;
	}

	public void setStockDao(IStockDao stockDao) {
		this.stockDao = stockDao;
	}

	@Override
	public void openAccount(String aname, double money) {
		accountDao.insertAccount(aname, money);
	}

	@Override
	public void openStock(String sname, int amount) {
		stockDao.insertStock(sname, amount);
	}

	@Override
	public void buyStock(String aname, double money, String sname, int amount)
			throws Exception {
		boolean isBuy = true;
		accountDao.updateAccount(aname, money, isBuy);
		stockDao.updateStock(sname, amount, isBuy);
	}

}

package com.zfw.service;

import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

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
	@Transactional(isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRED)
	public void openAccount(String aname, double money) {
		accountDao.insertAccount(aname, money);

	}

	@Override
	@Transactional(isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRED)
	public void openStock(String sname, int amount) {
		stockDao.insertStock(sname, amount);
	}

	@Override
	@Transactional(isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRED, rollbackFor = StockException.class)
	public void buyStock(String aname, double money, String sname, int amount)
			throws Exception {
		boolean isBuy = true;
		accountDao.updateAccount(aname, money, isBuy);

		// 抛出异常时，异常后面的代码就不会再执行，
		// eclipce会检查到，后面写的代码都受eclipce检查不通过，写这句话，意思就是骗eclipce,让它把代码检查通过，（但是还是不会执行）
		if (1 == 1) {
			/* 此处抛出异常了之后，但上面的update执行了，下面的没执行，导致钱付了，事没成，可以使用事务解决 */
			throw new StockException("购买股票异常");
		}
		stockDao.updateStock(sname, amount, isBuy);
	}

}

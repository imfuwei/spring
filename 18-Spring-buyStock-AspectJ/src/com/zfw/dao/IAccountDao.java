package com.zfw.dao;

public interface IAccountDao {

	void insertAccount(String aname, double money);

	void updateAccount(String aname, double money, boolean isBuy);


}

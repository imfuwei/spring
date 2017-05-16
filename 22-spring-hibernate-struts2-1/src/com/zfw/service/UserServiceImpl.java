package com.zfw.service;

import com.zfw.beans.User;
import com.zfw.dao.IUserDao;

public class UserServiceImpl implements IUserService {

	private IUserDao userDao;

	public void setUserDao(IUserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public void addUser(User user) {
		userDao.insertUser(user);
	}

	@Override
	public void removeUser(User user) {
		userDao.removeUser(user);
	}

	@Override
	public void motifyUser(User user) {
		userDao.updateUser(user);
	}

	@Override
	public User findUser(int id) {
		return userDao.selectUser(id);
	}

}

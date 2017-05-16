package com.zfw.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.zfw.beans.User;
import com.zfw.dao.IUserDao;

@Service(value = "service")
public class UserServiceImpl implements IUserService {
	@Autowired
	@Qualifier(value = "userDaoImpl")
	private IUserDao userDao;

	public void setUserDao(IUserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	@Transactional
	public void addUser(User user) {
		userDao.insertUser(user);
	}

	@Override
	@Transactional
	public void removeUser(User user) {
		userDao.removeUser(user);
	}

	@Override
	@Transactional(readOnly=true,isolation=Isolation.DEFAULT,propagation=Propagation.REQUIRED)
	public void motifyUser(User user) {
		userDao.updateUser(user);
	}

	@Override
	@Transactional(readOnly=true,isolation=Isolation.DEFAULT,propagation=Propagation.REQUIRED)
	public User findUser(int id) {
		return userDao.selectUser(id);
	}

}

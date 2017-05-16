package com.zfw.dao;

import com.zfw.beans.User;

public interface IUserDao {

	void insertUser(User user);

	void removeUser(User user);

	void updateUser(User user);

	User selectUser(int id);

}

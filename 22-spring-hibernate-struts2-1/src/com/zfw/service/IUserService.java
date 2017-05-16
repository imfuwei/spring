package com.zfw.service;

import com.zfw.beans.User;


public interface IUserService {
	void addUser(User user);
	void removeUser(User user);
	void motifyUser(User user);
	User findUser(int id);
}

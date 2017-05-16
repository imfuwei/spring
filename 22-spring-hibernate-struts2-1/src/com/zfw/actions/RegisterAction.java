package com.zfw.actions;

import com.opensymphony.xwork2.ActionSupport;
import com.zfw.beans.User;
import com.zfw.service.IUserService;

public class RegisterAction extends ActionSupport{
	public IUserService getUserServiceImpl() {
		return userServiceImpl;
	}

	public void setUserServiceImpl(IUserService userServiceImpl) {
		this.userServiceImpl = userServiceImpl;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	private String username;
	private String password;
	private IUserService userServiceImpl;
	
	@Override
	public String execute() throws Exception {
		User user=new User(username, password);
		userServiceImpl.addUser(user);
		return SUCCESS;
	}
}

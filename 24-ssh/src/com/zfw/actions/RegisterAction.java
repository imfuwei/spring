package com.zfw.actions;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.zfw.beans.User;
import com.zfw.service.IUserService;

public class RegisterAction extends ActionSupport{
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public IUserService getUserServiceImpl() {
		return userServiceImpl;
	}

	public void setUserServiceImpl(IUserService userServiceImpl) {
		this.userServiceImpl = userServiceImpl;
	}

	private int id;
	private IUserService userServiceImpl;
	
	@Override
	public String execute() throws Exception {
		User user = userServiceImpl.findUser(id);
		//当将事务织入到 Service层后，在 Dao层通过 load()等具有延迟加载功能的方法加载实
		//体时，会出现异常。
		System.out.println(user.getUsername());
		ActionContext.getContext().put("username", user.getUsername());
		return SUCCESS;
	}
}

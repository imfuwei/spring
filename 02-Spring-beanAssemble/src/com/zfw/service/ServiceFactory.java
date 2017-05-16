package com.zfw.service;

public class ServiceFactory {
	public IUserService getUserservice() {
		return new UserServiceImp();
	}
	public static IUserService getUserservice_static(){
		return new UserServiceImp();
	}
}

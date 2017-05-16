package com.zfw.aop4.ThrowsAdvice;


public class SomeServiceImp implements ISomeService {

	//目标方法
	@Override
	public boolean check(String username, String password) throws UserException {
		if (!"zfw".equals(username)) {
			throw new UsernameException("用户名不正确");
		}
		if (!"111".equals(password)) {
			throw new PasswordException("密码不正确");
		}
		return true;
	}

	
}

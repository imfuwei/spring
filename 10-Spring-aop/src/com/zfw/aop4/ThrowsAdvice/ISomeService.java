package com.zfw.aop4.ThrowsAdvice;

public interface ISomeService {
	boolean check(String username, String password) throws UserException;
}

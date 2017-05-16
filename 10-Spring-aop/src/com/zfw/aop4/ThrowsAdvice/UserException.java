package com.zfw.aop4.ThrowsAdvice;

//受查异常
public class UserException extends Exception {

	public UserException() {
		super();
	}

	public UserException(String message) {
		super(message);
	}

}

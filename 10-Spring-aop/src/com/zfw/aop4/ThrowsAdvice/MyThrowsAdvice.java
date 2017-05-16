package com.zfw.aop4.ThrowsAdvice;

import org.springframework.aop.ThrowsAdvice;
//异常通知
public class MyThrowsAdvice implements ThrowsAdvice {
	//在ThrowsAdvice接口中注释可以找到
	
	//若发生UsernameException,则该方法自动 被调用执行
	public void afterThrowing(UsernameException ex){
		System.out.println("发生用户名异常，ex= "+ex);
	}
	//若发生UsernameException,则该方法自动 被调用执行
	public void afterThrowing(PasswordException ex){
		System.out.println("发生密码异常，ex= "+ex);
	}
}

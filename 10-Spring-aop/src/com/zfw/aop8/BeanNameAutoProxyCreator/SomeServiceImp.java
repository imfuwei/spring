package com.zfw.aop8.BeanNameAutoProxyCreator;


public class SomeServiceImp implements ISomeService {

	@Override
	public void doSome() {
		System.out.println("执行doSome()");
	}

	@Override
	public String doSecond() {
		System.out.println("doSecond");
		return "china";
	}

	@Override
	public void doThird() {
		System.out.println("doThird");
	}
	
}

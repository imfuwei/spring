package com.zfw.aop9.cglibhaveinterface;


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
	
}

package com.zfw.aop9.cglib;


public class SomeService{

	public void doSome() {
		System.out.println("执行doSome()");
	}

	public String doSecond() {
		System.out.println("doSecond");
		return "china";
	}
	
}

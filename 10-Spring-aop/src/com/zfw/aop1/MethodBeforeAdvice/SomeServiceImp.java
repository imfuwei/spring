package com.zfw.aop1.MethodBeforeAdvice;


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

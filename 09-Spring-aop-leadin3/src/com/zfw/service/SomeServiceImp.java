package com.zfw.service;


public class SomeServiceImp implements ISomeService {

	/*使用代理不让他们交叉在一起*/
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

package com.zfw.aspectj01;


public class SomeServiceImp implements ISomeService {

	@Override
	public void doSome() {
		System.out.println("执行doSome()");
	}

	@Override
	public String doSecond() {
		System.out.println("doSecond()");
		return "china";
	}

	@Override
	public String doThird() {
		System.out.println("doThird()");
		return "aaabbbccc";
	}

	@Override
	public void doFour() {
		System.out.println("doFour()  "+4/1);
	}
	
}

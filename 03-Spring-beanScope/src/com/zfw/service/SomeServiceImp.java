package com.zfw.service;

public class SomeServiceImp implements ISomeService {
	
	public SomeServiceImp() {
		System.out.println("执行了无参构造器，说明此时对象已经创建好了");
	}

	@Override
	public void dosome() {
		System.out.println("dosome()");
	}
}

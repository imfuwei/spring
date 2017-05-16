package com.zfw.service;

public class SomeServiceImp implements ISomeService {

	/*这样会将系统级服务和主业务逻辑交插在一起，代码冗余，可以使用工具类来减少冗余*/
	@Override
	public void doSome() {
		System.out.println("事务操作");
		System.out.println("执行doSome()");
		System.out.println("记录日志");
	}

	@Override
	public String doSecond() {
		System.out.println("事务操作");
		System.out.println("doSecond");
		System.out.println("记录日志");
		return "china";
	}
	
}

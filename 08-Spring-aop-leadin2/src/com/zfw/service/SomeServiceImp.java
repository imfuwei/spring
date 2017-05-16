package com.zfw.service;

import com.zfw.utils.SomeUtils;

public class SomeServiceImp implements ISomeService {

	/*使用工具类来减少冗余,但这样系统级服务就和主业务逻辑交叉在了一起，可以使用代理不让他们交叉在一起*/
	@Override
	public void doSome() {
		SomeUtils.doTransacation();
		System.out.println("执行doSome()");
		SomeUtils.doLog();
	}

	@Override
	public String doSecond() {
		SomeUtils.doTransacation();
		System.out.println("doSecond");
		SomeUtils.doLog();
		return "china";
	}
	
}

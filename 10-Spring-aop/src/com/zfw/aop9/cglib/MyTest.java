package com.zfw.aop9.cglib;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
	@Test
	//如果没接口，默认使用cglib动态代理
	public void testaop() {
		String configLocation="com/zfw/aop9/cglib/applicationContext.xml";
		ApplicationContext ac = new ClassPathXmlApplicationContext(configLocation);
		SomeService someService = (SomeService) ac.getBean("serviceProxy");
		someService.doSome();
		String doSecond = someService.doSecond();
		System.out.println(doSecond);
	}
}

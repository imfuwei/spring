package com.zfw.aop3.MethodInterceptor;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
	@Test
	public void testaop() {
		String configLocation="com/zfw/aop3/MethodInterceptor/applicationContext.xml";
		ApplicationContext ac = new ClassPathXmlApplicationContext(configLocation);
		ISomeService someService = (ISomeService) ac.getBean("serviceProxy");
		someService.doSome();
		String doSecond = someService.doSecond();
		System.out.println(doSecond);
	}
}

package com.zfw.aop9.cglibhaveinterface;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
	//强制在有接口的目标类中，使用cglib动态代理
	@Test
	public void testaop() {
		String configLocation="com/zfw/aop2/AfterReturningAdvice/applicationContext.xml";
		ApplicationContext ac = new ClassPathXmlApplicationContext(configLocation);
		ISomeService someService = (ISomeService) ac.getBean("serviceProxy");
		someService.doSome();
		String doSecond = someService.doSecond();
		System.out.println(doSecond);
	}
}

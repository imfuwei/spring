package com.zfw.aop6.AdvisorRegexpMethod;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
	//顾问意思就是增强通知的特定方法，而通知是所有方法都增强，他们都是切面
	@Test
	public void testaop() {
		String configLocation="com/zfw/aop6/AdvisorRegexpMethod/applicationContext.xml";
		ApplicationContext ac = new ClassPathXmlApplicationContext(configLocation);
		ISomeService someService = (ISomeService) ac.getBean("serviceProxy");
		someService.doSome();
		System.out.println();
		someService.doSecond();
		System.out.println();
		someService.doThird();
	}
}

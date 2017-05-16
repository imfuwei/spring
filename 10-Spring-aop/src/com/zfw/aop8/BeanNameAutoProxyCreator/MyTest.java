package com.zfw.aop8.BeanNameAutoProxyCreator;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
	//顾问意思就是增强通知的特定方法，而通知是所有方法都增强，他们都是切面
	@Test
	public void testaop() {
		String configLocation="com/zfw/aop8/BeanNameAutoProxyCreator/applicationContext.xml";
		ApplicationContext ac = new ClassPathXmlApplicationContext(configLocation);
		ISomeService someService = (ISomeService) ac.getBean("someService1");
		ISomeService someService2 = (ISomeService) ac.getBean("someService2");
		someService.doSome();
		System.out.println();
		someService.doSecond();
		System.out.println();
		someService.doThird();
		
		System.out.println();
		someService2.doSome();
		System.out.println();
		someService2.doSecond();
		System.out.println();
		someService2.doThird();
	}
}

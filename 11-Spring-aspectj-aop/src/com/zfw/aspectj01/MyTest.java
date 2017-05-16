package com.zfw.aspectj01;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
	@Test
	public void testaop() {
		String configLocation="com/zfw/aspectj01/applicationContext.xml";
		ApplicationContext ac = new ClassPathXmlApplicationContext(configLocation);
		ISomeService someService = (ISomeService) ac.getBean("someService");
		someService.doSome();
		System.out.println("---------");
		String doSecond = someService.doSecond();
		System.out.println("---------");
		String third = someService.doThird();
		System.out.println(third);
		
		System.out.println("---------");
		someService.doFour();
		
		
	}
}

package com.zfw.service;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
	@Test
	public void test02() {
		String configLocation = "applicationContext.xml";
		ApplicationContext ac = new ClassPathXmlApplicationContext(
				configLocation);
		ISomeService someService = (ISomeService) ac.getBean("someService");
		ISomeService someService2 = (ISomeService) ac.getBean("someService");
		System.out.println(someService);
		System.out.println(someService2);
	}
}

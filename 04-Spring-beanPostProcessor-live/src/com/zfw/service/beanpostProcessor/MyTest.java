package com.zfw.service.beanpostProcessor;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
	@Test
	public void test02() {
		String configLocation = "com/zfw/service/beanpostProcessor/applicationContext.xml";
		ApplicationContext ac = new ClassPathXmlApplicationContext(
				configLocation);
		ISomeService someService1 = (ISomeService) ac.getBean("someService1");
		System.out.println(someService1.dosome());
		System.out.println(someService1.doother());
		ISomeService someService2 = (ISomeService) ac.getBean("someService2");
		System.out.println(someService2.dosome());
		System.out.println(someService2.doother());
	}
}

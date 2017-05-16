package com.zfw.service.livezhouqi;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
	@Test
	public void test02() {
		String configLocation = "com/zfw/service/livezhouqi/applicationContext.xml";
		ApplicationContext ac = new ClassPathXmlApplicationContext(
				configLocation);
		ISomeService someService1 = (ISomeService) ac.getBean("someService");
		System.out.println(someService1.dosome());
		((ClassPathXmlApplicationContext)ac).close();
	}
}

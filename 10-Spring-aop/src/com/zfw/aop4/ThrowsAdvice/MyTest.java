package com.zfw.aop4.ThrowsAdvice;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
	@Test
	public void testaop(){
		String configLocation = "com/zfw/aop4/ThrowsAdvice/applicationContext.xml";
		ApplicationContext ac = new ClassPathXmlApplicationContext(
				configLocation);
		ISomeService someService = (ISomeService) ac.getBean("serviceProxy");
		try {
			someService.check("zfw", "11");
		} catch (UserException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

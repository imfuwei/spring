package com.zfw.di03.jihe;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
	@Test
	public void test() {
		String configLocation="com/zfw/di03/jihe/applicationContext.xml";
		ApplicationContext ac = new ClassPathXmlApplicationContext(configLocation);
		Some some = (Some) ac.getBean("some");
		System.out.println(some);
		
	}
}

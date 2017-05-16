package com.zfw.di02.gouzao;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
	@Test
	public void test() {
		String configLocation="com/zfw/di02/gouzao/applicationContext.xml";
		ApplicationContext ac = new ClassPathXmlApplicationContext(configLocation);
		Student student = (Student) ac.getBean("student");
		System.out.println(student);
	}
}

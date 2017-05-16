package com.zfw.di02.yushuxing;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
	@Test
	public void test(){
		String configLocation="com/zfw/di02/yushuxing/applicationContext.xml";
		ApplicationContext ac = new ClassPathXmlApplicationContext(configLocation);
		Student student = (Student) ac.getBean("myStudent");
		System.out.println(student);
		
	} 
}

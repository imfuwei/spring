package com.zfw.di03.dingzhilive;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
	@Test
	public void test(){
		String configLocation="com/zfw/di03/dingzhilive/applicationContext.xml";
		ApplicationContext ac = new ClassPathXmlApplicationContext(configLocation);
		Student student = (Student) ac.getBean("myStudent");
		System.out.println(student);
		((ClassPathXmlApplicationContext)ac).close();
	} 
}

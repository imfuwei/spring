package com.zfw.di08.manycfg2;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
	@Test
	public void test() {
		String configLocation="com/zfw/di08/manycfg2/applicationContext.xml";
		ApplicationContext ac = new ClassPathXmlApplicationContext(
				configLocation);
		Teacher teacher = (Teacher) ac.getBean("teacher");
		Student student = (Student) ac.getBean("student");
		System.out.println(teacher);
		System.out.println(student);
	}
}

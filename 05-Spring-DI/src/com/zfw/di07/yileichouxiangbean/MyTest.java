package com.zfw.di07.yileichouxiangbean;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
	@Test
	public void test() {
		String configLocation = "com/zfw/di07/yileichouxiangbean/applicationContext.xml";
		ApplicationContext ac = new ClassPathXmlApplicationContext(
				configLocation);
		Teacher teacher = (Teacher) ac.getBean("teacher");
		Student student = (Student) ac.getBean("student");
		System.out.println(teacher);
		System.out.println(student);
	}
}

package com.zfw.di06.tongleichouxiangbean;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
	@Test
	public void test() {
		String configLocation = "com/zfw/di06/tongleichouxiangbean/applicationContext.xml";
		ApplicationContext ac = new ClassPathXmlApplicationContext(
				configLocation);
		Student student1 = (Student) ac.getBean("student1");
		Student student2 = (Student) ac.getBean("student2");
		System.out.println(student1);
		System.out.println(student2);
	}
}

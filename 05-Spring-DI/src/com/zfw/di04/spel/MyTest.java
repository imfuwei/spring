package com.zfw.di04.spel;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
	@Test
	public void test() {
		String configLocation = "com/zfw/di04/spel/applicationContext.xml";
		ApplicationContext ac = new ClassPathXmlApplicationContext(
				configLocation);
		Person person = (Person) ac.getBean("person");
		System.out.println(person);
		Student student = (Student) ac.getBean("student");
		System.out.println(student);
	}
}

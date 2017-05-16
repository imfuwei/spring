
package com.zfw.di04.javaconfig;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
	@Test
	public void test(){
		String configLocation="com/zfw/di04/javaconfig/applicationContext.xml";
		ApplicationContext ac = new ClassPathXmlApplicationContext(configLocation);
		Student student = (Student) ac.getBean("myStudent");
		System.out.println(student);
	} 
}

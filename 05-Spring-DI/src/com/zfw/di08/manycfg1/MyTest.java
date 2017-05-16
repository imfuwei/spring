package com.zfw.di08.manycfg1;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
	@Test
	public void test() {
		/*把多配置文件写成数组，装配bean,这多个配置文件之间的关系是平等的*/
		String[] configLocation = { "com/zfw/di08/manycfg1/spring-base.xml",
				"com/zfw/di08/manycfg1/spring-teacher.xml",
				"com/zfw/di08/manycfg1/spring-student.xml"};
		ApplicationContext ac = new ClassPathXmlApplicationContext(
				configLocation);
		Teacher teacher = (Teacher) ac.getBean("teacher");
		Student student = (Student) ac.getBean("student");
		System.out.println(teacher);
		System.out.println(student);
	}
}

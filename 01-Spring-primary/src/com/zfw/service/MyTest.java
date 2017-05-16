package com.zfw.service;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class MyTest {
	// 传统创建对象，创建的对象耦合到当前类
	@Test
	public void test01() {
		ISomeService someService = new SomeServiceImp();
		someService.dosome();
	}

	// 使用Spring容器创建对象，没有出现在创建的类，只出现了接口
	// 使用ClassPathXmlApplicationContext加载Spring容器,直接在容器中创建了对象

	// ClassPathXmlApplicationContext是在类层级下找配置文件，就是在src下找
	@Test
	public void test02() {
		String configLocation = "applicationContext.xml";
		ApplicationContext ac = new ClassPathXmlApplicationContext(
				configLocation);
		ISomeService someService = (ISomeService) ac.getBean("someService");
		someService.dosome();
	}

	// 使用FileSystemXmlApplicationContext是在项目层级下找配置文件，就是在src同一级目录下开始找的
	// 还可以在指定磁盘目录下找配置文件
	@Test
	public void test03() {
		String configLocation = "src/applicationContext.xml";
		ApplicationContext ac = new FileSystemXmlApplicationContext(
				configLocation);
		ISomeService someService = (ISomeService) ac.getBean("someService");
		someService.dosome();
	}

	// 上面是通过ApplicationContext来加载配置文件，充当容器的角色
	// 还可以用beanFactory来充当容器的角色，是applicationContext接口的父类

	@Test
	public void test04() {
		String configLocation = "applicationContext.xml";
		BeanFactory bf = new XmlBeanFactory(new ClassPathResource(
				configLocation));
		ISomeService someService = (ISomeService) bf.getBean("someService");
		someService.dosome();
	}

	// 用beanFactory和ApplicationContext两种来充当容器的区别，applicationContext在一加载配置文件时，就创建好了对象放在容器中。
	// 而beanFactory则是在容器中的bean时来加载容器
	@Test
	public void test05() {
		String configLocation = "applicationContext.xml";
		ApplicationContext ac = new ClassPathXmlApplicationContext(
				configLocation);
	}

	@Test
	public void test06() {
		String configLocation = "applicationContext.xml";
		BeanFactory bf = new XmlBeanFactory(new ClassPathResource(
				configLocation));
	}

}

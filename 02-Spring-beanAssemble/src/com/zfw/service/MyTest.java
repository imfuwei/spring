package com.zfw.service;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class MyTest {
	
	/*传统方法装配bean*/
	@Test
	public void test01() {
		String cfgLocation = "applicationContext.xml";
		ApplicationContext ac = new ClassPathXmlApplicationContext(cfgLocation);
		IUserService userServiceImp = (IUserService) ac.getBean("userServiceImp");
		userServiceImp.dosome();
		userServiceImp.doother();
	}
	/*动态工厂bean,通过容器把工厂当做bean来创建工厂对象，然后由工厂对象来创建bean对象，这个目标bean是由程序手动创建*/
	//这样做的缺点是，不仅工厂类与目标类耦合到了一起，测试类与工厂类也耦合到了一起。
	@Test
	public void test02(){
		String cfgLocation = "applicationContext.xml";
		ApplicationContext ac = new ClassPathXmlApplicationContext(cfgLocation);
		ServiceFactory serviceFactory= (ServiceFactory) ac.getBean("ServiceFactory");
		IUserService userservice = serviceFactory.getUserservice();
		userservice.dosome();
		userservice.doother();
	}
	/*使用Spring动态工厂bean,由工厂bean的工厂方法来创建目标bean,是由容器创建的*/
	@Test
	public void test03(){
		String configLocation="applicationContext.xml";
		ApplicationContext ac=new ClassPathXmlApplicationContext(configLocation);
		IUserService userServiceImp_Factory = (IUserService) ac.getBean("userServiceImp_Factory");
		userServiceImp_Factory.dosome();
		userServiceImp_Factory.doother();
	}

	/* 通过静态工厂bean的方法来创建目标对象，由于静态方法不需要类的实例化，所以直接通过容器的工厂方法来创建目标bean */
	@Test
	public void test04(){
		String configLocation="applicationContext.xml";
		ApplicationContext ac = new ClassPathXmlApplicationContext(configLocation);
		IUserService userServiceImp_Factory_Static=(IUserService) ac.getBean("userServiceImp_Factory_Static");
		userServiceImp_Factory_Static.dosome();
		userServiceImp_Factory_Static.doother();
	}
	
}

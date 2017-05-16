package com.zfw.service.dingzhi;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
	@Test
	public void test02() {
		String configLocation = "com/zfw/service/dingzhi/applicationContext.xml";
		//ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext(configLocation);//直接创建实现类对象
		ApplicationContext ac = new ClassPathXmlApplicationContext(
				configLocation);
		ISomeService someService1 = (ISomeService) ac.getBean("someService1");
		System.out.println(someService1.dosome());
		System.out.println(someService1.doother());
		//若要看到销毁方法的执行，有两个条件，一个是在容器中bean为单例模式，即singleton,另一个是把容器关闭
		
		//ApplicationContext接口中没有close方法，但是接口的实现类中有此方法，可以将ApplicationContext强转成实现类对象，或者直接创建实现类对象
		((ClassPathXmlApplicationContext)ac).close();//强转成实现类对象
		
		
	}
}

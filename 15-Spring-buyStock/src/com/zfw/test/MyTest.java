package com.zfw.test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zfw.service.IStockProcessService;

public class MyTest {
	private static IStockProcessService service;

	@Before
	public void before(){
		String configLocation="applicationContext.xml";
		ApplicationContext ac = new ClassPathXmlApplicationContext(configLocation);
		service = (IStockProcessService) ac.getBean("stockProcessService");
	}
	@Test
	public void testOpen(){
		service.openAccount("张三", 10000);
		service.openStock("bangbang", 5);
	}
	@Test
	public void testBuy() throws Exception{
		/*抛出异常给jvm，jvm会认为这是错误，会报出测试不能过红条，而手动捕获,jvm会通过*/
		service.buyStock("张三", 5000, "bangbang", 3);
	}
}

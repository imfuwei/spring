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
		service = (IStockProcessService) ac.getBean("stockServiceProxy");//使用代理
	}
	@Test
	public void testBuy() throws Exception{
		service.buyStock("张三", 5000, "bangbang", 3);
	}
}

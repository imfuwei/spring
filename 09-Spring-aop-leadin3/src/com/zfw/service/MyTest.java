package com.zfw.service;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import org.junit.Test;

import com.zfw.utils.SomeUtils;

public class MyTest {
	@Test
	public void test() {
		final ISomeService service = new SomeServiceImp();
		ISomeService service1 = (ISomeService) Proxy.newProxyInstance(service
													.getClass().getClassLoader(), service.getClass()
													.getInterfaces(), new InvocationHandler() {
														@Override
														public Object invoke(Object proxy, Method method, Object[] args)
																throws Throwable {
															SomeUtils.doTransacation();
															Object result = method.invoke(service, args);
															SomeUtils.doLog();
															return result;
														}
													});

		service1.doSome();
		service1.doSecond();

	}
}

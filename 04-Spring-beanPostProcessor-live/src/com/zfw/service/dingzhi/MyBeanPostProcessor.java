package com.zfw.service.dingzhi;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcessor implements BeanPostProcessor {

	/**
	 * bean后处理器 在当前bean属性初始化之前执行 bean：当前要处理的bean beanName:当前要处理的bean的id
	 * 
	 * 在当前bean属性初始化之后执行
	 */
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName)
			throws BeansException {
		System.out.println("bean初始化之     前    执行");

		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(final Object bean,
			String beanName) throws BeansException {
		System.out.println("bean初始化之     后    执行");
		if ("someService1".equals(beanName)) {
			
			//使用代理增强对象的方法，然后再返回
			Object bean1 = Proxy.newProxyInstance(bean.getClass().getClassLoader(), bean
								.getClass().getInterfaces(), new InvocationHandler() {
										@Override
										public Object invoke(Object proxy, Method method, Object[] args)
										throws Throwable {
											//增强对象所有方法
											/*Object invoke = method.invoke(bean, args);
											return invoke.toString().toUpperCase();*/
											if (method.getName().equals("doother")) {
												//增强对象指定方法
												Object invoke = method.invoke(bean, args);
												return invoke.toString().toUpperCase();
												}
											return method.invoke(bean, args);
											}
										});
			return bean1;
		}
		return bean;
	}

}

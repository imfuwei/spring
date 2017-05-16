package com.zfw.service.livezhouqi;

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
		System.out.println("5:bean初始化之     前    执行，bean后处理器");

		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(final Object bean,
			String beanName) throws BeansException {
		System.out.println("8:bean初始化之     后    执行，bean后处理器");
		return bean;
	}

}

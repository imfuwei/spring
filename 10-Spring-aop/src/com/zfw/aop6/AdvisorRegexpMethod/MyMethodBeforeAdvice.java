package com.zfw.aop6.AdvisorRegexpMethod;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

//前置通知,需要实现MethodBeforeAdvice接口
public class MyMethodBeforeAdvice implements MethodBeforeAdvice {
	// 该方法在目标方法之前执行
	//method:目标方法
	//args:目标方法的参数
	//target:目标对象
	@Override
	public void before(Method method, Object[] args, Object target)
			throws Throwable {
		System.out.println("目标方法执行之前：对目标对象增强的代码，写在这里面");
	}
}

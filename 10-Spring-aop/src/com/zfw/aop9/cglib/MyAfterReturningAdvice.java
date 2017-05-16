package com.zfw.aop9.cglib;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;

//后置通知,需要实现AfterReturningAdvice接口,虽然可以获取到目标方法的返回值，但不能改变返回值
public class MyAfterReturningAdvice implements AfterReturningAdvice {

	// 该方法在目标方法之后执行
	//returnValue:目标方法的返回值
	// method:目标方法
	// args:目标方法的参数
	// target:目标对象
	@Override
	public void afterReturning(Object returnValue, Method method,
			Object[] args, Object target) throws Throwable {
		System.out.println("目标方法执行之后"+returnValue);
		
		if (returnValue!=null) {
			returnValue = ((String) returnValue).toUpperCase();
		}
	}
}

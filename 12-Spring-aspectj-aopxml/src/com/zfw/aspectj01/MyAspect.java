package com.zfw.aspectj01;

import java.lang.reflect.Method;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

//定义POJO类为切面
public class MyAspect {
	// 表示前置通知
	public void myBefore() {
		System.out.println("执行前置通知方法");
	}

	// 表示前置通知
	public void myBefore(JoinPoint jp) throws Exception {
		System.out.println("执行有参的前置通知方法" + jp.getThis());
	}

	// 表示后置通知，没有获取方法的返回值
	public void myAfterReturning() {
		System.out.println("后置通知");
	}

	// 表示后置通知,returning用来接受方法返回值的，要把这个返回值放入到myAfterReturning()参数中
	public void myAfterReturning(Object result) {
		System.out.println("后置通知获得方法返回值   " + result);
	}

	// 表示环绕通知
	public Object myAround(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("执行环绕通知方法myAround()  目标方法之前");
		Object result = pjp.proceed();
		System.out.println("执行环绕通知方法myAround()  目标方法之后");
		return result;
	}

	// 表示环绕通知,修改返回值
	public Object myAround2(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("执行环绕通知方法myAround()  目标方法之前");
		Object result = pjp.proceed();
		System.out.println("执行环绕通知方法myAround()  目标方法之后");
		if (result != null) {
			result = ((String) result).toUpperCase();
		}
		return result;
	}

	// 表示异常通知,运行时异常，会报错
	public void myAfterThrowing() {
		System.out.println("执行异常通知方法myAfterThrowing()");
	}

	// 表示异常通知，运行时异常，将异常信息输出
	public void myAfterThrowing(Exception ex) {
		System.out.println("抛出异常通知方法myAfterThrowing()" + ex.getMessage());
	}

	// 定义最终通知
	public void myAfter() {
		System.out.println("执行最终通知方法");
	}

}

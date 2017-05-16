package com.zfw.aop3.MethodInterceptor;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

//环绕通知
public class MyMethodIntercepor implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		System.out.println("目标方法执行之前");
		// 调用目标方法
		Object result = invocation.proceed();
		if (result!=null) {
			result = ((String)result).toUpperCase();
		}
		System.out.println("目标方法执行之后");

		return result;
	}

}

package com.zfw.aspectj01;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect //表示当前POJO类为切面
public class MyAspect {
	@Before(value="execution(* *..aspectj01.*.doSome(..))")
	//表示前置通知,value切入点表达式
	public void myBefore(){
		System.out.println("执行前置通知方法");
	}
	@Before(value="execution(* *..aspectj01.*.doSecond(..))")
	//表示前置通知,value切入点表达式
	public void myBefore(JoinPoint jp){
		System.out.println(jp);
	}
	
	
	
	@AfterReturning(value="execution(* *..aspectj01.*.doSome(..))")
	//表示后置通知,value切入点表达式，没有获取方法的返回值
	public void myAfterReturning(){
		System.out.println("后置通知");
	}
	@AfterReturning(value="execution(* *..aspectj01.*.doSecond(..))",returning="result")
	//表示后置通知,value切入点表达式，returning用来接受方法返回值的，要把这个返回值放入到myAfger2()参数中
	public void myAfterReturning(Object result){
		System.out.println("后置通知获得方法返回值   "+result);
	}
	
	@Around(value="execution(* *..aspectj01.*.doThird(..))")
	//表示环绕通知,value切入点表达式
	public Object myAround(ProceedingJoinPoint pjp) throws Throwable{
		System.out.println("执行环绕通知方法myAround()  目标方法之前");
		Object result = pjp.proceed();
		System.out.println("执行环绕通知方法myAround()  目标方法之后");
		return result;
	}
	@Around(value="execution(* *..aspectj01.*.doThird(..))")
	//表示环绕通知,value切入点表达式,修改返回值
	public Object myAround2(ProceedingJoinPoint pjp) throws Throwable{
		System.out.println("执行环绕通知方法myAround()  目标方法之前");
		Object result = pjp.proceed();
		System.out.println("执行环绕通知方法myAround()  目标方法之后");
		if (result!=null) {
			result = ((String)result).toUpperCase();
		}
		return result;
	}
	
	
	@AfterThrowing(value="execution(* *..aspectj01.*.doFour(..))")
	//表示异常通知,value切入点表达式,运行时异常，会报错
	public void myAfterThrowing(){
		System.out.println("执行异常通知方法myAfterThrowing()");
	}
	
	
	@AfterThrowing(value="execution(* *..aspectj01.*.doFour(..))",throwing="ex")
	//表示异常通知,value切入点表达式,运行时异常，将异常信息输出
	public void myAfterThrowing(Exception ex){
		System.out.println("抛出异常通知方法myAfterThrowing()"+ex.getMessage());
	}
	
	@After(value="execution(* *..aspectj01.*.doSome(..))")
	//定义最终通知,value切入点表达式
	public void myAfter(){
		System.out.println("执行最终通知方法");
	}
	
	
	@Pointcut(value="execution(* *..aspectj01.*.doSome(..))")
	//定义切入点通知,value切入点表达式,可以直接用这个方法，来替代切入点表达式
	private void doSomePointcut(){}
	
	@After(value="doSomePointcut()")
	public void myAfter1(){
		System.out.println("myAfter1()  用到定义的切入点了");
	}
	
	
}

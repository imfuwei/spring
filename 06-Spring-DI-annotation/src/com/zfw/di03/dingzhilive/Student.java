package com.zfw.di03.dingzhilive;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("myStudent")
@Scope(value = "singleton")
public class Student {
	@Value("张三")
	private String name;
	@Value("23")
	private int age;


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}

	@PostConstruct
	// 相当于在<bean/>中配置了init-method
	public void postInit() {
		System.out.println("bean初始化完毕之后");
	}

	@PreDestroy
	// 相当于在<bean/>中配置了destroy-method
	public void postDestroy() {
		System.out.println("销毁之前");
	}

}

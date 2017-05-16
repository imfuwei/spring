package com.zfw.di01.base;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

// Component本注解具有相同功能的注解还有三个：
// @Repository :注解在Dao接口的实现类上，表示当前Dao类为组件
// @Service :注解在Service接口的实现类上，表示当前Service类为组件
// @Controller :注解在Controller接口的实现类上，表示当前Controller类为组件(SpringMVC)
@Component(value = "myStudent")// 这是个组件,表明当前类为组件，容器创建的这个组件对象名称为myStudent.相当于<bean/>的id属性
@Scope("singleton") //设置bean的作用范围，默认是singleton
public class Student {
	@Value("张三")  //为属性赋值，也可以放到set方法上
	private String name;
	@Value(value="23")
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
}

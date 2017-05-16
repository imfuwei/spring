package com.zfw.di02.yushuxing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component(value = "myStudent")// 这是个组件,表明当前类为组件，容器创建的这个组件对象名称为myStudent.相当于<bean/>的id属性
@Scope("singleton") //设置bean的作用范围，默认是singleton
public class Student {
	@Value("张三")  		//为属性赋值，也可以放到set方法上
	private String name;
	@Value(value="23")
	private int age;
	//@Resource			// byType方式自动注入，为域属性注值这是java里面的注解
	//@Resource(name="mySchool")//byName方式自动注入
	
	@Autowired //byType方式自动注入，这是Spring方式
	@Qualifier("mySchool")//byName方式自动注入，但要和Autowired一起使用
	private School school;

	public School getSchool() {
		return school;
	}

	public void setSchool(School school) {
		this.school = school;
	}

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
		return "Student [name=" + name + ", age=" + age + ", school=" + school
				+ "]";
	}

}

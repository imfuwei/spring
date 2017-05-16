package com.zfw.di04.javaconfig;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
// 表明当前pojo类将会被当做配置文件来使用，即Spring容器
public class MyJavaConfige {

	@Bean(name = "mySchool")
	// 表明当前方法返回值为一个Bean对象
	public School mySchoolCreator() {
		return new School("杭科院");
	}

	@Bean(name = "school")
	// byName方式需要定将 的该bean的name值与被注入的属性名相同
	public School mySchoolCreator2() {
		return new School("科职院");
	}

	// @Bean(name = "myStudent", autowire =Autowire.BY_TYPE)
	// byType自动注入
	@Bean(name = "myStudent", autowire = Autowire.BY_NAME)// byName自动注入
	public Student MyStudentCreator() {
		return new Student("张三", 32);
	}

}

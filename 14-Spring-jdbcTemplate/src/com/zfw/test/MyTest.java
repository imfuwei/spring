package com.zfw.test;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zfw.beans.Student;
import com.zfw.service.IStudentService;

public class MyTest {
	private IStudentService studentService;

	@Before
	public void before(){
		String configLocation="applicationContext.xml";
		ApplicationContext ac = new ClassPathXmlApplicationContext(configLocation);
		studentService = (IStudentService) ac.getBean("studentService");
	}
	@Test
	public void testAdd(){
		studentService.addStudent(new Student("张三", 12));
	}
	
	@Test
	public void testDelete(){
		studentService.removeStudent(1);
	}
	
	@Test
	public void testUpdate(){
		Student student = new Student("lisi", 21);
		student.setId(2);
		studentService.modifyStudent(student);
	}
	
	@Test
	public void testFindStudentNameById(){
		String name = studentService.findStudentNameById(3);
		System.out.println(name);
	}
	
	@Test
	public void testFindStudentNames(){
		List<String> names = studentService.findStudentNames();
		System.out.println(names);
	}
	@Test
	public void testFindStudentById(){
		Student student = studentService.findStudentById(3);
		System.out.println(student);
	}
	
	@Test
	public void testFindStudents(){
		List<Student> students = studentService.findStudents();
		for (Student student : students) {
			System.out.println(student);
		}
	}
	
}

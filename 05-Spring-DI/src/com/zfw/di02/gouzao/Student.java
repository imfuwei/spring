package com.zfw.di02.gouzao;

/**
 * @author zhang
 * 
 */
public class Student {
	private String name;
	private int age;
	private School school;

	public Student(String name, int age, School school) {
		super();
		this.name = name;
		this.age = age;
		this.school = school;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", school=" + school
				+ "]";
	}

}

package com.zfw.di07.yileichouxiangbean;

public class Teacher {
	private String name;
	private int age;
	private String school;
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
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	@Override
	public String toString() {
		return "Teacher [name=" + name + ", age=" + age + ", school=" + school
				+ "]";
	}
	
}

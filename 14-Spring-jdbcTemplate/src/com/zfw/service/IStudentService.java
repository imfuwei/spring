package com.zfw.service;

import java.util.List;

import com.zfw.beans.Student;

public interface IStudentService {
	/**
	 * 插入学生数据
	 * @param student
	 */
	void addStudent(Student student);
	void removeStudent(int id);
	void modifyStudent(Student student);
	
	String findStudentNameById(int id);
	List<String> findStudentNames();
	
	Student findStudentById(int id);
	List<Student> findStudents();
}

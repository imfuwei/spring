package com.zfw.dao;

import java.util.List;

import com.zfw.beans.Student;

public interface IStudentDao {

	void insertStudent(Student student);

	void deleteStudent(int id);

	void updateStudent(Student student);

	String selectStudentNameById(int id);

	Student selectStudentById(int id);

	List<String> selectStudentNames();

	List<Student> selectStudents();

}

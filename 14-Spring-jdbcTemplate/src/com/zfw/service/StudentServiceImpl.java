package com.zfw.service;

import java.util.List;

import com.zfw.beans.Student;
import com.zfw.dao.IStudentDao;

public class StudentServiceImpl implements IStudentService {
	private IStudentDao dao;
	public IStudentDao getDao() {
		return dao;
	}

	public void setDao(IStudentDao dao) {
		this.dao = dao;
	}

	@Override
	public void addStudent(Student student) {
		// TODO Auto-generated method stub
		dao.insertStudent(student);
	}

	@Override
	public void removeStudent(int id) {
		dao.deleteStudent(id);
	}

	@Override
	public void modifyStudent(Student student) {
		dao.updateStudent(student);
	}

	@Override
	public String findStudentNameById(int id) {
		return dao.selectStudentNameById(id);
	}

	@Override
	public List<String> findStudentNames() {
		// TODO Auto-generated method stub
		return dao.selectStudentNames();
	}

	@Override
	public Student findStudentById(int id) {
		// TODO Auto-generated method stub
		return dao.selectStudentById(id);
	}

	@Override
	public List<Student> findStudents() {
		// TODO Auto-generated method stub
		return dao.selectStudents();
	}

}

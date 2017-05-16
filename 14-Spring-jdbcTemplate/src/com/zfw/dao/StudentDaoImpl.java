package com.zfw.dao;

import java.util.List;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.zfw.beans.Student;

public class StudentDaoImpl extends JdbcDaoSupport implements IStudentDao {

	@Override
	public void insertStudent(Student student) {
		String sql = "insert into student(name,age) values(?,?)";
		this.getJdbcTemplate().update(sql, student.getName(), student.getAge());
	}

	@Override
	public void deleteStudent(int id) {
		String sql = "delete from student where id=?";
		this.getJdbcTemplate().update(sql, id);
	}

	@Override
	public void updateStudent(Student student) {
		String sql = "update student set name=?,age=? where id=?";
		this.getJdbcTemplate().update(sql, student.getName(), student.getAge(),
				student.getId());
	}

	@Override
	public String selectStudentNameById(int id) {

		String sql = "select name from student where id=?";

		return this.getJdbcTemplate().queryForObject(sql, String.class, id);
	}

	@Override
	public List<String> selectStudentNames() {
		String sql = "select name from student";
		return this.getJdbcTemplate().queryForList(sql, String.class);
	}

	@Override
	public Student selectStudentById(int id) {
		String sql="select * from student where id=?";
		Student student = this.getJdbcTemplate().queryForObject(sql,new StudentRowMapper(),id);
		return student;
	}

	@Override
	public List<Student> selectStudents() {
		String sql="select id,name,age from student";
		List<Student> list = this.getJdbcTemplate().query(sql, new StudentRowMapper());
		return list;
	}

}

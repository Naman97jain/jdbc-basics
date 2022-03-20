package com.spring.jdbc.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.spring.jdbc.entities.Student;

public class StudentDaoImpl implements StudentDao{
	private JdbcTemplate jdbcTemplate;
	
	public int insert(Student student) {
		String query = "Insert into student(id, name, city) values (?,?,?)";
		return jdbcTemplate.update(query, student.getId(), student.getName(), student.getCity());
	}
	
	public int update(Student student) {
		String query = "Update student set name=? , city=? Where id=?";
		return jdbcTemplate.update(query, student.getName(), student.getCity(), student.getId());
	}
	
	public int delete(Student student) {
		String query = "DELETE FROM student WHERE id=?";
		return jdbcTemplate.update(query, student.getId());
	}
	
	public Student selectOne(int studentId) {
		String query = "SELECT * FROM student WHERE id=?";
		RowMapper<Student> rowMapper = new RowMapperImpl(); 
		Student student = jdbcTemplate.queryForObject(query, rowMapper, studentId);
		return student;
	}
	 
	public List<Student> select(){
		String query = "SELECT * FROM student";
		RowMapper<Student> rowMapper = new RowMapperImpl();
		List<Student> students = this.jdbcTemplate.query(query, rowMapper);
		return students;
	}
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	
}

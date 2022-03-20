package com.spring.jdbc.recommended;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.jdbc.dao.StudentDao;
//import com.spring.jdbc.dao.StudentDaoImpl;
import com.spring.jdbc.entities.Student;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Program is started...");
//		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
//				"com/spring/jdbc/recommended/config.xml");
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JdbcConfig.class);
		StudentDao studentDao = context.getBean("studentDao", StudentDao.class);
//
//		INSERT
//		Student student = new Student(5, "TestName", "TestCity");
//		int result = studentDao.insert(student);
//		System.out.println("Number of records inserted = " + result);
//		
//		UPDATE		
//		Student student = new Student(3, "Yuvraj", "Ambala");
//		System.out.println("Number of records updated = "+ studentDao.update(student));
//		
//		DELETE		
//		Student student = new Student(5, "TestName", "TestCity");
//		System.out.println("Number of records deleted = "+ studentDao.delete(student));
//		
//		SELECT ONE
//		System.out.println(studentDao.selectOne(1));
//		
//		SELECT ALL
		List<Student> students = studentDao.select();
		for(Student s: students) {
			System.out.println(s);
		}
		context.close();
	}
}

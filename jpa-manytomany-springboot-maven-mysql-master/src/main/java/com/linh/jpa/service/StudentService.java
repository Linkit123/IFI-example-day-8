package com.linh.jpa.service;

import java.util.List;
import java.util.Set;

import com.linh.jpa.model.Cource;
import com.linh.jpa.model.Student;

public interface StudentService {
	boolean studentExists(String studentName, String studentAddress);
//	boolean checkStudent(int studentId);
	Student findStudentById(int studentId);
	List<Student> findAllStudent();
	Student updateStudent(Student student,Set<Cource> listCource);
	void deleteStudent(int studentId);
	void addStudent(Student student);
//	 Student findStudentByNameAndAddress(String studentName,String studentAddress);
}

package com.linh.jpa.service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.linh.jpa.dao.StudentDAO;
import com.linh.jpa.model.Cource;
import com.linh.jpa.model.Student;
@Service
public class StudentImpl implements StudentService{

	@Autowired
	StudentDAO studentDAO;
	
	@Override
	public boolean studentExists(String studentName, String studentAddress) {
		return false;
	}

	@Override
	public Student findStudentById(int studentId) {
		return studentDAO.getOne(studentId);
	}

	@Override
	public List<Student> findAllStudent() {
		if(studentDAO.findAll().isEmpty()) {
			System.out.println("Danh sách sinh viên rỗng!");
			return studentDAO.findAll();
		}
		else {
			return studentDAO.findAll();
		}
	}

	@Override
	public Student updateStudent(Student student,Set<Cource> listCource) {
		Student student2 = new Student();
		student2.setStudent_id(student.getStudent_id());
		student2.setStudent_name(student.getStudent_name());
		student2.setStudent_address(student.getStudent_address());
		student2.setCources(listCource);
		studentDAO.save(student2);
		return student2;
//		studentDAO.flush();
	}

	@Override
	public void deleteStudent(int studentId) {
			studentDAO.delete(studentId);
	}

	@Override
	public void addStudent(Student student) {
		studentDAO.save(student);
		System.out.println("Thêm sinh viên thành công!");
	}

//	@Override
//	public boolean checkStudent(int studentId) {
//		if(studentDAO.getOne(studentId)!=null )
//		return true;
//		else {
//			return false;
//		}
//	}

//	@Override
//	public Student findStudentByNameAndAddress(String studentName, String studentAddress) {
//		return studentDAO.;
//	}

}

package com.example.demo.controller;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.util.UriComponentsBuilder;

import com.linh.jpa.model.Cource;
import com.linh.jpa.model.Student;
import com.linh.jpa.service.StudentService;

@Controller
@RequestMapping("student")
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@GetMapping("students")
	public ResponseEntity<List<Student>> getAllStudents() {
		List<Student> list = studentService.findAllStudent();
		return new ResponseEntity<List<Student>>(list, HttpStatus.OK);
	}
	@GetMapping("Student/{id}")
	public ResponseEntity<Student> getStudentById(@PathVariable("id") Integer id) {
		Student student = studentService.findStudentById(id);
		return new ResponseEntity<Student>(student, HttpStatus.OK);
	}
	@PostMapping("student")
	public ResponseEntity<Student> addStudent(@RequestBody Student student) {
       Student student1 = new Student();
       studentService.addStudent(student);   
		return new ResponseEntity<Student>(student1,HttpStatus.CREATED);
	}
	@PutMapping("student")
	public ResponseEntity<Student> updateStudent(@RequestBody Student student,Set<Cource> cources) {
		studentService.updateStudent(student, cources);
		return new ResponseEntity<Student>(student, HttpStatus.OK);
	}
	@DeleteMapping("student/{id}")
	public ResponseEntity<Void> deleteStudent(@PathVariable("id") Integer id) {
		studentService.deleteStudent(id);
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}	
}

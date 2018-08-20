package com.example.demo;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.linh.jpa.service.StudentService;

@SpringBootApplication(scanBasePackages={"com.linh.jpa","com.example.demo"})
public class RestfulJpaManyToManyControllerApplication{

//	@Autowired
//	private StudentService studentService;
	
	public static void main(String[] args) {
		SpringApplication.run(RestfulJpaManyToManyControllerApplication.class, args);
	}

//	@Override
//	@Transactional
//	public void run(String... args) throws Exception {
//		// TODO Auto-generated method stub
//		System.out.println(studentService.findAllStudent());
//		System.out.println("=============================");
////		System.out.println(studentService.findStudentById(10));
//	}
}

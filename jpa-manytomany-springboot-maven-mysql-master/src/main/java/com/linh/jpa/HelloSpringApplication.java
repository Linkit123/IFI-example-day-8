package com.linh.jpa;

import java.util.HashSet;
import java.util.Set;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.linh.jpa.dao.StudentDAO;
import com.linh.jpa.model.Cource;
import com.linh.jpa.model.Student;
import com.linh.jpa.service.StudentService;

@SpringBootApplication
public class HelloSpringApplication {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		SpringApplication.run(HelloSpringApplication.class, args);
	}
	private static final Logger logger = LoggerFactory.getLogger(HelloSpringApplication.class);

//    @Autowired
//    private StudentDAO studentRepository;
//    
//    @Autowired
//    private StudentService studentService;

//    @Autowired
//    private CourceDAO publisherRepository;

   
//    @Override
//    @Transactional
//    public void run(String... strings) throws Exception {
//    	//delete
////    	int studentIInputdDelete = 3;
////    	try {
////    		studentService.deleteStudent(studentIInputdDelete);
////		} catch (Exception e) {
////			System.out.println("Không tìm thấy id: "+studentIInputdDelete +"để xóa!");
////		}
//    	// add book
//    	System.out.println("======================");
//    	System.out.println(studentService.findAllStudent());
//    	System.out.println("======== ADD book==============");
//    	Student student = new Student("linh","ha nam");
////    	bookRepository.save(student);
//    	
//    	
//    	System.out.println("======== end add book==============");
//    	
//    	//find by id
//    	System.out.println("======== find book by id==============");
//    	int studentIdInputFindbyId = 10;
//    	try {
//    		System.out.println("Kết quả tìm theo id: "+studentIdInputFindbyId+"\n");
////    		System.out.println(studentService.findStudentById(studentIdInputFindbyId));
//		} catch (Exception e) {
//			System.out.println("Không tìm thấy sinh viên có id = "+studentIdInputFindbyId);
//		}
//    	
//    	System.out.println("======== end find book by id==============");
////    	add register cource
//    	System.out.println("======== add register cource==============");
//    	Cource cource1 = new Cource("Eglish");
//    	Cource cource2 = new Cource("Japanese");
//    	//cách 1: truyền qua constructor
////    	Set<Cource> cources = new HashSet<Cource>() {{
////    		add(cource1);
////    		add(cource2);
////    	}};
////    	Student student2 = new Student("Harry porter","Hogwarts",cources);
//    	//cacsh2: get set
////    	student2.setStudent_name("Harry porter");
////    	student2.setCources(new HashSet<Cource>() {{
////    		add(cource1);
////    		add(cource2);
////    	}});
////    	studentService.addStudent(student2);
//    	//update
//    	Student student2 = new Student();
//    	student2.setStudent_id(15);
//    	student2.setStudent_name("Bills Gate");
//    	student2.setStudent_address("Los angeles");
//    	Cource cource3 = new Cource("Vietnamese");
//    	Cource cource4 = new Cource("Lao");
//    	Cource cource5 = new Cource("Thai");
//    	Set<Cource> listCource= new HashSet<Cource>() {{
//    		add(cource3);
//    		add(cource4);
//    		add(cource5);
//    	}};
//    	studentService.updateStudent(student2,listCource);
//    	System.out.println("========== List student after! ============");
//    	System.out.println(studentService.findAllStudent());
//    }
}

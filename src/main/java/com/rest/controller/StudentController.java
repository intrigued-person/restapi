package com.rest.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

import com.rest.implementation.StudentImp;
import com.rest.model.Student;

@RestController  //@ResponseBody + @Controller
@RequestMapping("/student") 
@CrossOrigin("*")
public class StudentController {


	

	StudentImp service;
	
	public StudentController(StudentImp service) {
		super();
		this.service = service;
	}
	
	@PostMapping
	public String insertStudent(@RequestBody Student stud) {
		String msg = "";
		try {
			service.addStudent(stud);
			msg = "success";
		}catch(Exception e) {
			e.printStackTrace();
			msg = "failure";
		}
		
		return msg;
		
	}
	
	@GetMapping("{id}")
	public Student readStudent(@PathVariable("id") int id) {
		
		return service.getStudent(id);
	}
	
	@GetMapping("/all")
	public List<Student> getStudents() {
		
		return service.getAllStudents();
	}
	
	@PutMapping
	public String updateStudent(@RequestBody Student stud) {
		String msg = "";
		try {
			service.updateStudent(stud);
			msg = "success";
		}catch(Exception e) {
			e.printStackTrace();
			msg = "failure";
		}
		
		return msg;
		
	}
	
	@DeleteMapping("{id}")
	public String delStudent(@PathVariable("id") int id) {
		String msg = "";
		try {
			service.deleteStudent(id);
			msg = "deleted";
		}catch(Exception e) {
			e.printStackTrace();
			msg = "not deleted";
		}
		
		return msg;
	}


}

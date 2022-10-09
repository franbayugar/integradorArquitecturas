package com.entregaTP3.controller;

import java.util.Optional;

import com.entregaTP3.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import com.entregaTP3.model.Student;

@RestController
public class StudentController {
	
	@Qualifier("studentService")
	@Autowired
	private final StudentService service;

	public StudentController(@Qualifier("studentService") StudentService service) {
		super();
		this.service = service;
	}
	
	@GetMapping("/students")
	public Iterable<Student> getStudent() {return service.getStudents();}
	
	//@GetMapping("/studentBySurname/{surname}")
	//public Iterable<Student> getStudentBySurname(@PathVariable String surname) {return service.findAllBySurname(surname);}
	
	//@GetMapping("/studentByName/{name}")
	//public Iterable<Student> getStudentByName(@PathVariable String name) {return service.findAllByName(name);}

	/**
	 * Create a new Student
	 * @param p data of new Student
	 * @return Return a boolean answer
	 */
	@PostMapping("/students")
	public Student newStudent (@RequestBody Student p) {return service.newStudent(p);}
	
	//@GetMapping("/student/{id}")
	//Optional <Student> one (@PathVariable Integer id) {return service.findById(id); }
	
	//@PutMapping("/student/{id}")
	//Student replaceStudent (@PathVariable Integer id) {return service.saveAndFlush();}
	

	
	

}

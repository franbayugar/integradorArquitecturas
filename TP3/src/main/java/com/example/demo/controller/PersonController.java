package com.example.demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import com.example.demo.model.Person;
import com.example.demo.repository.PersonRepository;

@RestController
public class PersonController {
	
	@Qualifier("personRepository")
	@Autowired
	private final PersonRepository repository;

	public PersonController(@Qualifier("personRepository") PersonRepository repository) {
		super();
		this.repository = repository;
	}
	
	@GetMapping("/persons")
	public Iterable<Person> getPersons() {return repository.findAll();}
	
	@GetMapping("/personsBySurname/{surname}")
	public Iterable<Person> getPersonsBySurname(@PathVariable String surname) {return repository.findAllBySurname(surname);}
	
	@GetMapping("/personsByName/{name}")
	public Iterable<Person> getPersonsByName(@PathVariable String name) {return repository.findAllByName(name);}

	/**
	 * Create a new Student
	 * @param p data of new Student
	 * @return Return a boolean answer
	 */
	@PostMapping("/persons")
	public Person newPerson (@RequestBody Person p) {return repository.save(p);}
	
	@GetMapping("/persons/{id}")
	Optional <Person> one (@PathVariable Long id) {return repository.findById(id); }
	
	@PutMapping("/persons/{id}")
	Person replacePerson (@RequestBody Person newPerson, @PathVariable Long id) {return repository.saveAndFlush(newPerson);}
	
	
	
	

}

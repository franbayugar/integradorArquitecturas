package controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import model.Person;
import repository.PersonRepository;

@RestController
public class PersonController {
	
	@Qualifier("personRepository")
	@Autowired
	private final PersonRepository repository;

	public PersonController(@Qualifier("personRepository") PersonRepository repository) {
		super();
		this.repository = repository;
	}
	
	@GetMapping("/persons1")
	public Iterable<Person> getPersons() {return repository.findAll();}
	
	@GetMapping("/persons1BySurname/{surname}")
	public Iterable<Person> getPersonsBySurname(@PathVariable String surname) {return repository.findAllBySurname(surname);}
	
	@GetMapping("/persons1ByName/{name}")
	public Iterable<Person> getPersonsByName(@PathVariable String name) {return repository.findAllByName(name);}
	
	@PostMapping("/persons1")
	public Person newPerson (@RequestBody Person p) {return repository.save(p);}
	
	@GetMapping("/persons1/{id}")
	Optional <Person> one (@PathVariable Long id) {return repository.findById(id); }
	
	@PutMapping("/persons1/{id}")
	Person replacePerson (@RequestBody Person newPerson, @PathVariable Long id) {return repository.saveAndFlush(newPerson);}
	
	
	
	

}

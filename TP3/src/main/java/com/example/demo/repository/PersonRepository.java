package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.model.Person;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PersonRepository  extends JpaRepository<Person, Long> {
	@Query("SELECT t FROM Person t WHERE  t.surname= :surname")
	public List <Person> findAllBySurname(@Param("surname") String surname);
	
	@Query("SELECT t FROM Person t WHERE t.name= :name")
	public List <Person> findAllByName(@Param("name") String name);
}

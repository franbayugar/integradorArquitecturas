package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.model.Student;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class StudentRepository implements Repository<Student,Integer> {
	@Query("SELECT t FROM Student t WHERE  t.surname= :surname")
	public List <Student> findAllBySurname(@Param("surname") String surname);

	@Query("SELECT t FROM Student t WHERE t.name= :name")
	public List <Student> findAllByName(@Param("name") String name);
}

package com.entregaTP3.repository;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.entregaTP3.model.Student;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public  interface StudentRepository extends JpaRepository<Student, Integer> {
	@Query("SELECT t FROM Student t WHERE  t.surname= :surname")
	public abstract  List <Student> findAllBySurname(@Param("surname") String surname);

	@Query("SELECT t FROM Student t WHERE t.name= :name")
	public abstract  List <Student> findAllByName(@Param("name") String name);

	@Query("SELECT t FROM Student t WHERE t.gender= :gender")
	public abstract  List <Student> getStudentsByGender(@Param("gender") char gender);


}

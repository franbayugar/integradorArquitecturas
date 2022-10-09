package com.entregaTP3.service;


import com.entregaTP3.model.Student;
import com.entregaTP3.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Qualifier("studentRepository")
    @Autowired
    private StudentRepository repository;


    public StudentService(@Qualifier("studentRepository") StudentRepository repository) {
        this.repository = repository;
    }

    public List<Student> getStudents(){return repository.findAll(); }

    public Student newStudent (Student p){ return repository.save(p);}



}

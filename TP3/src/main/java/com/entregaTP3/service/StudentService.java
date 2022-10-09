package com.entregaTP3.service;


import com.entregaTP3.model.Student;
import com.entregaTP3.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Qualifier("studentRepository")
    @Autowired
    private StudentRepository repository;


    public StudentService(@Qualifier("studentRepository") StudentRepository repository) {
        this.repository = repository;
    }

    public List<Student> getStudents(){return repository.findAll(Sort.by(Sort.Direction.ASC, "name"));}

    public Student newStudent (Student p){ return repository.save(p);}

    public Optional<Student> studentById(Integer id) {
        return repository.findById(id);
    }


    public Student updateStudent(Student studentUpdated, Integer id) {
    // no es necesario el put
        return null;
    }
}

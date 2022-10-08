package com.example.demo.service;

import com.example.demo.model.Courses;
import com.example.demo.repository.CoursesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CoursesService {

    @Autowired
    private CoursesRepository repository;


    public Courses newRegister(Courses c){return repository.register(c);};
}

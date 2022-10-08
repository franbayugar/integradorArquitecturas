package com.example.demo.controller;


import com.example.demo.model.Courses;
import com.example.demo.service.CoursesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

@RestController
public class CoursesController {

    @Qualifier("coursesService")
    @Autowired
    private final CoursesService service;

    public CoursesController(@Qualifier("coursesService") CoursesService service) {
        super();
        this.service = service;
    }

    @PostMapping("/register")
    public Courses newRegister(@RequestBody Courses c){return service.save(c);}


}

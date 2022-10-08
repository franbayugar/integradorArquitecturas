package com.example.demo.service;

import com.example.demo.model.Career;
import com.example.demo.repository.CareerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CareerService {

    @Autowired
    private CareerRepository careerRepository;

    public Career register (Integer idStudent, Integer idCareer){return careerRepository.register(idStudent,idCareer);}

}

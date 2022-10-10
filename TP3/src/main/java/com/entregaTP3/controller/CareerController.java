package com.entregaTP3.controller;

import com.entregaTP3.DTO.DTOCareer;
import com.entregaTP3.DTO.DTOListEnrolledGraduated;
import com.entregaTP3.service.CareerService;
import com.entregaTP3.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CareerController {

    @Qualifier("careerService")
    @Autowired
    private CareerService service;
    public CareerController(@Qualifier("careerService") CareerService service) {
        super();
        this.service = service;
    }
    @GetMapping("/careers")
    List<DTOCareer> careerWithEntries() {return service.careerWithEntries(); }

    @GetMapping("/careerReport")
    List<DTOListEnrolledGraduated> careerReport() {return service.careerReport(); }

}

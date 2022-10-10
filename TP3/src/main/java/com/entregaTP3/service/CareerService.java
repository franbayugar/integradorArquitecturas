package com.entregaTP3.service;

import com.entregaTP3.DTO.DTOCareer;
import com.entregaTP3.repository.CareerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CareerService {

    @Autowired
    private CareerRepository careerRepository;

    public List<DTOCareer> careerWithEntries() {
        return careerRepository.careerWithEntries();
    }

    //public Career register (Integer idStudent, Integer idCareer){return careerRepository.register(idStudent,idCareer);}

}

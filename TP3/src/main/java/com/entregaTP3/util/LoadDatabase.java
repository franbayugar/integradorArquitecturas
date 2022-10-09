package com.entregaTP3.util;

import com.entregaTP3.model.Courses;
import com.entregaTP3.repository.StudentRepository;
import com.entregaTP3.model.Career;
import com.entregaTP3.model.Student;
import com.entregaTP3.repository.CareerRepository;
import com.entregaTP3.repository.CoursesRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import lombok.extern.slf4j.Slf4j;

import java.util.Date;

@Configuration
@Slf4j
class LoadDatabase {

	@Bean
	CommandLineRunner initDataBase(@Qualifier("studentRepository") StudentRepository repository) {
		return args -> {
			log.info("Preloading"+ repository.save(new Student(1234, "01/01/1985", 'M', "Seba","Perez","Tres Arroyos")));
			log.info("Preloading"+ repository.save(new Student(5678, "21/11/2000", 'F', "Maria","Gomez","Bahia Blanca")));
		};
	}

	@Bean
	CommandLineRunner initDataBase(@Qualifier("careerRepository") CareerRepository repository) {
		return args -> {
			log.info("Preloading"+ repository.save(new Career("tudai",3)));
		};
	}



	
}

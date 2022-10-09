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

@Configuration
@Slf4j
class LoadDatabase {

	@Bean
	CommandLineRunner initDataBase(@Qualifier("studentRepository") StudentRepository repository) {
		return args -> {
			log.info("Preloading"+ repository.save(new Student(1234, "Seba","Perez")));
			log.info("Preloading"+ repository.save(new Student(4567, "Juan","Sosa")));
		};
	}



	
}

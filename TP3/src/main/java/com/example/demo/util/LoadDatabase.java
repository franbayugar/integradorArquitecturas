package com.example.demo.util;

import com.example.demo.model.Career;
import com.example.demo.model.Courses;
import com.example.demo.model.Student;
import com.example.demo.repository.CareerRepository;
import com.example.demo.repository.CoursesRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import lombok.extern.slf4j.Slf4j;
import com.example.demo.repository.StudentRepository;

@Configuration
@Slf4j
class LoadDatabase {

	@Bean
	CommandLineRunner initDataBase(@Qualifier("studentRepository") StudentRepository repository) {
		return args -> {
			log.info("Preloading"+ repository.save(new Student((long)1234, "Seba","Perez")));
			log.info("Preloading"+ repository.save(new Student((long)4567, "Juan","Sosa")));
		};
	}
	@Bean
	CommandLineRunner initDataBase(@Qualifier("careerRepository") CareerRepository repository) {
		return args -> {
			log.info("Preloading"+ repository.save(new Career("TUDAI",3)));
		};
	}

	@Bean
	CommandLineRunner initDataBase(@Qualifier("coursesRepository") CoursesRepository repository) {
		return args -> {
			log.info("Preloading"+ repository.save(new Courses(1,1)));
		};
	}

	
}

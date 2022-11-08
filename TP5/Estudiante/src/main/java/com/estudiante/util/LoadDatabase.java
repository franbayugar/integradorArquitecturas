package com.estudiante.util;



import com.estudiante.Repository.StudentRepository;
import com.estudiante.Entity.Student;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import lombok.extern.slf4j.Slf4j;

@Configuration
@Slf4j
class LoadDatabase {

	@Bean
	CommandLineRunner initDataBase(@Qualifier("studentRepository") StudentRepository studentRepository) {
		return args -> {
			log.info("Preloading"+ studentRepository.save(new Student(1234, "01/01/1985", 'M', "Seba","Perez","Azul")));
			log.info("Preloading"+ studentRepository.save(new Student(5678, "21/11/2000", 'F', "Maria","Gomez","Bahia Blanca")));

		};
	}

}

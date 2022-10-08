package com.example.demo.util;

import com.example.demo.model.Person;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import lombok.extern.slf4j.Slf4j;
import com.example.demo.repository.PersonRepository;

@Configuration
@Slf4j
class LoadDatabase {

	@Bean
	CommandLineRunner initDataBase(@Qualifier("personRepository") PersonRepository repository) {
		return args -> {
			log.info("Preloading"+ repository.save(new Person ((long)1234, "Seba","Perez")));
		log.info("Preloading"+ repository.save(new Person ((long)4567, "Juan","Sosa")));
		};
	}
	
}

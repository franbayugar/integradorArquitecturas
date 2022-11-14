package com.venta.util;


import com.venta.repository.SaleRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import lombok.extern.slf4j.Slf4j;

@Configuration
@Slf4j
class LoadDatabase {

    @Bean
    CommandLineRunner initDataBase(@Qualifier("saleRepository") SaleRepository productRepository) {
        return args -> {
         //   log.info("Preloading"+ productRepository.save(new Sale()));
         //   log.info("Preloading"+ productRepository.save(new Sale()));


        };
    }
}

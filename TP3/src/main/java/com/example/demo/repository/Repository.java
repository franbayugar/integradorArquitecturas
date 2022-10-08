package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.Entity;


public interface Repository extends JpaRepository<Entity, Integer> {

}

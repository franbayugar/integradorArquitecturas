package com.example.demo.model;

import javax.persistence.*;

import lombok.Data;

@Entity
@Data
public class Person {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column
	private long dni;
	@Column
	private String name;
	@Column
	private String surname;
	
	public Person() {
		
	}

	public Person(long dni, String name, String surname) {
		super();
		this.dni = dni;
		this.name = name;
		this.surname = surname;
	}




}

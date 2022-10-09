package com.entregaTP3.model;

import javax.persistence.*;

import lombok.Data;

import java.util.Date;


@Entity
@Data
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int collegeNotebook;

	@Column
	private long dni;

	@Column
	private Date bornDate;

	@Column
	private char gender;
	@Column
	private String name;
	@Column
	private String surname;

	@Column
	private String city;


	public Student() {
		
	}

	public Student(long dni, String bornDate, char gender, String name, String surname, String city) {
		this.dni = dni;
		this.bornDate = new Date(bornDate);
		this.gender = gender;
		this.name = name;
		this.surname = surname;
		this.city = city;
	}

}

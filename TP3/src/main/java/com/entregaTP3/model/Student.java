package com.entregaTP3.model;

import javax.persistence.*;

import lombok.Data;

@Entity
@Data
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column
	private long dni;
	@Column
	private String name;
	@Column
	private String surname;
	
	public Student() {
		
	}

	public Student(long dni, String name, String surname) {
		super();
		this.dni = dni;
		this.name = name;
		this.surname = surname;
	}
	public int getId() {
		return id;
	}
	public long getDni() {
		return dni;
	}

	public void setDni(long dni) {
		this.dni = dni;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}
}

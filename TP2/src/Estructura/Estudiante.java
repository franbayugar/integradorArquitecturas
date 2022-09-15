package Estructura;

import java.util.List;

public class Estudiante {

	private int id;
	private int num_libreta;
	private String nombres;
	private String apellido;
	private int edad;
	private String genero;
	private int dni;
	private String ciudadResidencia;
	private List<Carrera> carreras;
	
	private Estudiante(String nombres, String apellido, int edad, String genero, int dni,String ciudadResidencia) {
		
		//id (autoincremental automatic)
		this.nombres = nombres;
		this.apellido = apellido;
		this.edad = edad;
		this.genero = genero;
		this.dni = dni;
		this.ciudadResidencia = ciudadResidencia;
		//this.carreras = new List<Carrera>();
	}

	public int getNum_libreta() {
		return id;
	}

	public void setNum_libreta(int num_libreta) {
		this.id = num_libreta;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public String getCiudadResidencia() {
		return ciudadResidencia;
	}

	public void setCiudadResidencia(String ciudadResidencia) {
		this.ciudadResidencia = ciudadResidencia;
	}
		

}

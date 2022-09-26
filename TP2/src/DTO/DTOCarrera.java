package DTO;

import java.io.Serializable;

public class DTOCarrera implements Serializable {

	private int id_cursa;
	private String nombre_carrera;
	private int cantidad;
	public DTOCarrera(int id, String nombre_carrera, int cantidad) {
		this.id_cursa = id;
		this.nombre_carrera = nombre_carrera;
		this.cantidad = cantidad;
	}

	public int getId() {
		return id_cursa;
	}

	public int getCantidad() {
		return cantidad;
	}

	public String getNombre_carrera() {
		return nombre_carrera;
	}


	
}

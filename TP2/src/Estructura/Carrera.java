package Estructura;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Carrera")
public class Carrera {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;	
	//@ManyToOne (mappedby ??) / @JoinColumn(name=fk_estudiante) ??
	
	@Column(name="Nombre Carrera")
	private String nombre;
	@Column(name="Duracion")
	private int duracion;
	
	public Carrera() {} //JPA necesita un constructor vacío para convertir la fila DB en un objeto Java.
	
	public Carrera(String nombre, int duracion) {	
		//id (autoincremental automatic)
		this.nombre = nombre;
		this.duracion = duracion;
	}

	public int getId_carrera() {
		return id;
	}

	public void setId_carrera(int id_carrera) {
		this.id = id_carrera;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

}

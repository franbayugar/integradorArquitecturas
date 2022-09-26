package Entity;

import javax.persistence.*;

@Entity
@Table(name="Carrera")
public class Carrera {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_carrera;	
	//@ManyToOne (mappedby ??) / @JoinColumn(name=fk_estudiante) ??	
	@Column(name="Nombre_Carrera",nullable=false)
	private String nombre;
	@Column(name="Duracion",nullable=false)
	private int duracion;
	
	
	public Carrera(String nombre, int duracion) {	
		//super();
		this.nombre = nombre;
		this.duracion = duracion;
	}

	public int getId_carrera() {
		return id_carrera;
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
	
	@Override
	public String toString() {
		return "Carrera : "+ nombre + ", duracion : "+ duracion;  
	}

}

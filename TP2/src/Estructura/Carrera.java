package Estructura;

@Entity
public class Carrera {
	
	@Id
	private int id;	
	@ManyToOne //(mappedby ??)
	private String nombre;
	private int duracion;
	
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

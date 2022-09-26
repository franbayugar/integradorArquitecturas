package Entity;

import java.util.Date;
import java.util.List;
import javax.persistence.*;

@Entity
@Table(name="Cursa")
public class Cursa {

	@Id	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_cursa;
	/**
	 *@Column(name="num_libreta",nullable=false)
	 *private int num_libreta;
	 *@Column(name="id_carrera",nullable=false)
	 *private int id_carrera; 
	 */
	@Column(name="fechaInscripcion",nullable=false)
	private Date fechaInscripcion;
	@Column(name="graduado",nullable=false)
	private boolean graduado;
	
	@ManyToOne
	private Estudiante estudiante;
	@ManyToOne
	private Carrera carrera;
	
	//JPA necesita un constructor vacío para convertir la fila DB en un objeto Java.
	public Cursa() {
		//super();
	} 
	
	public Cursa(int num_libreta, int id_carrera, Date fechaInscripcion, boolean graduado) {	
		//super();
		//this.num_libreta = num_libreta;
		//this.id_carrera = id_carrera;
		this.fechaInscripcion = fechaInscripcion;
		this.graduado = graduado;
	}

	public Date getFechaInscripcion() {
		return fechaInscripcion;
	}

	public void setFechaInscripcion(Date fechaInscripcion) {
		this.fechaInscripcion = fechaInscripcion;
	}

	public boolean isGraduado() {
		return graduado;
	}

	public void setGraduado(boolean graduado) {
		this.graduado = graduado;
	}

	public int getId_cursa() {
		return id_cursa;
	}	
	
}

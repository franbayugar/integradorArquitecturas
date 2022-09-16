package Estructura;

import java.util.List;

@Entity
@Table(name="Estudiante")
public class Estudiante {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	//@ManyToOne (mappedby ??) / @JoinColumn(name=fk_carrera) ??
	
	@Column(name="Nombres")
	private String nombres;
	@Column(name="Apellido")
	private String apellido;
	@Column(name="Fecha_Nacimiento")
	private Date Fecha_Nacimiento;
	@Column(name="Genero")
	private String genero;
	@Column(name="Dni")
	private int dni;
	@Column(name="Ciudad_Residencia")
	private String ciudadResidencia; //Podría sera codigo postal

	//@
	private List<Carrera> carreras;
	
	public Estudiante(String nombres, String apellido, int edad, String genero, int dni,String ciudadResidencia) {
		
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

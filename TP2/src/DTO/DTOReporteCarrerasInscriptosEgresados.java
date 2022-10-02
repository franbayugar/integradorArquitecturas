package DTO;


public class DTOReporteCarrerasInscriptosEgresados {

	private int id_carrera;
	private String nombre_carrera;
	private int anio;
	private Long cantInscriptos=(long) 0;
	
	
	public DTOReporteCarrerasInscriptosEgresados(int id_carrera, String nombre_carrera, int anio, Long cantInsc) {
		
		this.id_carrera = id_carrera;
		this.nombre_carrera = nombre_carrera;
		this.anio = anio;
		this.cantInscriptos = cantInsc;
		
	}

	public int getId_carrera() {
		return id_carrera;
	}

	public void setId_carrera(int id_carrera) {
		this.id_carrera = id_carrera;
	}

	public String getNombre_carrera() {
		return nombre_carrera;
	}

	public void setNombre_carrera(String nombre_carrera) {
		this.nombre_carrera = nombre_carrera;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	

	public Long getCantInscriptos() {
		return cantInscriptos;
	}

	public void setCantInscriptos(Long cantInscriptos) {
		this.cantInscriptos = cantInscriptos;
	}

	

	@Override
	public String toString() {
		return "Reporte Inscriptos/Egresados Carreras: [id_carrera=" + id_carrera + ", nombre_carrera=" + nombre_carrera
				+ ", anio=" + anio + ", cantInscriptos=" + cantInscriptos + ", cantGraduados=" + "]\n";
	}

	
	
	
	
}

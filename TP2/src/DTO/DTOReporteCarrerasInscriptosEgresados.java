package DTO;

public class DTOReporteCarrerasInscriptosEgresados {

	private String carrera;
	private String apellido;
	private String nombres;
	private String estado;
	private int anio;

	public DTOReporteCarrerasInscriptosEgresados(String carrera, String apellido, String nombres, String estado, int anio) {
		this.carrera = carrera;
		this.apellido = apellido;
		this.nombres = nombres;
		this.estado =estado;
		this.anio = anio;
	}

	public String getCarrera() {
		return carrera;
	}

	public String getApellido() {
		return apellido;
	}

	public String getNombres() {
		return nombres;
	}
	
	public String getEstado() {
		return estado;
	}

	public int getAnio() {
		return anio;
	}

	@Override
	public String toString() {
		return "DTOReporteCarrerasInscriptosEgresados [carrera=" + carrera + ", apellido=" + apellido + ", nombres="
				+ nombres + ", estado=" + estado + ", anio=" + anio + "]\n";
	}

	
}

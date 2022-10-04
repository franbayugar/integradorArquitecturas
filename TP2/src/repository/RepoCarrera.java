package repository;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;
import javax.persistence.TypedQuery;

import DTO.DTOCarrera;
import DTO.DTOReporteCarrerasInscriptosEgresados;
import Entity.Carrera;

public class RepoCarrera extends BaseRepository<Carrera, Integer> {

	public RepoCarrera() {
		super(Carrera.class, Integer.class);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Carrera findById(int id) {
//			String jpql= "SELECT a FROM Estudiante a WHERE num_libreta=?1";		
//			Query typedQuery =  em.createQuery(jpql,Estudiante.class);
//			typedQuery.setParameter(1, id);
		// System.out.println(typedQuery.getSingleResult());
		// Estudiante res=(Estudiante) typedQuery.getSingleResult();

		// Date fecha = res.getfechaNacimiento();
		// Estudiante est= new Estudiante(res.getNombres(),res.getApellido(),fecha,
		// res.getGenero(),res.getDni(),res.getCiudadResidencia());

		return (Carrera) super.findById(id);
		// return (Entity) em.find(Estudiante.class,id);

		// return (Entity) res;
	}

	@Override
	public void create(Carrera entity) {
		// TODO Auto-generated method stub
		super.create(entity);
	}

	@Override
	public void delete(int id) {
		super.delete(id);

	}

	public List<DTOCarrera> getCarrerasConEstudiantesInscriptos() {
		String query = "SELECT new DTO.DTOCarrera(c.id_carrera, c.nombre, COUNT(cu.carrera)) FROM Carrera c JOIN Cursa cu ON cu.carrera = c.id_carrera GROUP BY cu.carrera, c.nombre";
		List<DTOCarrera> dtoCursa = super.em.createQuery(query, DTOCarrera.class).getResultList();
		return dtoCursa;
	}
	

	
	public List<DTOReporteCarrerasInscriptosEgresados> getReporte() {
		String queryInscriptos = "SELECT new DTO.DTOReporteCarrerasInscriptosEgresados(ca.id_carrera, ca.nombre, (Year(cu.fechaInscripcion)) as anio ,count(estudiante_num_libreta) as inscriptios, COUNT(0)) FROM Cursa cu JOIN Carrera ca on cu.carrera.id_carrera = ca.id_carrera group by cu.carrera.id_carrera, anio";

		List<DTOReporteCarrerasInscriptosEgresados> dtoCursa = super.em.createQuery(queryInscriptos, DTOReporteCarrerasInscriptosEgresados.class).getResultList();
		String queryGraduados = "SELECT  new DTO.DTOReporteCarrerasInscriptosEgresados(select ca.id_carrera, ca.nombre, (Year(cu.fechaGraduacion)) as anio,COUNT(0),(select count(estudiante_num_libreta) from Cursa cg where Year(cg.fechaGraduacion) = anio and cg.carrera.id_carrera = cu.carrera.id_carrera) as graduados FROM Cursa cu JOIN Carrera ca on cu.carrera.id_carrera = ca.id_carrera WHERE cu.fechaGraduacion IS NOT NULL group by cu.carrera.id_carrera, anio";
		List<DTOReporteCarrerasInscriptosEgresados> dtoCursaGraduados = super.em.createQuery(queryInscriptos, DTOReporteCarrerasInscriptosEgresados.class).getResultList();

	
		for(DTOReporteCarrerasInscriptosEgresados lista : dtoCursa){
		  
		  for(DTOReporteCarrerasInscriptosEgresados lista2 : dtoCursaGraduados){
			  if((lista.getId_carrera()==lista2.getId_carrera())&&(lista.getAnio()==lista2.getAnio())) {
				  lista.setCantGraduados(lista2.getCantGraduados());
			  }
			}
		}		
		
		return dtoCursa;
	}

	/*
	 * * @Override public Entity update(Integer id, Entity entity) { // TODO
	 * Auto-generated method stub return null; }
	 * 
	 * @Override public Object create(Object entity) { // TODO Auto-generated method
	 * stub return null; }
	 * 
	 * @Override public Object update(int id, Object entity) { // TODO
	 * Auto-generated method stub return null; }
	 */

}

package repository;

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
		//String query = "Select new DTO.DTOReporteCarrerasInscriptosEgresados( ca.nombre,ca.duracion,'Incriptos' AS Tipo_Alumnos, count(estudiante_num_libreta) as Cantidad, EXTRACT (YEAR,cu.fechaInscripcion) as anio) from Carrera ca left join Cursa cu on ca.id_carrera = cu.carrera.id_carrera WHERE cu.fechaInscripcion IS NOT NULL GROUP BY ca.id_carrera, anio OR Select new DTO.DTOReporteCarrerasInscriptosEgresados(ca.nombre,ca.Duracion, 'Graduados' AS Tipo_Alumnos, count(estudiante_num_libreta), EXTRACT (YEAR,cu.fechaInscripcion) as anio) from Carrera ca left join Cursa cu on ca.id_carrera = cu.carrera.id_carrera WHERE cu.fechaGraduacion IS NOT NULL GROUP BY ca.id_carrera, anio ORDER BY Nombre_Carrera,anio ";
		//String query = "Select new DTO.DTOReporteCarrerasInscriptosEgresados( ca.nombre, ca.duracion,'Incriptos' AS Tipo_Alumnos, count(estudiante_num_libreta) as Cantidad, EXTRACT (YEAR,cu.fechaInscripcion) as anio) from Carrera ca left join Cursa cu on ca.id_carrera = cu.carrera.id_carrera WHERE cu.fechaInscripcion IS NOT NULL GROUP BY ca.id_carrera, anio ";
		String queryInscriptos = "SELECT  new DTO.DTOReporteCarrerasInscriptosEgresados(cursaDos.carrera.id_carrera, C.nombre, YEAR(cursaDos.fechaInscripcion) as anio , (SELECT COUNT(*) FROM Cursa cur2 WHERE cur2.carrera.id_carrera=cursaDos.carrera.id_carrera AND YEAR(cur2.fechaInscripcion)=YEAR(cursaDos.fechaInscripcion) group by cur2.carrera.id_carrera, YEAR(cur2.fechaInscripcion)) as cantIns) FROM Cursa cursaDos JOIN Carrera C on C.id_carrera = cursaDos.carrera.id_carrera GROUP BY anio, cursaDos.carrera.id_carrera,  cantIns, C.nombre ORDER BY anio ASC, C.nombre ASC";

		List<DTOReporteCarrerasInscriptosEgresados> dtoCursa = super.em.createQuery(queryInscriptos, DTOReporteCarrerasInscriptosEgresados.class).getResultList();
		String queryGraduados = "SELECT  new DTO.DTOReporteCarrerasInscriptosEgresados(cursaDos.carrera.id_carrera, C.nombre, YEAR(cursaDos.fechaGraduacion) as anio , (SELECT COUNT(*) FROM Cursa cur2 WHERE cur2.carrera.id_carrera=cursaDos.carrera.id_carrera AND YEAR(cur2.fechaGraduacion)=YEAR(cursaDos.fechaGraduacion) group by cur2.carrera.id_carrera, YEAR(cur2.fechaGraduacion)) as cantGrad) FROM Cursa cursaDos JOIN Carrera C on C.id_carrera = cursaDos.carrera.id_carrera GROUP BY anio, cursaDos.carrera.id_carrera,  cantIns, C.nombre ORDER BY anio ASC, C.nombre ASC";

		List<DTOReporteCarrerasInscriptosEgresados> dtoCursaGraduados = super.em.createQuery(queryInscriptos, DTOReporteCarrerasInscriptosEgresados.class).getResultList();

		
		//System.out.println(dtoCursa.toString());
		
		
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

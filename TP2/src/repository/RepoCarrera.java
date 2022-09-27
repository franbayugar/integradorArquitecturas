package repository;

import java.util.List;

import DTO.DTOCarrera;
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

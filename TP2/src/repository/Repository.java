package repository;

import javax.persistence.Entity;

public interface Repository {

	public Entity findById(int id);
	
	public Entity create(Entity entity);
	
	public Entity delete(int id);
	
	public Entity update(int id, Entity entity);
	
	
}

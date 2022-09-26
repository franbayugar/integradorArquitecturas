package repository;

import java.io.Serializable;

import javax.persistence.Entity;

public interface Repository <Entity , ID extends Serializable> {

	public Entity findById(int id);
	
	//public Entity create(Entity entity);
	
	//public Entity delete(Integer id);
	
	//public Entity update(Integer id, Entity entity);
	
	
}

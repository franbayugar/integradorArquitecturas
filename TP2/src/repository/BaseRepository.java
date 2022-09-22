package repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class BaseRepository{

	private EntityManager em;
		
	protected BaseRepository() {
		
		this.em = this.getConection("batamanMySql");		
	}
	
	private EntityManager getConection(String tecnologia) {
		
		if(this.em != null) {
			return this.em;
		
		}EntityManagerFactory emf = Persistence.createEntityManagerFactory(tecnologia);
			return emf.createEntityManager();
	
	}	
}
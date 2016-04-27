/**
 * 
 */
package co.com.ensayoMVC.jpa.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;


import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import co.com.ensayoMVC.jpa.entities.Lugar;




/**
 * @author TEFAJARITA
 *
 */
@Repository
public class JPALugarDAO implements LugarDAO {
	 @PersistenceContext(name="lugar")
	private EntityManager em;
	
	public EntityManager getEntityManager() {
		return em;
	}
	
	
	/**
	 * @param em the em to set
	 */
	
	public void setEntityManager(EntityManager em) {
		this.em = em;
	}

	 
	/* private DataSource dataSource;
		
		public void setDataSource(DataSource dataSource){
			this.dataSource=dataSource;
			
		}*/
		
	@Transactional	
	public Lugar findLugarById(int lugarId) {
		
		Query q =(Query) getEntityManager().createQuery("SELECT l FROM Lugar l WHERE id = "+lugarId);
		Lugar result = (Lugar) q.getSingleResult();
		return result;
	}

	
	
}

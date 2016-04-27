/**
 * 
 */
package co.com.ensayoMVC.jpa.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.sql.DataSource;

import org.springframework.stereotype.Repository;

import co.com.ensayoMVC.jpa.entities.Lugar;




/**
 * @author TEFAJARITA
 *
 */
@Repository
public class JPALugarDAO implements LugarDAO {
	
	private EntityManager em;
	
	public EntityManager getEntityManager() {
		return em;
	}
	
	
	/**
	 * @param em the em to set
	 */
	 @PersistenceContext
	public void setEntityManager(EntityManager em) {
		this.em = em;
	}

	 
	 private DataSource dataSource;
		
		public void setDataSource(DataSource dataSource){
			this.dataSource=dataSource;
			
		}
	public Lugar findLugarById(int lugarId) {
		
		Query q =(Query) getEntityManager().createQuery("SELECT l FROM Lugar l WHERE id = "+lugarId);
		Lugar result = (Lugar) q.getSingleResult();
		return result;
	}

	
	
}

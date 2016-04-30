/**
 * 
 */
package co.com.ensayoMVC.jpa.dao;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;


import org.springframework.stereotype.Repository;

import co.com.ensayoMVC.DAO.LugarDAO;
import co.com.ensayoMVC.jpa.entities.Lugar;
import co.com.ensayoMVC.model.LugarDTO;




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
		
		
	public LugarDTO findLugarById(int lugarId) {
		
		Query q =(Query) getEntityManager().createQuery("SELECT l FROM Lugar l WHERE l.id =:lugarId");
		q.setParameter("lugarId", lugarId);
		Lugar result = (Lugar) q.getSingleResult();	
		
		//se crea el dto 
		LugarDTO lugarDTO  = new LugarDTO();
		lugarDTO.setNombre(result.getNombre());
		lugarDTO.setDireccion(result.getDireccion());
		lugarDTO.setAlt(result.getAlt());
		lugarDTO.setLon(result.getLon());
		lugarDTO.setTelefono(result.getTelefono());
		lugarDTO.setDescripcion(result.getDescripcion());
		lugarDTO.setHorario(result.getHorario());
		lugarDTO.setCorreo(result.getCorreo());
		
		return lugarDTO;
	}


	



	
	
	

	
	
}

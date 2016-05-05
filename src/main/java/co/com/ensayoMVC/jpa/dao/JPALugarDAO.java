/**
 * 
 */
package co.com.ensayoMVC.jpa.dao;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.sql.DataSource;

import org.springframework.stereotype.Repository;

import co.com.ensayoMVC.DAO.LugarDAO;
import co.com.ensayoMVC.jpa.entities.Lugar;
import co.com.ensayoMVC.model.BarberoDTO;
import co.com.ensayoMVC.model.LugarDTO;




/**
 * @author TEFAJARITA
 *
 */
@Repository
public class JPALugarDAO implements LugarDAO {
	 @PersistenceContext(name="lugar")
	private EntityManager em;
	 private DataSource dataSource;
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
		
		Query q =(Query) getEntityManager().createQuery("SELECT new co.com.ensayoMVC.model.LugarDTO(l.nombre, l.direccion, l.alt, l.lon, l.telefono, l.descripcion,l.horario, l.correo) FROM Lugar l WHERE l.id =:lugarId");
		q.setParameter("lugarId", lugarId);
		LugarDTO result = (LugarDTO) q.getSingleResult();	
		
		//se crea el dto 
		//LugarDTO lugarDTO  = new LugarDTO(result.getNombre(),result.getDireccion(),result.getAlt(),result.getLon(),result.getTelefono(),result.getDescripcion(),result.getHorario(),result.getCorreo());
	
		
		return result;
	}


	public DataSource getDataSource() {
		return dataSource;
	}


	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}


	public List<LugarDTO> listLugar() {
		Query query = em.createQuery( "Select new co.com.ensayoMVC.model.LugarDTO(l.nombre,l.direccion,l.alt,l.lon,l.telefono,l.descripcion,l.horario,l.correo) from Lugar l " );
		List<LugarDTO> resultList =  query.getResultList();
		return resultList;
	}


	



	
	
	

	
	
}

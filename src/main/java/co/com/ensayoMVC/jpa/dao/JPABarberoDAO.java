package co.com.ensayoMVC.jpa.dao;

import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.sql.DataSource;

import org.springframework.stereotype.Repository;

import co.com.ensayoMVC.DAO.BarberoDAO;
import co.com.ensayoMVC.jpa.entities.Barbero;
import co.com.ensayoMVC.model.BarberoDTO;

@Repository
public class JPABarberoDAO implements BarberoDAO {

	@PersistenceContext(name="lugar")
	private EntityManager em;
	 private DataSource dataSource;
		public DataSource getDataSource() {
			return dataSource;
		}
		public void setDataSource(DataSource dataSource) {
			this.dataSource = dataSource;
		}
		
		public EntityManager getEntityManager() {
			return em;
		}
		
		
		/**
		 * @param em the em to set
		 */
		
		public void setEntityManager(EntityManager em) {
			this.em = em;
		}
	 
	public BarberoDTO findBarberoById(String barberoCedula) {
		Query q =(Query) getEntityManager().createQuery("SELECT new co.com.ensayoMVC.model.BarberoDTO(b.cedula,b.nombre,b.apellido,b.telefono,b.descripcion,b.direccion,b.fotoperfil) FROM Barbero b WHERE b.cedula =:barberoCedula");
		q.setParameter("barberoCedula", barberoCedula);
		BarberoDTO result = (BarberoDTO) q.getSingleResult();	
		return result;
	}
	
	public List<BarberoDTO> listBarberosPorLugar (int lugar){
		Query query = em.createQuery( "Select new co.com.ensayoMVC.model.BarberoDTO(b.cedula,b.nombre,b.apellido,b.telefono,b.descripcion,b.direccion,b.fotoperfil) from Barbero b where b.lugar.id =:lugar " );
		   query.setParameter( "lugar", lugar );
		   List<BarberoDTO> resultList =  query.getResultList();
	/*	  for (Barbero b : resultList){
			//se crea el dto 
				BarberoDTO barberoDTO = new BarberoDTO(b.getCedula(),b.getNombre(),b.getApellido(),b.getTelefono(),b.getDescripcion(),b.getDireccion(),b.getFotoperfil());
				
		  }*/
		return   resultList ;
	
	}


	public List<BarberoDTO> listBarbero() {
		Query query = em.createQuery( "Select new co.com.ensayoMVC.model.BarberoDTO(b.cedula,b.nombre,b.apellido,b.telefono,b.descripcion,b.direccion,b.fotoperfil) from Barbero b " );
		List<BarberoDTO> resultList =  query.getResultList();
		return resultList;
	}

}

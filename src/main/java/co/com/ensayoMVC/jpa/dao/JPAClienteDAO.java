package co.com.ensayoMVC.jpa.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.sql.DataSource;

import co.com.ensayoMVC.DAO.ClienteDAO;
import co.com.ensayoMVC.model.ClienteDTO;

public class JPAClienteDAO implements ClienteDAO{

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
	
	
	
	public ClienteDTO findByIdCliente(int id) {
		Query query = em.createQuery( "Select new co.com.ensayoMVC.model.ClienteDTO(c.nombre,c.apellido,c.telefono,c.correo) from Cliente c where c.id =:id " );
		query.setParameter( "id", id );
		ClienteDTO result = (ClienteDTO) query.getSingleResult();
		
		return result;
	}

	

}

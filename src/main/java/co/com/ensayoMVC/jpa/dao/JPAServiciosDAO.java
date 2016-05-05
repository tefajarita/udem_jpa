package co.com.ensayoMVC.jpa.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.sql.DataSource;

import org.springframework.stereotype.Repository;

import co.com.ensayoMVC.DAO.ServicioDAO;
import co.com.ensayoMVC.model.BarberoDTO;
import co.com.ensayoMVC.model.ServicioDTO;

@Repository
public class JPAServiciosDAO implements ServicioDAO {
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
	
	public JPAServiciosDAO() {
		
	}
	public List<ServicioDTO> listServicios() {
		Query query = em.createQuery( "Select new co.com.ensayoMVC.model.ServicioDTO(s.nombre,s.descripcion,s.precio,s.foto_servicio) from Servicio s  " );
		   List<ServicioDTO> resultList =  query.getResultList();
		return  resultList;
	}

}
